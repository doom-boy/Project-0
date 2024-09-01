//author: Elijah Chan
//Filename: Lab1.java
//Specification: Find average test grade from 3 tests
//For: CS 1400- Lab #1
//Time Spent: 20 minutes


import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        
        int test1;
        int test2;
        int test3; 
        final int NUM_TEST = 3;
        double average; 
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the score on the 1 test: ");
        test1 = keyboard.nextInt();
        
        System.out.print("\nEnter the score on the 2 test: ");
        test2 = keyboard.nextInt();
        
        System.out.print("\nEnter the score on the 3 test: ");
        test3 = keyboard.nextInt();
        
        average = (test1 + test2 + test3) / (double) NUM_TEST;
        
        System.out.println("\nThe average test score is " + average);
        
        keyboard.close();
        
        
    }

}