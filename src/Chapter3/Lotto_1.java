package Chapter3;

public class Lotto_1 {

	public static void main(String[] args) {

		System.out.println("번호를 뽑습니다.");
		int num_1 = (int) (Math.random() * 45) + 1;
		int num_2 = (int) (Math.random() * 45) + 1;
		if(num_1 == num_2) {
			System.out.println("두번째 숫자가 중복 숫자가 나와 다시 뽑습니다.");	
			num_2 = (int) (Math.random() * 45) + 1;
		}
		int num_3 = (int) (Math.random() * 45) + 1;
		if(num_3 == num_1 || num_3 == num_2) {
			System.out.println("세번째 숫자가 중복 숫자가 나와 다시 뽑습니다.");	
			num_3 = (int) (Math.random() * 45) + 1;
		}
		int num_4 = (int) (Math.random() * 45) + 1;
		if(num_4 == num_1 || num_4 == num_2 ||  num_4 == num_3) {
			System.out.println("네번째 숫자가 중복 숫자가 나와 다시 뽑습니다.");
			num_4 = (int) (Math.random() * 45) + 1;
		}
		int num_5 = (int) (Math.random() * 45) + 1;
		if(num_5 == num_1 || num_5 == num_2 ||  num_5 == num_3 || num_5 == num_4) {
			System.out.println("다섯번째 숫자가 중복 숫자가 나와 다시 뽑습니다.");
			num_5 = (int) (Math.random() * 45) + 1;
		}
		int num_6 = (int) (Math.random() * 45) + 1;
		if(num_6 == num_1 || num_6 == num_2 ||  num_6 == num_3 || num_6 == num_4 || num_6 == num_5 ) {
			System.out.println("여섯번째 숫자가 중복 숫자가 나와 다시 뽑습니다.");
			num_5 = (int) (Math.random() * 45) + 1;
		}
		System.out.println("추천 번호는 : " +num_1+", "+num_2+", "+num_3+", "+num_4+", "+num_5+", "+num_6);
	}
}


