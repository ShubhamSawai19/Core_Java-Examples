package com.shubham.deve.operator;

import java.util.Scanner;

public class UnaryOperator {

    //attributes and operands.
    int firstNumber = 0;

    //behaviours or methods.preIncrementing the value.
    void preIncrement(int input){
        System.out.println("preIncrement : " + ++input);
        System.out.println("After preIncrement : " + input);
    }

    //behaviours or methods.postIncrementing the value
    void postIncrement(int input){
        System.out.println("postIncrement : " + input++);
        System.out.println("After postIncrement : " + input);
    }

    //behaviours or methods.preDecrementing the value
    void preDecrement(int input){
        System.out.println("preDecrement : " + --input);
        System.out.println("After preDecrement : " + input);
    }

    //behaviours or methods.postDecrementing the value
    void postDecrement(int input){
        System.out.println("postDecrement : " + input--);
        System.out.println("After postDecrement : " + input);
    }

    public static void main(String[] args){
        System.out.println("Plase enter the values : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        UnaryOperator unaryOperator = new UnaryOperator();
        int number = Integer.valueOf(input);

        //Incrementing
        unaryOperator.preIncrement(number);
        unaryOperator.postIncrement(number);

        //Decrementing
        unaryOperator.preDecrement(number);
        unaryOperator.postDecrement(number);
    }
}
