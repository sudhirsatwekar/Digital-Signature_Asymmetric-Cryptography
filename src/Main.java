import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        	//Generate Keys(key pair=public and private key pairs)
            System.out.println("Generate Key Pairs for Alice and Bob");
            KeyPair aliceKeyPair = KeyGenerator.generateKeyPair();
            System.out.println(aliceKeyPair+"aliceKeyPair");
            KeyPair bobKeyPair = KeyGenerator.generateKeyPair();
            System.out.println(aliceKeyPair+"bobKeyPair");
            
            System.out.println("=======================================");
            // Extract Keys
            
            //public keysused to encrypt data or verify signatures.
            //Public keys are not secret and are designed to work with their paired private key.
            PublicKey alicePublicKey = aliceKeyPair.getPublic();
            //private key is kept confidential and should only be known by the key's owner
            //It is used to decrypt data or create digital signatures
            PrivateKey alicePrivateKey = aliceKeyPair.getPrivate();
            PublicKey bobPublicKey = bobKeyPair.getPublic();
            PrivateKey bobPrivateKey = bobKeyPair.getPrivate();

            // Print Keys
            System.out.println("Alice's Public Key: " + GetKeys.encodeToBase64(alicePublicKey.getEncoded()));
            System.out.println("Alice's Private Key: " + GetKeys.encodeToBase64(alicePrivateKey.getEncoded()));
            System.out.println("Bob's Public Key: " + GetKeys.encodeToBase64(bobPublicKey.getEncoded()));
            System.out.println("Bob's Private Key: " + GetKeys.encodeToBase64(bobPrivateKey.getEncoded()));
            System.out.println("=======================================");
      
            //Send message   
            System.out.println("Alice's Message");
            Scanner sc=new Scanner(System.in);
            System.out.println("alice:please enter message to send");
            String message = sc.nextLine();
            System.out.println("Original Message: " + message);
            sc.close();
            System.out.println("=======================================");
            
            
           //encrypted message
           System.out.println("Alice Encrypts the message using Bob's Public Key");
            byte[] encryptedMessage = EncryptDecrypt.encrypt(message, bobKeyPair.getPublic());
            System.out.println("Encrypted Message: " + new String(encryptedMessage));
            System.out.println("=======================================");
            
            //decrypted message
            System.out.println(" Bob Decrypts the message using his Private Key");
            String decryptedMessage = EncryptDecrypt.decrypt(encryptedMessage, bobKeyPair.getPrivate());
            System.out.println("Decrypted Message: " + decryptedMessage);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
