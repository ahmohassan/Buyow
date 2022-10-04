package com.company;

//import static com.sun.tools.javac.main.Option.G;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numbers ;
         String go ="1";
         Scanner myObj = new Scanner(System.in);
         Scanner input = new Scanner(System.in);
         System.out.println("Input an integer: ");
     while((numbers=input.nextInt()) != 0) {

         CheckNumeber(numbers);
         System.out.println("Input an integer: ");
     }
        System.out.println("Out of loop");

    }



    public static void CheckNumeber(int number){
        if(number % 2 ==0){
            EvenNumber env = new EvenNumber();

            env.doublyEven(number);
        }
        else{
            GFG g = new GFG();
            g.generateSquare(number);
        }
    }
}
