import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class VideoSteganography extends JFrame implements ActionListener {
  private JTextField inputVideoField;
  private JTextField inputFileField;
  private JTextField outputVideoField;
  private JTextField outputFileField;
  private JButton chooseInputVideoButton;
  private JButton chooseInputFileButton;
  private JButton chooseOutputVideoButton;
  private JButton hideButton;
  private JButton extractButton;

  public VideoSteganography() {
    super("Video Steganography");

    // Create the input video field and label
    JLabel inputVideoLabel = new JLabel("Input Video:");
    inputVideoField = new JTextField(20);
    inputVideoField.setEditable(false);
    chooseInputVideoButton = new JButton("Choose");
    chooseInputVideoButton.addActionListener(this);

    // Create the input file field and label
    JLabel inputFileLabel = new JLabel("Input File:");
    inputFileField = new JTextField(20);
    inputFileField.setEditable(false);
    chooseInputFileButton = new JButton("Choose");
    chooseInputFileButton.addActionListener(this);

    // Create the output video field and label
    JLabel outputVideoLabel = new JLabel("Output Video:");
    outputVideoField = new JTextField(20);
    outputVideoField.setEditable(false);
    chooseOutputVideoButton = new JButton("Choose");
    chooseOutputVideoButton.addActionListener(this);

    // Create the hide and extract buttons
    hideButton = new JButton("Hide");
    hideButton.addActionListener(this);
    extractButton = new JButton("Extract");
    extractButton.addActionListener(this);

    // Add the components to the content pane
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(5, 5, 5, 5);
    c.gridx = 0;
    c.gridy = 0;
    contentPane.add(inputVideoLabel, c);
    c.gridx = 1;
    contentPane.add(inputVideoField, c);
    c.gridx = 2;
    contentPane.add(chooseInputVideoButton, c);
    c.gridx = 0;
    c.gridy = 1;
    contentPane.add(inputFileLabel, c);
    c.gridx = 1;
    contentPane.add(inputFileField, c);
    c.gridx = 2;
    contentPane.add(chooseInputFileButton, c);
    c.gridx = 0;
    c.gridy = 2;
    contentPane.add(outputVideoLabel, c);
    c.gridx = 1;
    contentPane.add(outputVideoField, c);
    c.gridx = 2;
    contentPane.add(chooseOutputVideoButton, c);
c.gridx = 0;
c.gridy = 3;
contentPane.add(hideButton, c);
c.gridx = 1;
contentPane.add(extractButton, c);
}

public void actionPerformed(ActionEvent e) {
if (e.getSource() == chooseInputVideoButton) {
JFileChooser fileChooser = new JFileChooser();
int returnValue = fileChooser.showOpenDialog(this);
if (returnValue == JFileChooser.APPROVE_OPTION) {
File selectedFile = fileChooser.getSelectedFile();
inputVideoField.setText(selectedFile.getAbsolutePath());
}
} else if (e.getSource() == chooseInputFileButton) {
JFileChooser fileChooser = new JFileChooser();
int returnValue = fileChooser.showOpenDialog(this);
if (returnValue == JFileChooser.APPROVE_OPTION) {
File selectedFile = fileChooser.getSelectedFile();
inputFileField.setText(selectedFile.getAbsolutePath());
}
} else if (e.getSource() == chooseOutputVideoButton) {
JFileChooser fileChooser = new JFileChooser();
int returnValue = fileChooser.showSaveDialog(this);
if (returnValue == JFileChooser.APPROVE_OPTION) {
File selectedFile = fileChooser.getSelectedFile();
outputVideoField.setText(selectedFile.getAbsolutePath());
}
} else if (e.getSource() == hideButton) {
// Implement the hiding logic here
} else if (e.getSource() == extractButton) {
// Implement the extraction logic here
}
else if (e.getSource() == extractButton) {
  try {
    String inputVideo = inputVideoField.getText();
    String outputFile = outputFileField.getText();

    if (inputVideo.isEmpty() || outputFile.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please choose the input video file and the output file.", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }

    File videoFile = new File(inputVideo);
    File outputDataFile = new File(outputFile);

    int videoSize = (int) videoFile.length();

    // Read the video file into a byte array
    byte[] videoData = new byte[videoSize];
    FileInputStream videoStream = new FileInputStream(videoFile);
    videoStream.read(videoData);
    videoStream.close();

    // Extract the data from the least significant bit of each byte of the video
    int dataSize = 0;
    int dataBitIndex = 7;
    byte[] data = new byte[videoSize / 8];
    for (int i = 0; i < videoSize; i++) {
      int videoByte = videoData[i] & 0xff;
      int dataByte = data[dataSize] & 0xff;

      data[dataSize] = (byte) (dataByte | ((videoByte & 1) << dataBitIndex));

      dataBitIndex--;
      if (dataBitIndex < 0) {
        dataBitIndex = 7;
        dataSize++;
      }
    }

    // Write the extracted data to the output file
    FileOutputStream outputStream = new FileOutputStream(outputDataFile);
    outputStream.write(data, 0, dataSize);
    outputStream.close();

    JOptionPane.showMessageDialog(this, "Data extracted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
  } catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(this, "An error occurred while extracting the data.", "Error", JOptionPane.ERROR_MESSAGE);
  }
}

}
public static void main(String[] args) {
VideoSteganography frame = new VideoSteganography();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
}
