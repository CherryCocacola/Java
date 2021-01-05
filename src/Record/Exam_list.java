package Record;

import java.util.Scanner;

public class Exam_list {
	Exam[] exams;
	int current;
	
	//init 함수를 생성자로 대체
	public Exam_list() {
		this.current = 0;
		this.exams = new Exam[3];
	}
	
//	public static void init(Exam_list list) {
//	list.current = 0;
//	list.exams = new Exam[3];
//}
	
	  void print_list(Exam_list list) {// 출력
		print_list(list, list.current);
	}
	
	  void print_list(Exam_list list, int count) {// 출력
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		for (int i = 0; i < count; i++) {
			Exam exam = list.exams[i];
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = kor + eng + math;
			double avg = total / 3.0;

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);

			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");
		}
	}

	  void input_list() { // 입력
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("영어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("수학 성적은 0~100까지의 범위만 입력해주세요.");
		} while (math < 0 || 100 < math);
		System.out.println("----------------------------------------------------------");

		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

		if (exams.length == current) {
			Exam[] temp = new Exam[exams.length + 5];
			for (int i = 0; i < exams.length; i++) {
				temp[i] = exams[i];
			}
			exams = temp;
		}
		exams[current] = exam;
		current++;
	}
}
