import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;

public class Bob {
    private Key AESkey;
    private Key RSApubkey;
    private byte[] keyBytes;

    public void setKeyBytes(byte[] keyBytes) {
        this.keyBytes = keyBytes;
    }

    public void setAESkey(Key AESkey) {
        this.AESkey = AESkey;
    }

    public void setRSApubkey(Key RSApubkey) {
        this.RSApubkey = RSApubkey;
    }

    public void decodeAES(byte[] result){

        try {
            SecretKey secretKey = new SecretKeySpec(keyBytes,"AES");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            byte[] res = cipher.doFinal(result);

            System.out.println("Decoding:");
            System.out.println(new String(res));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] encodeRSA(byte[] result){

        byte[] cipherText = null;
        try {

         Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");


        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, RSApubkey);

        //Add data to the cipher

        cipher.update(result);

        //encrypting the data
        cipherText = cipher.doFinal();
        System.out.println("Encoding:");
        System.out.println( new String(cipherText, "UTF8"));







        } catch (Exception e) {
            e.printStackTrace();
        }


        return cipherText;
    }


    public void validateSign(byte[] signature){

        try {
            Signature sign = Signature.getInstance("SHA256withRSA");

            String s = "Hi, how are you";
            sign.initVerify((PublicKey) RSApubkey);
            sign.update(s.getBytes());



            boolean bool = sign.verify(signature);

            if(bool) {
                System.out.println("Signature verified");
            } else {
                System.out.println("Signature failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
