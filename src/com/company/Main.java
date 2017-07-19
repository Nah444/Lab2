package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        String answer;
        int username;
        int counter = 0;


        System.out.println("Hey! Enter your name: ");
        name = scan.nextLine();


        System.out.println("Hello" + name) + "!" + " How are you?");

    do {

        System.out.print(name + ", enter a number between 1 & 100: ");

        username = scan.nextInt();

        scan.nextLine();

        if ((username < 1) || (username > 100)) {

                System.out.println("Sorry, please enter a number between 1 and 100.");

                if (counter == 3) {

                    System.out.print("Would you like to enter another value?");

                    answer = scan.nextLine();

                    System.out.println();

                } while(answer.equals("Yes"));

        public static void evaluateNum(int n)

        }

                int userNum=n;


       if ((userNum % 2 == 1) && (userNum < 60))

       {System.out.println("Odd");}

        else if ((username % 2 == 0) && (userNum >=2) && (username < 25))

