// 3. Lambda Expressions
// Activity: Calculator with Lambdas
 
// Task:
 
// Create a functional interface Calculator with method int operate(int a, int b)
 
// Use lambda expressions to:
 
// Add
 
// Subtract
 
// Multiply
 
// Divide
 
// Create a method that takes two numbers and a Calculator instance and prints the result
 
// Example:
 
// java
// Copy
// Edit
// Calculator add = (a, b) -> a + b;
// Goal: Practice passing behavior (functions) using lambdas.


interface Calculator {
    int operate(int a, int b);
}

public class CalculatorLambda {


    public static void calculate(int a, int b, Calculator operation) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> b != 0 ? a / b : 0;

       
        calculate(10, 5, add);       
        calculate(10, 5, subtract);  
        calculate(10, 5, multiply); 
        calculate(10, 5, divide);    
    }
}
