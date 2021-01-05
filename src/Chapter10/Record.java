package Chapter10;

import java.util.Scanner;

public class Record {
	
	static int total = 0;
	static float avg;
	public static void main(String[] args) {
	    int[] korList = new int[3];
//	    int[] engList = new int[3];
//	    int[] mathList = new int[3];
		
		int menu;
		boolean keepLoop = true;
		Scanner scan = new Scanner(System.in);
		while (keepLoop) {
			//메뉴입력
			menu = Menu_input();
			switch (menu) {
			case 1:
				Record_input(korList) ;//성적입력
			
				break;
			case 2:
				Record_output(korList);//성적출력
				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다 1~3 까지의 숫자를 입력해주세요.");
			}
		}
	}
	
	public static int Menu_input() {
		Scanner scan = new Scanner(System.in);
		int menu;
		System.out.println("----------------------------------------------------------");
		System.out.println("|         메인 메뉴                   | ");
		System.out.println("----------------------------------------------------------");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		menu = scan.nextInt(); 
		return menu;
	}

	public static void Record_input(int[] kors) {
		int kor;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			do {
				System.out.printf("국어%d : ", i + 1);
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor) 
					System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
			} while (kor< 0 || 100 < kor);
				kors[i] = kor;
		}
		System.out.println("----------------------------------------------------------");
	}
	
	public static void Record_output(int []kors) {
		for (int i = 0; i < 3; i++)  	
			total += kors[i];
			avg = total / 3.0f;
			System.out.println("----------------------------------------------------------");
			System.out.println("|           성적 출력                  | ");
			System.out.println("----------------------------------------------------------");
			System.out.println();
			
			for (int i = 0; i < 3; i++) 
			System.out.printf("국어 %d : %3d\n", 3 - i, kors[i]);
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");
	}
	
}
