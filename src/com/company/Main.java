package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Fadlan geeli number kisi #: ");
        int  numbers = input.nextInt();
         while(numbers != 0) {
            if(numbers<0){
                System.out.println("Numberka wa inuu ahaadaa mid taban");
                System.out.println("Fadlan Geli number kisi si aad horay ugu socoto \nHadii kale riix 0 Siadd uga baxdo: ");
                numbers = input.nextInt();
            }
            else{
                CheckNumeber(numbers);
                System.out.println("Fadlan Geli number kisi si aad horay ugu socoto \nHadii kale riix 0 Siadd uga baxdo: ");
                numbers = input.nextInt();
            }
         }
            System.out.println("Macsalaama ): ");

    }



    public static void CheckNumeber(int number){
        if(number % 2 ==0){
            EvenNumber env = new EvenNumber();

            System.out.println("Keliya Waxaa laguu ogol yahay number kisi ");
        }
        else{
            GFG g = new GFG();
            g.generateSquare(number);
        }
    }
}
