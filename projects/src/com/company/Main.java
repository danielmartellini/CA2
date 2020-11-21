package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float number1, number2;
        String operation;

        number1 = getNumber("Insert first number");
        operation = getOperation("Select an operation +,-,*,/");
        checkOperation(operation);
        number2 = getNumber("Insert second number");

        showResult(number1,number2,operation);





    }



    public static float getNumber(String prompt) {
        //@author:Daniel Martellini, Gabriel A.
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextFloat(); }

    public static String getOperation(String prompt){
        //@author: Daniel Martellini
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();}

    public static void checkOperation(String sign){
        //@author:Daniel Martellini
        while (!sign.matches("[*+/-]")) {
            sign = getOperation("Select an operation +,-,*,/"); }
    }


    public static void showResult(float a,float b,String sign){
        //@author: Daniel Martellini
        switch (sign){
        case "+":
            System.out.println("The sum result is:"+" "+(a+b));
            break;
        case "-" :
            System.out.println("The subtraction result is:"+" "+(a-b));
            break;
        case "/" :
            System.out.println("The division result is:"+" "+(a/b));
            break;
        case "*" :
            System.out.println("The multiplication result is:"+" "+(a*b));
            break;
        default:
            System.out.println("operation invalid:" +
                    a+sign+b);
    }

    }


}
