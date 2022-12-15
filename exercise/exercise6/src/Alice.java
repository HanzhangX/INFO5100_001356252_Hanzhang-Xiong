import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

public class Alice {

     private byte[] AESresult;
     private Key AESkey;
     private Key RSApubkey;
     private Key RSAprikey;
     private byte[] keyBytes;

    public Key getRSApubkey() {
        return RSApubkey;
    }

    public byte[] getAESresult() {
        return AESresult;
    }

    public Key getAESkey() {
        return AESkey;
    }

    public byte[] getKeyBytes() {
        return keyBytes;
    }

    public void encodeAES(String s){
        try {

            // 生成KEY
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            // 产生密钥
            SecretKey secretKey = keyGenerator.generateKey();
            // 获取密钥
            keyBytes = secretKey.getEncoded();


            // KEY转换
            AESkey = new SecretKeySpec(keyBytes, "AES");

            String src = s;
            // 加密
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, AESkey);
            AESresult = cipher.doFinal(src.getBytes());

            System.out.println("Encoding:");
            System.out.println(AESresult.toString());




        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void generateKey(){

        KeyPairGenerator keyPairGen = null;
        try {
            keyPairGen = KeyPairGenerator.getInstance("RSA");


        keyPairGen.initialize(2048);

        KeyPair pair = keyPairGen.generateKeyPair();

        RSApubkey = pair.getPublic();
        RSAprikey = pair.getPrivate();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }


    public void decodeRSA(byte[] encode){

        try {

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

            cipher.init(Cipher.DECRYPT_MODE,RSAprikey);
            byte[] text = cipher.doFinal(encode);

            System.out.println("Decoding:");
            System.out.println(new String(text));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] gengerateSign(){
        byte[] signature = null;
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");

            sign.initSign((PrivateKey) RSAprikey);
            String s = "Hi, how are you";
            sign.update(s.getBytes());

            signature = sign.sign();


            //
//            sign.initVerify((PublicKey) RSApubkey);
//            sign.update(s.getBytes());
//
//            boolean bool = sign.verify(signature);
//
//            if(bool) {
//                System.out.println("Signature verified");
//            } else {
//                System.out.println("Signature failed");
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return signature;
    }

}
