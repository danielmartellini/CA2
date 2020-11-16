/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Scanner;


public class Calculator {

     public static void main(String[] args) {

        
       
        int number1, number2;
        String operation;
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert first number");
        
        number1 = input.nextInt();
        
        System.out.println("Select an operation +,-,*,/");
        
        operation = input.next().trim();
        while (!operation.matches("[*+/-]")) {
            System.out.println("Select an operation +,-,*,/");
            operation = input.next().trim();

        }

        System.out.println("Insert second number");
        number2 = input.nextInt();

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
                 System.out.println("operation invalid");
         }
           

 }

}
