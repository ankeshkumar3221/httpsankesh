package com.fileHandler;

import java.io.File;

public class Show {
	public static void showFile() {
		System.out.println(" ");
		System.out.println("List of all files : ");
		String files[];
		
		try {
			File f = new File("D:\\");
			files = f.list();
			

			for (String pathname : files) {

				System.out.println(pathname);
			}
		}
		catch(NullPointerException  NP) {
			System.out.println("Any file not exists ");
		}
	}

}
