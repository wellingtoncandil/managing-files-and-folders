package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
       
		File file = new File("c:\\Temp\\in.txt");
		Scanner tec = null;
		
		try {
			tec = new Scanner(file);
			while (tec.hasNextLine()){
				System.out.println(tec.nextLine());

			}
		}catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally { // fecha o scanner independente se deu certo o try ou não
			if(tec != null) {
				tec.close();
			}
		}
	}

}
