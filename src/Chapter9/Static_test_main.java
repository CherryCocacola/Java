package Chapter9;

public class Static_test_main {

	public static void main(String[] args) {
		

		Static_test_main stm = new Static_test_main();
		Static_test st = new Static_test();
//		System.out.println("st i: "+st.i);
//		System.out.println("st j: "+st.j);
		System.out.println(st.i);
		System.out.println(st.k);
		stm.one();
		stm.two();
		stm.three();
		
	}
	public void one () {
		int i =30;
		int j = 40;
		Static_test st_1 = new Static_test(i, j);
//		System.out.println("st_1 i: "+st_1.i);
//		System.out.println("st_1 j: "+st_1.j);
}
	public void two () {
		Static_test st_2 = new Static_test();
//		System.out.println("st_2 i: "+st_2.i);
//		System.out.println("st_2 j: "+st_2.j);
}
	
	public void three () {
		Static_test st_3 = new Static_test();
//		System.out.println("st_3 i: "+st_3.i);
//		System.out.println("st_3 j: "+st_3.j);
}
	
	
	
	
	
}

