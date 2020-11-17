package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1, number2;
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


        switch (operation){
            case "+":
                System.out.println("The sum result is:"+" "+(number1+number2));
                break;
            case "-" :
                System.out.println("The subtraction result is:"+" "+(number1-number2));
                break;
            case "/" :
                System.out.println("The division result is:"+" "+(number1/number2));
                break;
            case "*" :
                System.out.println("The multiplication result is:"+" "+(number1*number2));
                break;
            default:
                System.out.println("operation invalid:" +
                        number1+operation+number2);
        }


    }

    public static int getNumber() {
        Scanner input = new Scanner(System.in);
        return input.nextInt(); }

    public static String getOperation(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();}


}
