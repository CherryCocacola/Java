package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array_4 {

	public static void main(String args[]) throws IOException {

		File file = new File("C:\\workspace_re\\Java_Practice\\src\\Chapter6\\text.txt");
		File file_1 = new File("C:\\workspace_re\\Java_Practice\\src\\Chapter6\\test.txt");
		try(FileWriter fileWriter = new FileWriter(file)) {
			Scanner sc = new Scanner(file_1);
			String str = "";
			System.out.println("11111111");
			String array[]=null;
			System.out.println("222222222");
			while (sc.hasNextLine()) {
				 str = sc.nextLine();
				 array = str.split("-|@| |\r|\n|\\r|\\n" );
			}			
			
			PrintWriter pw = new PrintWriter(fileWriter);
			for(int i = 0; i<array.length; i++) {
				pw.print(array[i]+"||");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
