package Chapter7;

import java.util.Random;
import java.util.Scanner;

public class Test_dice {
	public static void main(String[] args) {
		String str = scan();
		int leng[] = leng(str);
		for(int i:leng) {
			System.out.println(i);
		}
	}

	public static String scan() {
		System.out.println("문자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}

	public static int[] leng(String s) {
		int leng = s.length();
		int dice = dice(leng);
		int num []= {dice, leng};
		return num;
	}
	
	public static void  dice_val(int dice) {
		int num = dice;
	}

	public static int dice(int leng) {
		Random rd = new Random();
		int dice = 0;
		if (leng % 2 == 0) {
			dice = rd.nextInt(5) + 1;
		} else {
			dice = rd.nextInt(6) + 1;
		}
		return dice;
	}

}
