package com.javacore.oop.encapsulation;

import java.time.LocalDate;

/**
 * Demonstration of Encapsulation principles using three practical examples:
 * 1. PasswordManager - Simple password validation
 * 2. BankAccount - Basic banking operations
 * 3. UserProfile - Complex user management system
 */
public class EncapsulationDemo {

    public static void main(String[] args) {
        System.out.println("=== Encapsulation Examples Demo ===\n");

        // Example 1: PasswordManager
        demonstratePasswordManager();

        // Example 2: BankAccount
        demonstrateBankAccount();

        // Example 3: UserProfile
        demonstrateUserProfile();
    }

    /**
     * Demonstrates PasswordManager - shows validation and data hiding
     */
    private static void demonstratePasswordManager() {
        System.out.println("--- 1. PasswordManager Demo ---");

        PasswordManager pm = new PasswordManager("MyPass123");
        System.out.println("✓ Password set successfully: " + pm.getPassword());

        // Try setting invalid password
        System.out.println("\nAttempting to set invalid password...");
        pm.setPassword("weak"); // Will fail validation

        // Set valid password
        System.out.println("\nSetting new valid password...");
        pm.setPassword("NewSecure456");
        System.out.println("✓ New password set successfully: " + pm.getPassword());

        System.out.println("\n");
    }

    /**
     * Demonstrates BankAccount - shows encapsulation of business rules
     */
    private static void demonstrateBankAccount() {
        System.out.println("--- 2. BankAccount Demo ---");

        BankAccount account = new BankAccount("ACC123", 1000.0);
        System.out.println("✓ Account created: " + account.getAccountNumber());
        System.out.println("  Initial balance: $" + account.getBalance());

        // Valid operation
        account.setBalance(1500.0);
        System.out.println("✓ Balance updated: $" + account.getBalance());

        // Invalid operation - negative balance
        System.out.println("\nAttempting to set negative balance...");
        account.setBalance(-500.0); // Will fail validation
        System.out.println("  Balance remains: $" + account.getBalance());

        System.out.println("\n");
    }

    /**
     * Demonstrates UserProfile - shows complex encapsulation with multiple features
     */
    private static void demonstrateUserProfile() {
        System.out.println("--- 3. UserProfile Demo ---");

        // Create user profile
        UserProfile user = new UserProfile(
            "jdoe",
            "John Doe",
            "jdoe@example.com",
            "hashedPassword123",
            LocalDate.of(1990, 1, 15)
        );

        System.out.println("✓ User created:");
        System.out.println("  ID: " + user.getId());
        System.out.println("  Username: " + user.getUsername());
        System.out.println("  Email: " + user.getEmail());
        System.out.println("  Age: " + user.getAge() + " years");

        // Add roles (defensive copying demonstrated)
        user.addRole("USER");
        user.addRole("ADMIN");
        System.out.println("\n✓ Roles added: " + user.getRoles());

        // Add preferences (encapsulated map operations)
        user.putPreference("theme", "dark");
        user.putPreference("language", "en");
        user.putPreference("notifications", "enabled");
        System.out.println("✓ Preferences set: " + user.getPreferences());

        // Update profile information with validation
        System.out.println("\n✓ Updating profile information...");
        user.setPhone("+1-555-0123");
        user.setCity("New York");
        user.setCountry("USA");
        System.out.println("  Phone: " + user.getPhone());
        System.out.println("  Location: " + user.getCity() + ", " + user.getCountry());

        // Try invalid email (will throw exception)
        System.out.println("\nAttempting to set invalid email...");
        try {
            user.setEmail("invalid-email"); // Missing @ symbol
        } catch (IllegalArgumentException e) {
            System.out.println("  ✗ Validation failed: " + e.getMessage());
        }

        // Show audit timestamps
        System.out.println("\n✓ Audit information:");
        System.out.println("  Created at: " + user.getCreatedAt());
        System.out.println("  Updated at: " + user.getUpdatedAt());
        System.out.println("  Active: " + user.isActive());

        // Display full user object
        System.out.println("\n✓ User Profile Summary:");
        System.out.println("  " + user);

        System.out.println("\n");
    }
}

