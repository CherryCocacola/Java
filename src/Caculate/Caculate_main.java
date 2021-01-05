package Caculate;

import java.util.Scanner;

public class Caculate_main {

	public static void main(String[] args) {
		Cal_bag cb = new Cal_bag();
		cb.nums = new Number[3];
		cb.count = 0;
		
		boolean run = true;
		int menu;

		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 값을 입력한다. 2. 연산  3. 값 출력  4. 종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				// input 4개 숫자
				input_num(cb);
				break;
			case 2:
				input_operator(cb);
				break;

			case 3:
				print_result(cb);
				break;

			case 4:
				// 종료
				System.out.println("안녕~");
				run = false;
				break;
			}
		}
	}

	private static void print_result(Cal_bag cb) {// 연산자 입력
		for (int i = 0; i <cb.count ; i++) {
			System.out.println(i + " 번째 결과 값은 : " + cb.nums[i].sum);
		}
	}

	private static void input_operator(Cal_bag cb) {// 연산자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 연산을 하시겠습니까? (+, - , * ,/");
		String str = sc.nextLine();

		switch (str) {
		case ("+"):
			// 덧셈
			plus(cb);
			break;

		case ("-"):
			// 뺄셈
			//minus(cb);
			break;

		case ("*"):
			// 곱셈
			//multiple(cb);
			break;

		case ("/"):
			// 나눗셈
			division(cb);
			break;
		}

	}

	private static void division(Cal_bag cb) {
		for (int i = 0; i < cb.nums.length; i++) {
			double div_sum = 0;
			div_sum = (double) cb.nums[i].num_1 + (double) cb.nums[i].num_2 + (double) cb.nums[i].num_3;
			cb.nums[i].sum = (int) div_sum;
		}
	}

	private static void multiple(Number[] nums) {
		// TODO Auto-generated method stub

	}

	private static void minus(Number[] nums) {
		// TODO Auto-generated method stub

	}

	private static void plus(Cal_bag cb) {

		for (int i = 0; i < cb.nums.length; i++) {
			cb.nums[i].sum = cb.nums[i].num_1 + cb.nums[i].num_2 + cb.nums[i].num_3;
		}
	}

	private static void input_num(Cal_bag cb) { // 입력
		Scanner sc = new Scanner(System.in);
		
			System.out.println("첫번째 값을 입력해주세요.");
			int num_1 = sc.nextInt();
			System.out.println("두번째 값을 입력해주세요.");
			int num_2 = sc.nextInt();
			System.out.println("세번째 값을 입력해주세요.");
			int num_3 = sc.nextInt();
			Number num = new Number();
			num.num_1 = num_1;
			num.num_2 = num_2;
			num.num_3 = num_3;
			
			cb.nums[cb.count] = num;
			cb.count++;	
	}
}
