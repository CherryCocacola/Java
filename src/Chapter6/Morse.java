package Chapter6;

import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int leng = str.length();
		char c[] = new char[leng];
		
		for(int i =0; i<leng; i++) {
			c[i]  = str.charAt(i);
			
		}
	}

}
