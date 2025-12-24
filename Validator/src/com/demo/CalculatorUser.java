package com.demo;

public class CalculatorUser {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int sum = calculator.add(a, b);
        System.out.println("Sum of two numbers are "+sum);
        int difference = calculator.sub(a, b);
        System.out.println("Difference of two numbers are "+difference);
    }


}
