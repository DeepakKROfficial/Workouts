package Workouts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOptns {
	
	public static void main(String[] args) throws IOException {

		File newFile = new File("test.txt");
		if(newFile.createNewFile()){
			System.out.println("File created: " + newFile.getName() + newFile.getAbsolutePath());
		}else {
			System.out.println("File exists: " + newFile.getName() + newFile.getAbsolutePath());
		}

		FileWriter fWritter = new FileWriter(newFile) ;
		fWritter.write("Hello world");
		fWritter.close();
	}

}
