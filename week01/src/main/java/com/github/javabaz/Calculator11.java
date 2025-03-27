package com.github.javabaz;

public class Calculator11 {


    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error! Division by zero");
            //edited by behnaz
        }
        return a / b;
    }
}

