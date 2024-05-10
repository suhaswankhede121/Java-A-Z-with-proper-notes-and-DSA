import java.awt.*;
import java.awt.event.*;

public class BloodDonationForm extends Frame implements ActionListener {
  private Label nameLabel, ageLabel, bloodGroupLabel, lastDonationLabel, donateLabel;
  private TextField nameField, ageField, bloodGroupField, lastDonationField;
  private Checkbox yesCheckbox, noCheckbox;
  private Button submitButton;

  public BloodDonationForm() {
    setLayout(new GridLayout(5, 2));

    nameLabel = new Label("Name:");
    ageLabel = new Label("Age:");
    bloodGroupLabel = new Label("Blood Group:");
    lastDonationLabel = new Label("Last Donation:");
    donateLabel = new Label("Are you ready to donate?");

    nameField = new TextField();
    ageField = new TextField();
    bloodGroupField = new TextField();
    lastDonationField = new TextField();

    yesCheckbox = new Checkbox("Yes");
    noCheckbox = new Checkbox("No");

    submitButton = new Button("Submit");
    submitButton.addActionListener(this);

    add(nameLabel);
    add(nameField);
    add(ageLabel);
    add(ageField);
    add(bloodGroupLabel);
    add(bloodGroupField);
    add(lastDonationLabel);
    add(lastDonationField);
    add(donateLabel);
    add(yesCheckbox);
    add(new Label());
    add(noCheckbox);
    add(new Label());
    add(submitButton);

    setTitle("Blood Donation Form");
    setSize(300, 200);
    //setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String name = nameField.getText();
    int age = Integer.parseInt(ageField.getText());
    String bloodGroup = bloodGroupField.getText();
    String lastDonation = lastDonationField.getText();
    String donate = "";
    if (yesCheckbox.getState()) {
      donate = "Yes";
    } else if (noCheckbox.getState()) {
      donate = "No";
    }
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Blood Group: " + bloodGroup);
    System.out.println("Last Donation: " + lastDonation);
    System.out.println("Ready to donate: " + donate);
  }

  public static void main(String[] args) {
    new BloodDonationForm();
  }
}
