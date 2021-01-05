package Chapter5;

import java.util.Scanner;

public class Caculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while (run) {
			String str_array[] = new String[5];
			System.out.println("무엇을 하시겠습니까? 1. 계산 2. 조회");
			int job = sc.nextInt();
			switch (job) {
			case 1:
				System.out.println("첫번째 숫자를 입력해주세요.");
				int num_1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요.");
				int num_2 = sc.nextInt();
				System.out.println("어떤 연산을 하시겠습니까?(+,-,*,/) 로 입력해주세요.");
				String str = sc.next();
				int sum = 0;
				switch (str) {
				case ("+"):
					sum = num_1 + num_2;
					break;
				case ("-"):
					sum = num_1 - num_2;
					break;
				case ("*"):
					sum = num_1 * num_2;
					break;
				case ("/"):
					sum = num_1 / num_2;
					break;
				}
				System.out.println("cnt" + cnt);
				str_array[cnt] = Integer.toString(num_1) + "+" + Integer.toString(num_2);
				System.out.println(str_array[cnt]);
				cnt ++;
				System.out.println("cnt2" + cnt);
				
				
				System.out.println(str_array[cnt]);

				System.out.println("계속 하시겠습니까? 1. yes 2. no");
				int flag = sc.nextInt();
				if (flag == 1) {
					run = true;
				} else {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
				break;
			case 2:
				for (int i = 0; i < str_array.length; i++) {
					System.out.println(str_array[i]);
				}
				break;
			}

		}

	}

}
