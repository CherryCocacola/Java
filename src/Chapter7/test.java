package Chapter7;

public class test {

	public static void main(String[] args) {
		int age = 2;
		int charge = 0;
		if (age < 4) {
			charge = 1000;
			System.out.println("초등학생 입니다");
		} else if (age < 6) {
			charge = 2000;
			System.out.println("중학생 입니다");
		}
		System.out.println("입장료는 " + charge + "원 입니다");
	}

}
