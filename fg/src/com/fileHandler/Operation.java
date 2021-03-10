package com.fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
	
	public static void addFile() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your file name:");
		String str = sc.nextLine();
		str = "D:\\" + str;
		try {
            File file = new File(str);
            if(file.createNewFile())
                System.out.println("File added successfull");
            else
                System.out.println("Error while creating File, file already exists in specified path");
        }
        catch(IOException io) {
            io.printStackTrace();
        }
    
	}
	
	public static void searchFile() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your path to read :");
		String str1 = sc.nextLine();
		str1 = "D:\\" + str1;
		try {
			File read = new File(str1);
			Scanner sc1 = new Scanner(read);
			while (sc1.hasNextLine()) {
				String data = sc1.nextLine();
				System.out.println(data);
			}
			sc1.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("can't read the file");
	      }
	}
	
	public static void deleteFile() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your file :");
		String directory = sc.nextLine();
		directory ="D:\\"+directory;
		try  {         
			File f= new File(directory);           
			if(f.delete()) {
				//System.out.println(f.getName() + " deleted");
				System.out.println("File is deleted Successfully");
			}  
			else  {  
				System.out.println("File not found");  
			}  
		}  
		catch(NullPointerException  e) {
			e.printStackTrace(); 
		}  
	}
	public static void businessOperation() {
		boolean bool  = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(bool) {
			System.out.println("1 : Add a file ");
			System.out.println("2 : search a file ");
			System.out.println("3 : delete a file");
			System.out.println("4 : Return to main-menu");
			
			System.out.println(" choose your option :");
			int option  = sc.nextInt();
			sc.nextLine();
			try {
				switch(option) {
					case 1 :addFile();
						break;
					case 2 : searchFile();
						break;
					case 3 :deleteFile(); 
						break;
					case 4 : bool  = false;
						break;
					default : System.out.println("WRONG INPUT !!!");
						System.out.println(" ");
						businessOperation();
				}
			}
			
			  catch(InputMismatchException im) {
			  System.out.println("input should be in integer!!!"); }
			 
			//sc.nextLine();
			
		}
		
	}

}
