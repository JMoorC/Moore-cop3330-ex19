/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        while (!inScan.hasNextInt() ){
            inScan.nextLine();
            System.out.print("Whole values only.\nEnter your height in inches: ");
        }
        int height = inScan.nextInt();

        System.out.print("Enter your weight in pounds: ");
        while (!inScan.hasNextInt() ){
            inScan.nextLine();
            System.out.print("Whole values only.\nEnter your weight in pounds: ");
        }
        int weight = inScan.nextInt();

        double bmi = ( (double) weight / (height * height) ) * 703;
        System.out.printf("Your bmi is %.1f.\n", bmi);
        if (bmi > 25){
            System.out.println("You are overweight. You should see your doctor.");
            System.exit(0);
        }
        if (bmi < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
            System.exit(0);
        }
        System.out.println("You are within the ideal weight reange.");


    }
}
