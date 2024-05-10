import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.crypto.*;
import java.security.*;
import java.io.*;
import java.util.Base64;

public class VideoEncryptionDecryption extends JFrame implements ActionListener {
  private JButton encryptButton, decryptButton;
  private JTextField inputFileField, outputFileField, passwordField;
  private JLabel inputFileLabel, outputFileLabel, passwordLabel;
  private Container container;

  public VideoEncryptionDecryption() {
    super("Video Encryption and Decryption");

    // Set up the encrypt button
    encryptButton = new JButton("Encrypt");
    encryptButton.setBounds(25, 75, 100, 25);
    encryptButton.addActionListener(this);

    // Set up the decrypt button
    decryptButton = new JButton("Decrypt");
    decryptButton.setBounds(135, 75, 100, 25);
    decryptButton.addActionListener(this);

    // Set up the input file text field
    inputFileField = new JTextField();
    inputFileField.setBounds(25, 25, 200, 25);

    // Set up the input file label
    inputFileLabel = new JLabel("Input File:");
    inputFileLabel.setBounds(25, 10, 100, 25);

    // Set up the output file text field
    outputFileField = new JTextField();
    outputFileField.setBounds(25, 125, 200, 25);

    // Set up the output file label
    outputFileLabel = new JLabel("Output File:");
    outputFileLabel.setBounds(25, 110, 100, 25);

    // Set up the password text field
    passwordField = new JTextField();
    passwordField.setBounds(25, 200, 200, 25);

    // Set up the password label
    passwordLabel = new JLabel("Password:");
    passwordLabel.setBounds(25, 185, 100, 25);

    // Set up the container
    container = getContentPane();
    container.setLayout(null);
    container.add(encryptButton);
    container.add(decryptButton);
    container.add(inputFileField);
    container.add(inputFileLabel);
    container.add(outputFileField);
    container.add(outputFileLabel);
    container.add(passwordField);
    container.add(passwordLabel);

    // Set up the frame
    setSize(250, 300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent event) {
    Object source = event.getSource();

    if (source == encryptButton) {
      try {
        // Get the input file, output file, and password
        String inputFile = inputFileField.getText();
        String outputFile = outputFileField.getText();
        String password = passwordField.getText();

        // Encrypt the file
        encrypt(inputFile, outputFile, password);

        JOptionPane.showMessageDialog(this, "File encrypted successfully");
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Encryption failed.");
      }
    } else if (source == decryptButton) {
      try {
        // Get the input file, output file, and password
        String inputFile = inputFileField.getText();
        String outputFile = outputFileField.getText();
        String password = passwordField.getText();

        // Decrypt the file
        decrypt(inputFile, outputFile, password);

        JOptionPane.showMessageDialog(this, "File decrypted successfully");
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Decryption failed.");
      }
    }
  }

  private void encrypt(String inputFile, String outputFile, String password) throws Exception {
    Key secretKey = getKey(password);

    Cipher cipher = Cipher.getInstance("AES");
    cipher.init(Cipher.ENCRYPT_MODE, secretKey);

    FileInputStream inputStream = new FileInputStream(inputFile);
    byte[] inputBytes = new byte[(int) inputFile.length()];
    inputStream.read(inputBytes);

    byte[] outputBytes = cipher.doFinal(inputBytes);

    FileOutputStream outputStream = new FileOutputStream(outputFile);
    outputStream.write(outputBytes);

    inputStream.close();
    outputStream.close();
  }

  private void decrypt(String inputFile, String outputFile, String password) throws Exception {
    Key secretKey = getKey(password);

    Cipher cipher = Cipher.getInstance("AES");
    cipher.init(Cipher.DECRYPT_MODE, secretKey);

    FileInputStream inputStream = new FileInputStream(inputFile);
    byte[] inputBytes = new byte[(int) inputFile.length()];
    inputStream.read(inputBytes);

    byte[] outputBytes = cipher.doFinal(inputBytes);

    FileOutputStream outputStream = new FileOutputStream(outputFile);
    outputStream.write(outputBytes);

    inputStream.close();
    outputStream.close();
  }

  private Key getKey(String password) throws Exception {
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] keyBytes = password.getBytes("UTF-8");
    keyBytes = digest.digest(keyBytes);

    return new SecretKeySpec(keyBytes, "AES");
  }

  public static void main(String[] args) {
    VideoEncryptionDecryption app = new VideoEncryptionDecryption();
  }
}
