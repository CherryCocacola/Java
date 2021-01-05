package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_sp {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\workspace_re\\Java_Practice\\src\\Chapter6\\number_1.txt");
			Scanner sc = new Scanner(file);
			String str = sc.nextLine();
			String sub = "";
			int j=0;
			int idx[] = new int[2];
			for (int i = 0; i < str.length(); i++) {
				sub = str.substring(i, i + 1);
				int sid = sub.indexOf("+");
				
				if(sid != -1) {
					idx[j] = i;
					j++;
				}
			}
			for(int i = 0; i<idx.length;i++) {
				System.out.println(idx[i]);
			}
			
//			for (int i = 0 ; i<idx.length;i++) {
//				System.out.println(idx[i]);
//			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
