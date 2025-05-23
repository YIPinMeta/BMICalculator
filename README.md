# BMI Calculator

A simple Java console application that calculates your Body Mass Index (BMI) based on your weight and height, and provides a health classification based on the result.

## 📋 Features

- Accepts **weight in kilograms** and **height in meters** as input
- Calculates BMI using the formula:  
  \[
  \text{BMI} = \frac{\text{weight}}{\text{height}^2}
  \]
- Provides BMI interpretation:
  - **Underweight**: BMI < 18.5  
  - **Normal weight**: 18.5 ≤ BMI < 24.9  
  - **Overweight**: 25 ≤ BMI < 29.9  
  - **Obese**: BMI ≥ 30  

## 🚀 Getting Started

### Requirements

- Java installed (JDK 8 or higher)

### How to Compile

```bash
javac BMICalc.java
```

### How to Run

```bash
java BMICalc
```

## 🖥️ Example

```
Enter your weight in kilograms: 68
Enter your height in meters: 1.70
Your BMI is: 23.529411764705884
You have a normal weight.
```

## 💡 How It Works

1. The program prompts the user to input their weight and height.
2. It calculates the BMI using the formula.
3. Based on the BMI value, it categorizes the user's weight status.

## 🧠 Tip

To improve or expand the program:
- Add input validation (e.g., check for negative numbers)
- Support imperial units (pounds and inches)
- Round the BMI result to 2 decimal places for clarity

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
