package day4;

import java.util.Scanner;

public class BMICalc {


		public static void main(String[] args) {
		
			 Scanner input = new Scanner(System.in);

		        // Ask user for weight and height
		        System.out.print("Enter your weight in kilograms: ");
		        double weight = input.nextDouble();

		        System.out.print("Enter your height in meters: ");
		        double height = input.nextDouble();

		        // Calculate BMI
		        double bmi = weight / (height * height);

		        // Display BMI
		        System.out.println("Your BMI is: " + bmi);

		        // Interpret BMI result
		        if (bmi < 18.5) {
		            System.out.println("You are underweight.");
		        } else if (bmi >= 18.5 && bmi < 24.9) {
		            System.out.println("You have a normal weight.");
		        } else if (bmi >= 25 && bmi < 29.9) {
		            System.out.println("You are overweight.");
		        } else {
		            System.out.println("You are obese.");
		        }

		        input.close();
		    
		}

	}

		
		

