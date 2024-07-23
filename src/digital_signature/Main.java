package digital_signature;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        try {
            // Generate Key Pairs for Alice and Bob
            KeyPair aliceKeyPair = KeyGenerator.generateKeyPair();
            KeyPair bobKeyPair = KeyGenerator.generateKeyPair();
            
            // Extract Alice's keys
            PrivateKey alicePrivateKey = aliceKeyPair.getPrivate();
            PublicKey alicePublicKey = aliceKeyPair.getPublic();
            
            // Extract Bob's keys
            PrivateKey bobPrivateKey = bobKeyPair.getPrivate();
            PublicKey bobPublicKey = bobKeyPair.getPublic();

            // Alice's Message
            String message = "Hello, Bob! This is a signed message.";
            System.out.println("Alice Message: " + message);

            // Alice Creates a Digital Signature for the message
            byte[] signature = SignVerifyExample.createSignature(message, alicePrivateKey);
            System.out.println("Alice Signature: " + SignVerifyExample.encodeToBase64(signature));
            System.out.println("Alice Public key: " +alicePublicKey);
            
            
            // Bob Receives the message and the signature
            // Bob verifies the digital signature using Alice's public key
            boolean isVerified = SignVerifyExample.verifySignature(message, signature, alicePublicKey);
            System.out.println("Signature Verified: " + isVerified);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
