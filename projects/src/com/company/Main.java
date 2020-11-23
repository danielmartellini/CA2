package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//Author: Gabriel Antoniolli
// validation System.
        boolean valid = false;
        float number1, number2;
        String operation;
        do{
try{
        number1 = getNumber("Insert first number");
        operation = getOperation("Select an operation +,-,*,/");
        checkOperation(operation);
       do{ 
        number2 = getNumber("Insert second number");
        valid = true;
        showResult(number1,number2,operation);
       }while(!valid);
        } catch (Exception e) {
        //System.out.println("Please, Insert Only Numbers!");
    }
}while(!valid);
    }

    public static float sum(float n1, float n2){
        //@Leandro
        return n1+n2;
    }
    public static float subtraction(float n1, float n2){
        //@Jeff
        return n1-n2;
    }
    public static float multiplication(float n1, float n2){
        //@Jeff
        return n1*n2;
    }
    public static float division(float n1, float n2){
        //@Leandro
        return n1/n2;
    }
    public static float getNumber(String prompt) {
        //@author: Gabriel A.
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextFloat(); }

    public static String getOperation(String prompt){
        //@author: Daniel Martellini.
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
                System.out.println("The sum result is:"+" "+sum(a,b));
                break;
            case "-" :
                System.out.println("The subtraction result is:"+" "+subtraction(a,b));
                break;
            case "/" :
                System.out.println("The division result is:"+" "+division(a,b));
                break;
            case "*" :
                System.out.println("The multiplication result is:"+" "+multiplication(a,b));
                break;
            default:
                System.out.println("operation invalid:" +a+sign+b);
        }

    }


}
