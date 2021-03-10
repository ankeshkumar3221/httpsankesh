package com.fileHandler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Option {
public static void  display() {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("1 : Retrive  the file names in an ascending order ");
		System.out.println("2 : Business-Level operations ");
		System.out.println("3 : Exit");
		
		System.out.println(" choose your option :");
		try{
			int option  = sc.nextInt();
			switch(option) {
				case 1 : Show.showFile();
					break;
				case 2 : Operation.businessOperation();
					break;
				case 3 :System.out.println("THANK YOU");
					System.exit(0); 
					break;
				default : System.out.println("WRONG INPUT !!!");
					System.out.println(" ");
					display();
			}
		}
		catch(InputMismatchException e) {
			System.out.println(" Input should be in integer !!!!");
		}
		sc.nextLine();
		
	}
	
}
}
