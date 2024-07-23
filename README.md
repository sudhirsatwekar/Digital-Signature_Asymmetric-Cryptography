# Digital Signature and Encryption in Java(default package)

This project demonstrates how to use Java to generate key pairs, encrypt messages, and decrypt messages using RSA. It involves two users, Alice and Bob, where Alice sends an encrypted message to Bob, and Bob decrypts the message using his private key.

 Features

- Generate RSA key pairs for Alice and Bob.
- Extract and display the public and private keys.
- Encrypt a message from Alice using Bob's public key.
- Decrypt the encrypted message using Bob's private key.

 Prerequisites

- Java Development Kit (JDK) 8 or higher.

 Getting Started

1. Clone the repository
```sh
git clone https://github.com/yourusername/digital-signature-java.git
cd digital-signature-java

Getting Started
javac Main.java KeyGenerator.java EncryptDecrypt.java GetKeys.java

Run the application
java Main

-----------------------------------------------------------------------------------------------------------------------------------------------------
# Digital Signature and Encryption in Java(creating/verifying digital signature)

This repository contains a simple example of using digital signatures in Java, demonstrating how one user (Alice) 
can sign a message and another user (Bob) can verify the signature. The example uses RSA for generating key pairs
and creating/verifying digital signatures.

## Project Structure

- `src/`
  - `Main.java` (Simulates Alice sending a signed message to Bob)
  - `KeyGenerator.java` (Generates RSA key pairs)
  - `SignVerifyExample.java` (Contains methods for signing and verifying messages)


