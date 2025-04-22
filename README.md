BMI Calculator in Java
This is a simple Java program that calculates a person's Body Mass Index (BMI) based on user input. It then interprets the result and categorizes it into underweight, normal weight, overweight, or obese.

Features
Takes user input for weight (in kilograms) and height (in meters)

Calculates BMI using the formula:

BMI
=
weight
height
2
BMI= 
height 
2
 
weight
​
 
Categorizes BMI according to standard health guidelines:

Underweight: BMI < 18.5

Normal weight: 18.5 ≤ BMI < 24.9

Overweight: 25 ≤ BMI < 29.9

Obese: BMI ≥ 30

Getting Started
Prerequisites
Java Development Kit (JDK) installed on your system

How to Compile
Navigate to the folder containing the BMICalc.java file and compile the program using:

bash
Copy code
javac BMICalc.java
How to Run
Once compiled, run the program with:

bash
Copy code
java BMICalc
Sample Usage
plaintext
Copy code
Enter your weight in kilograms: 70
Enter your height in meters: 1.75
Your BMI is: 22.857142857142858
You have a normal weight.
Code Highlights
Uses Scanner for user input

Includes proper BMI classification with conditionals

Closes the scanner to avoid resource leaks

License
This project is open source and available under the MIT License.# BMICalculator
