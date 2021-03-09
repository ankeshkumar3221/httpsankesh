package com.FILE;

import java.io.File;
import java.util.Scanner;

public class DELETE {
	public static void main(String[] args) { 
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter your path :");
		String PATH = sc.nextLine();
		System.out.println("Enter your file :");
		String FILE = sc.nextLine();
		String  directory =PATH+ FILE;
		try  {         
			File f= new File(directory);           
			if(f.delete()) {
				System.out.println(f.getName() + " deleted");
				System.out.println("File is deleted Successfully");
			}  
			else  {  
				System.out.println("failed");  
			}  
		}  
		catch(NullPointerException  e) {
			e.printStackTrace(); 
		}  
	}

	public void setVisible(boolean b) {
		main(null);
		
	}  
}
