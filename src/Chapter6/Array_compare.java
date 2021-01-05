package Chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Array_compare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값");
		String str = sc.nextLine();
		System.out.println("두번째 값");
		String str_1 = sc.nextLine();

		if(array_process(str)==false) {
			System.out.println("값 잘못 입력");
		}
		if(array_process(str_1)==false) {
			System.out.println("값 잘못 입력");
		}
	}
		
		

	public static boolean array_process(String str) {
		String number[]= {"1","2","3","4","5","6","7","8","9","0"};
		int leng = str.length();
		boolean b = true;
		String str_array[]=new String [leng];
		for(int i = 0; i<leng; i++) {
			str_array[i] = str.substring(i,i+1);
		}
		int cnt =0;
		for(int i =0; i<leng; i++) {
			for(int j =0; j<number.length; j++) {
				if(!(str_array[i].equals(number[j]))) {
				     cnt ++;
				}
			}if(cnt<=9) {
				cnt =0;
				b=true;
			}else if (cnt ==10) {
				b=false;
				break;			
			}
		}
		return b;
	}
}
