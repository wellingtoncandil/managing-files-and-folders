package application;

import java.io.File;
import java.util.Scanner;

public class FoldersAndFiles {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Enter the folder path: ");
		String strPath = tec.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		tec.nextLine();
		File[] files = path.listFiles(File::isFile);
			System.out.println("FILES: ");
			for(File file : files) {
				System.out.println(file);
			}
			tec.nextLine();
			boolean success = new File(strPath + "\\subDirectory").mkdir();
			System.out.println("Directory created succesfully: "+ success);
			
			tec.close();
		}
	}


