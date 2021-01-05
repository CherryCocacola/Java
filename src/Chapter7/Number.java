package Chapter7;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		one(i);
	}

	public static void one(int i) {
		i = i + 10;
		two(i);
		System.out.println(i);
	}

	public static void two(int i) {
		i = i + 10;
		three(i);
		System.out.println(i);
	}

	public static void three(int i) {
		i = i + 10;
		four(i);
		System.out.println(i);
	}

	public static void four(int i) {
		i = i + 10;
		five(i);
		System.out.println(i);
	}

	public static void five(int i) {
		i = i + 10;
		six(i);
		System.out.println(i);
	}

	public static void six(int i) {
		i = i + 10;
		seven(i);
		System.out.println(i);
	}

	public static void seven(int i) {
		i = i + 10;
		eight(i);
		System.out.println(i);
	}

	public static void eight(int i) {
		i = i + 10;
		int sum = nine(i);
		System.out.println(sum);
	}

	public static int nine(int i) {
		i = i + 10;
		return i;
	}
}
