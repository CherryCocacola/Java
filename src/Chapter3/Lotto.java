package Chapter3;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("번호를 돌립니다.");
		int num_1 = (int) (Math.random() * 45) + 1;
		int num_2 = (int) (Math.random() * 45) + 1;
		int num_3 = (int) (Math.random() * 45) + 1;
		int num_4 = (int) (Math.random() * 45) + 1;
		int num_5 = (int) (Math.random() * 45) + 1;
		int num_6 = (int) (Math.random() * 45) + 1;
		if (num_1 == num_2 || num_1 == num_3 || num_1 == num_4 || num_1 == num_5 || num_1 == num_6) {
			System.out.println("중복 숫자가 있어 다시 돌립니다.");
			num_1 = (int) (Math.random() * 45) + 1;
			num_2 = (int) (Math.random() * 45) + 1;
			num_3 = (int) (Math.random() * 45) + 1;
			num_4 = (int) (Math.random() * 45) + 1;
			num_5 = (int) (Math.random() * 45) + 1;
			num_6 = (int) (Math.random() * 45) + 1;
			System.out.println("추천 번호는 : " +num_1+", "+num_2+", "+num_3+", "+num_4+", "+num_5+", "+num_6);
		}else {
			System.out.println("추천 번호는 : " +num_1+", "+num_2+", "+num_3+", "+num_4+", "+num_5+", "+num_6);
		}
	}
}
