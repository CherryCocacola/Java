package Chapter4;

public class Loop_char1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		String str_1 = "abc";
	
		char c_1 = ' ';
		char c_2 = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			c_1 = str.charAt(i);  //A  B   C
													
		}
		
		for (int i = 0; i < str.length(); i++) {
			c_2 = str_1.charAt(i);
		}
		
		System.out.println(c_1);
		System.out.println(c_2);
		
		int sum= c_1 + c_2;
		System.out.println(sum);
	
	}
}
