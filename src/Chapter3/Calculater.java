package Chapter3;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");
		int num_1 = sc.nextInt();
		if ((num_1 < 0) || (num_1 > 10)) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println("두번째 숫자를 입력하세요.");
			int num_2 = sc.nextInt();
			if ((num_2 < 0) || (num_2 > 10)) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				int result = 0;

				System.out.println("어떤 연산을 하시겠습니까? (+ - * /) 중 하나를 입력해주세요.");
				String str = sc.next();
				if (!((str.equals("+")) || (str.equals("-")) || (str.equals("*")) || (str.equals("/")))) {
					System.out.println("잘못 입력하셨습니다. (+ - * /) 중 하나를 입력해주세요.");
				} else {
					System.out.println(str + " 연산을 하겠습니다.");
				}

				if (str.equals("+")) {
					result = num_1 + num_2;
					System.out.println(num_1 + "+" + num_2 + "=" + result);
				}
				if (str.equals("-")) {
					result = num_1 - num_2;
					System.out.println(num_1 + "-" + num_2 + "=" + result);
				}
				if (str.equals("*")) {
					result = num_1 * num_2;
					System.out.println(num_1 + "x" + num_2 + "=" + result);
				}
				if (str.equals("/")) {
					result = num_1 / num_2;
					System.out.println(num_1 + "/" + num_2 + "=" + result);
				}
			}
		}
	}

}
