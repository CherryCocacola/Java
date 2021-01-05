package Chapter5;

import java.util.Scanner;

public class For_charAT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your name. (A~z)");
		String str = sc.next();
		int sum = 0;
		
		for (int i =0; i <str.length(); i++) {
			char c = str.charAt(i);
			int transC = c;
			sum += transC;
		}
		System.out.println("총합은 : " + sum);	
	}

}
