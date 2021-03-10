package assessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {
	
	public static void readFile(String str) {
		try {
		      File read = new File(str);
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
	
	public static void writeFile(String str,String str1) {
		try{    
	           FileWriter writes=new FileWriter(str);    
	           writes.write(str1);    
	           writes.close();    
	          }
		 catch(Exception e){
			 System.out.println("Can't write ");
		 } 
		readFile(str);
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your path to read :");
		String str = sc.nextLine();
		//read a file
		
		readFile(str);
		
		System.out.println("Enter that you want write :");
		String str1 = sc.nextLine();
		//write a file
		 
		System.out.println("file after write :");
		writeFile(str,str1);
			
		System.out.println("read and write process is complete ");    
	}
		
}



