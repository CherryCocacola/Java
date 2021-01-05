package Chapter4;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("피라밋 단수를 입력해주세요.");
		int k = sc.nextInt();
		
		for (int i = k; i > 0; i--) {                 //i =4    
			for (int j = 0; j < k * 2; j++) {       // j = 0  j <8 
				if (j <= k && i <= j) {               // 0 <= 4   4 <= 0 
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}
	}

}
