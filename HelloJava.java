/*
 * File Name   : HelloJava.java
 * Author      : Raveendhar
 * Description : Basic Java program demonstrating
 *               comments, formatting, and command-line arguments
 */

public class HelloJava {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Print a welcome message
        System.out.println("Hello, Java World!");

        // Check if command-line arguments are passed
        if (args.length > 0) {

            System.out.println("Command-line arguments received:");

            // Loop through each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }

        } else {
            // Message when no arguments are provided
            System.out.println("No command-line arguments provided.");
        }
    }
}
