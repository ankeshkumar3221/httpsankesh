package com.FILE;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your file name and with directory to add file :");
		String str = sc.nextLine();
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

	public void setVisible(boolean b) {
		
		main(null);
		
	}
	

}
