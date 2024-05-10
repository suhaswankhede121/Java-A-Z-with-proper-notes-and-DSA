
package mail;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.*;

public class MailSender extends JFrame implements ActionListener {
    // Components
    private JLabel labelFrom, labelPassword, labelTo, labelSubject, labelBody, labelAttachment;
    private JTextField textFieldFrom, textFieldTo, textFieldSubject;
    private JPasswordField passwordField;
    private JTextArea textAreaBody;
    private JButton buttonSend, buttonAttach;
    private JFileChooser fileChooser;
    private String attachmentPath;

    // Constructor
    public MailSender() {
        // Initialize components
        labelFrom = new JLabel("From:");
        labelPassword = new JLabel("Password:");
        labelTo = new JLabel("To:");
        labelSubject = new JLabel("Subject:");
        labelBody = new JLabel("Body:");
        labelAttachment = new JLabel("Attachment:");
        textFieldFrom = new JTextField();
        passwordField = new JPasswordField();
        textFieldTo = new JTextField();
        textFieldSubject = new JTextField();
        textAreaBody = new JTextArea();
        buttonSend = new JButton("Send");
        buttonAttach = new JButton("Attach");
        fileChooser = new JFileChooser();

        // Set layout and add components
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        add(labelFrom, c);
        c.gridx = 1;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(textFieldFrom, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;
        add(labelPassword, c);
        c.gridx = 1;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(passwordField, c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;
        add(labelTo, c);
        c.gridx = 1;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(textFieldTo, c);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;
        add(labelSubject, c);
        c.gridx = 1;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(textFieldSubject, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;
        add(labelAttachment, c);
        c.gridx = 1;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(buttonAttach, c);
        c.gridx = 2;
        c.fill = GridBagConstraints.NONE;
        add(new JLabel(""), c);
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;
        add(labelBody, c);
        c.gridx = 1;
        c.gridy = 5;
        c.gridwidth = 2;
        c.gridheight = 5;
        c.fill = GridBagConstraints.BOTH;
        add(new JScrollPane(textAreaBody), c);
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.NONE;
    add(buttonSend, c);

    // Set button action listeners
    buttonSend.addActionListener(this);
    buttonAttach.addActionListener(this);

    // Set frame properties
    setTitle("Mail Sender");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    setLocationRelativeTo(null);
    setVisible(true);
}

// Action listener for buttons
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == buttonSend) {
        sendEmail();
    } else if (e.getSource() == buttonAttach) {
        attachFile();
    }
}

// Method to send email
private void sendEmail() {
    String from = textFieldFrom.getText();
    String password = new String(passwordField.getPassword());
    String to = textFieldTo.getText();
    String subject = textFieldSubject.getText();
    String body = textAreaBody.getText();

    // Set SMTP properties
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // Get session
    Session session = Session.getInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
        }
    });

    try {
        // Create message
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);

        // Create multipart message
        Multipart multipart = new MimeMultipart();

        // Add body part
        BodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(body, "text/html");
        multipart.addBodyPart(bodyPart);

        // Add attachment part
        if (attachmentPath != null) {
            BodyPart attachmentPart = new MimeBodyPart();
            DataSource source = new FileDataSource(attachmentPath);
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName(new File(attachmentPath).getName());
            multipart.addBodyPart(attachmentPart);
        }

        // Set multipart message
        message.setContent(multipart);

        // Send message
        Transport.send(message);

        // Display success message
        JOptionPane.showMessageDialog(this, "Mail sent successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (MessagingException ex) {
        // Display error message
        JOptionPane.showMessageDialog(this, "Error sending mail: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Method to attach file
private void attachFile() {
    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        attachmentPath = file.getAbsolutePath();
    }
}

// Main method
public static void main(String[] args) {
    new MailSender();
}
}


