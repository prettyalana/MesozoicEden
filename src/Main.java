import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrance Sign
        // Create scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.println("Please enter your name: ");

        // Read the line as a String
        String name = scanner.nextLine();

        // Print the welcome message with the User input name
        System.out.println("Welcome, " + name + " to Mesozoic Eden!");

        // Opening and closing hours
        String openingHours = "8:00 AM";
        String closingHours = "9:00 PM";

        // Print the opening and closing hours
        System.out.println("Mesozoic Eden Hours: ");
        System.out.println("Mesozoic Eden opens at: " + openingHours);
        System.out.println("Mesozoic Eden closes at: " + closingHours);

        // Warning message
        System.out.println("Please don't fear, Mesozoic Eden is safe and secure!");

        // Dinosaur Info
        String[] dinosaurBreeds = {"Tyrannosaurus rex", "Triceratops", "Velociraptor"};
        int dinosaurHeight = 12;
        int dinosaurLength = 40;
        int dinosaurWeight = 9_000;

        // Dinosaur Info cont...
        int dinosaurAge = 66_000_000;
        String dinosaurName = "Tommy T. Rex";
        boolean isCarnivore = true;


        // Print the dinosaur info
        System.out.println("T. rex Info: " + "breed: " + dinosaurBreeds[0] + " height: " + dinosaurHeight + " length: " + dinosaurLength + " weight: " + dinosaurWeight);

        // Print the dinosaur info cont...
        System.out.println("T. rex Info: " + "age: " + dinosaurAge + " name: " + dinosaurName + " carnivore: " + isCarnivore );

        // Max visitors
        int maxVisitors = 300;

        // Print the max visitors allowed in Mesozoic Eden per day
        System.out.println("There's a maximum of " + maxVisitors + " people allowed in Mesozoic Eden");

        // Employee info
        String employeeName = "Maddie";
        int employeeAge = 30;

        // Print employee info
        System.out.println("Employee name: " + employeeName + " age: " + employeeAge);


    }
}
