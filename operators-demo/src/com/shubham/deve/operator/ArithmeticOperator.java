package com.shubham.deve.operator;

import java.util.Scanner;

public class ArithmeticOperator {

    //attributes and operands.
    int firstNumber;
    int secondNumber;

    //behaviours or methods.
    void addition(){
       int total = firstNumber + secondNumber;
        System.out.println("the total of 2 number is : " + total);
    }

    void subtraction(){
        int subtraction = firstNumber - secondNumber;
        System.out.println("the subtraction of 2 number is : " + subtraction);
    }

    void multiplication(){
        int multiplication = firstNumber * secondNumber;
        System.out.println("the multiplication of 2 number is : " + multiplication);
    }

    void division(){
        int division = firstNumber / secondNumber;
        System.out.println("the division of 2 number is : " + division);
    }

    void modulation(){
        int modulation = firstNumber % secondNumber;
        System.out.println("the remainder of 2 number is : " + modulation);
    }


    public static void main(String[] args){
        System.out.println("Plase enter 2 values : ");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        ArithmeticOperator arithmeticOperator = new ArithmeticOperator();
        arithmeticOperator.firstNumber = Integer.valueOf(firstInput);
        arithmeticOperator.secondNumber = Integer.valueOf(secondInput);

        arithmeticOperator.addition(); // 5 + 4 = 9
        arithmeticOperator.subtraction(); // 5 - 4 = 1
        arithmeticOperator.multiplication(); // 5 * 4 = 20
        arithmeticOperator.division(); // 5 / 4 = 1
        arithmeticOperator.modulation(); // 5 % 4 = 1
    }
}
