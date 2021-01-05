package Chapter6;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		int longest = 0;
		String word = null;
		Scanner n = new Scanner(System.in);

		System.out.println("enter string of text: ");
		String b = n.nextLine();
		String c[] = b.split("-|;|@");

		for (int i = 0; i < c.length; i++) {
			int leng = c[i].length();
			System.out.println(c[i]);
		}
//        	 for(int j =0; j<leng; j++) {
//        		 String sub = c[i].substring(j,j+1);
//        		 System.out.println(sub);
//        	 }
	}
}
