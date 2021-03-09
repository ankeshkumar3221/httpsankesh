package com.FILE;

import java.io.File;
import java.util.Scanner;

public class CurrentFile {
	public static void main(String[] args) {

		System.out.println("Enter your path:");
		String[] pathnames;
		Scanner sc = new  Scanner(System.in);
		String str = sc.nextLine();
		try {
			File f = new File(str);
			pathnames = f.list();
			

			for (String pathname : pathnames) {

				System.out.println(pathname);
			}
			System.out.println("List of all files available in path");
		}
		catch(NullPointerException  NP) {
			System.out.println("WRONG PATH!!!!!");
		}
		


	}

	public void setVisible(boolean b) {
		main(null);

	}

}
