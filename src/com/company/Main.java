package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double i = Math.random();
	int x = (int)(i*100);
	int guesses = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("What's your name?");
	String name = input.nextLine();
	System.out.println("Hey "+ name + " guess my number between 1 to 100");
	while (!(input.nextInt() == x)){
	    System.out.println("Guess again, "+ name);
	    guesses++;// write your code here
    }
    System.out.println(name +" is correct! The number was " + x);
	System.out.println("It took "+ name+" " + guesses+ " tries.");
    }
}
