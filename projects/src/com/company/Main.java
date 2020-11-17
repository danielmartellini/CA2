package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float number1, number2;
        String operation;
        System.out.println("Insert first number");
        number1 = getNumber();
        System.out.println("Select an operation +,-,*,/");
        operation = getOperation();

        while (!operation.matches("[*+/-]")) {
            System.out.println("Select an operation +,-,*,/");
            operation = getOperation(); }

        System.out.println("Insert second number");
        number2 = getNumber();

        showResult(number1,number2,operation);





    }

    public static int getNumber() {
        Scanner input = new Scanner(System.in);
        return input.nextInt(); }

    public static String getOperation(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();}

    public static void showResult(float a,float b,String sign){
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
