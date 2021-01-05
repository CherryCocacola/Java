package Chapter7;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j =20;
		
		String str_1 = "ABCD";
		String str_2 ="ABCDE";
		
		int sum = plus(str_1, str_2); //hap
		System.out.println(sum);
	}
	
	public static int plus(String num_1, String num_2) {
		int sub = num_1.indexOf("C");
		return sub;
	}

}
