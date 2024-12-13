package com.mycompany.trafficmanagementsystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    private static int adminCount = 0; 
    private static int ownerCount = 0; 
    private static int trafficOfficerCount = 0; 
    private static List<Person> admin = new ArrayList<>(); 
    private static List<Person> owner = new ArrayList<>(); 
    private static List<Person> trafficOfficer = new ArrayList<>(); 
    private static final String adminSerial = "@ismaela7med";
    
    public static void registerNewUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select what type of user you are: \n(1. Admin\t2. Vehicle Owner\t3. Officer)");

        try {
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            
            if (choice == 1) {
                System.out.print("Enter the special serial code to register as an Admin: ");
                String serialCode = scanner.nextLine();

                if (!serialCode.equals(adminSerial)) {
                    System.out.println("Invalid serial code. You cannot register as an Admin.");
                    return;
                }
            }

            
            String userID = generateUserID(choice);

            
            System.out.print("Enter User Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            
            Person user = new Person(userID, name, email, password);

            switch (choice) {
                case 1:
                    admin.add(user); 
                    break;
                case 2:
                    owner.add(user); 
                    break;
                case 3:
                    trafficOfficer.add(user); 
                    break;
                default:
                    System.out.println("Invalid choice. User not registered.");
                    return;
            }

            
            saveUserToFile(user, choice);

            System.out.println("User registered successfully! User ID: " + userID);
        } catch (Exception e) {
            System.out.println("An error occurred while registering the user: " + e.getMessage());
        }
    }

    
    private static String generateUserID(int choice) {
        String userID = "";
        switch (choice) {
            case 1: // Admin
                adminCount++;
                userID = "A" + adminCount; 
                break;
            case 2: // Vehicle Owner
                ownerCount++;
                userID = "O" + ownerCount; 
                break;
            case 3: // Officer
                trafficOfficerCount++;
                userID = "T" + trafficOfficerCount; 
                break;
            default:
                throw new IllegalArgumentException("Invalid user type.");
        }
        return userID;
    }

    // Method to save user details to a file
    private static void saveUserToFile(Person user, int userType) {
    try (FileWriter writer = new FileWriter("users.txt", true)) {
        // Write user information to the file in CSV format
        writer.write(user.getID() + "," + user.getName() + "," + user.getContactInfo() + "," + user.getPassword() + "," + userType + "\n");
    } catch (IOException e) {
        System.out.println("An error occurred while saving user information: " + e.getMessage());
    }
}

public static void loginUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your user type to log in: \n(1. Admin\t2. Vehicle Owner\t3. Officer)");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            
            boolean loginSuccess = validateLoginFromFile(email, password, choice);

            if (loginSuccess) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid email or password.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during login: " + e.getMessage());
        }
    }

    private static boolean validateLoginFromFile(String email, String password, int userType) {
    try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
        String line;

        while ((line = reader.readLine()) != null) {
            String[] details = line.split(",");

            
            if (details.length < 5) continue;

            String storedEmail = details[2].trim();
            String storedPassword = details[3].trim();
            int storedType = Integer.parseInt(details[4].trim());

            
            if (storedEmail.equalsIgnoreCase(email.trim()) && storedPassword.equals(password.trim()) && storedType == userType) {
                return true; 
            }
        }
    } catch (IOException e) {
        System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
    return false; 
}

}

