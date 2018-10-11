package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double i = Math.random();
	int x = (int)(i*11);
	Scanner input = new Scanner(System.in);
	System.out.println("Guess my number between 1 to 10");
	while (!(input.nextInt() == x)){
	    System.out.println("Guess again");// write your code here
    }
    System.out.println("You are correct! The number was " + x);
    }
}
