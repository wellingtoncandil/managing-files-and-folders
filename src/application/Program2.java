package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "c:\\Temp\\in.txt";
		//FileReader fr = null;
		//BufferedReader br = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){//fecha os streams assim que termina a execu��o do try
			//fr = new FileReader(path);
			//br = new BufferedReader(fr);
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		/*finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}*/
	}

}
