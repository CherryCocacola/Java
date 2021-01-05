package Chapter9;

public class This_test_main {

	public static void main(String[] args) {
		String color = "black";
		int cc = 4000;
		int door = 4;

		This_test ts = new This_test(color, cc, door); // 검은색, 4000, 4
		System.out.println("1: "+ts.brand);
		System.out.println("1: "+ts.color);
		System.out.println("1: "+ts.cc);
		System.out.println("1: "+ts.door);
		

		This_test t1 = new This_test(cc, door); // 노란색, 4000, 4
		System.out.println("2: "+t1.brand);
		System.out.println("2: "+t1.color);
		System.out.println("2: "+t1.cc);
		System.out.println("2: "+t1.door);

		This_test t2 = new This_test(); // 흰색, 2000, 2
		System.out.println("3: "+t2.brand);
		System.out.println("3: "+t2.color);
		System.out.println("3: "+t2.cc);
		System.out.println("3: "+t2.door);

		This_test t3 = new This_test(door); // 흰색, 2000, 4
		System.out.println("4: "+t3.brand);
		System.out.println("4: "+t3.color);
		System.out.println("4: "+t3.cc);
		System.out.println("4: "+t3.door);

	}
}
