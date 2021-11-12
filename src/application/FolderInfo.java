package application;

import java.io.File;
import java.util.Scanner;

public class FolderInfo {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("Enter the folder path: ");
		String strPath = tec.nextLine();
		File path = new File(strPath);
		
		System.out.println("getName: "+path.getName());
		System.out.println("getParent: "+ path.getParent());
		System.out.println("getPath: "+path.getPath());
		System.out.println("Executable?: "+path.canExecute());
		System.out.println("Total space: "+path.getTotalSpace());

		tec.close();
	}

}
