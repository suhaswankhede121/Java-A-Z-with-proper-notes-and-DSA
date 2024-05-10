

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordValidator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String username, password;
		
		// Get username and password from user
		System.out.print("Enter username: ");
		username = input.nextLine();
		System.out.print("Enter password: ");
		password = input.nextLine();
		
		// Validate password using regular expressions
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[A-Z]).{8,}$");
		Matcher matcher = pattern.matcher(password);
		
		if (matcher.matches()) {
			// Save username and password to file
			try {
				FileWriter writer = new FileWriter("passwords.txt", true);
				writer.write(username + ":" + password + "\n");
				writer.close();
				System.out.println("Username and password saved to file.");
			} catch (IOException e) {
				System.out.println("Error writing to file.");
			}
		} else {
			System.out.println("Invalid password. Password must have at least 8 characters, one digit, one special character, and one capital letter.");
		}
		
		input.close();
	}
}
