package Chapter2;

import java.util.Scanner;

//import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 첫번째 주사위를 골라주세요");
		int num_1 = sc.nextInt();   //첫번째 주사위 면체 정하기
		System.out.println(" 두번째 주사위를 골라주세요");
		int num_2 =sc.nextInt();  //두번째 주사위 면체 정하기
		System.out.println(num_1 + "면체 주사위를 굴립니다.");
		System.out.println(num_2 + "면체 주사위를 굴립니다.");
		int sum = 0;
		double dice_1 = Math.random();    //첫번째 주사위의 값 0.0 ~ 1.0 사이의 실수
		double dice_2 = Math.random();    //두번째 주사위의 값 0.0 ~ 1.0 사이의 실수

		int dice_num_1 = (int) (dice_1 * num_1) + 1;   //0.0 * 6 이 나오는 경우 0 값이 나올 수 있으므로 1을 더해준다.
		int dice_num_2 = (int) (dice_2 * num_2) + 1;  


			System.out.println("첫번째 주사위 값은 : "+dice_num_1);
			System.out.println("두번째 주사위 값은 : "+	dice_num_2);
			sum = dice_num_1 + dice_num_2;
			System.out.println("주사위 합은:"+sum);

	}

}
