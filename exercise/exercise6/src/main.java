import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

public class main {
    public static void main(String[] args){
        Alice alice = new Alice();
        Bob bob = new Bob();

        //Demonstrate symmetric
        System.out.println("Demonstrate symmetric encryption and decryption:");
        alice.encodeAES("Hello Java");
        byte[] encode = alice.getAESresult();
        bob.setKeyBytes(alice.getKeyBytes());
        bob.decodeAES(encode);

        System.out.println();


        // Demonstrate asymmetric
        System.out.println("Demonstrate asymmetric encryption and decryption:");
        //Alice generate publicKey and privateKey
        alice.generateKey();
        // Alice send publicKey to Bob
        Key publicKey = alice.getRSApubkey();
        bob.setRSApubkey(publicKey);

        //Bob encode through publicKey
        String s = "Hello Java";
        byte[] encodeRSA = bob.encodeRSA(s.getBytes());

        //Alice decode through privateKey
        alice.decodeRSA(encodeRSA);

        System.out.println();


        // Verify Signature
        System.out.println("Verify Signature");
        byte[] signature = alice.gengerateSign();
        bob.validateSign(signature);




    }
}
