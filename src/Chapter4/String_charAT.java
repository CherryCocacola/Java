package Chapter4;

public class String_charAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_1 = "ABC123";
		String str_2 = "DEF456";
		int idx = 0;

		for(int i =0; i<str_1.length(); i++) {
			char c = str_1.charAt(i);
			System.out.println("CharAT: "+c);
			int cn = c;
			System.out.println("숫자 변환: "+cn);

			if(cn>=48&&cn<=57) {
				idx = i;
				System.out.println(idx);
				break;
			}			
		}
		String sub = str_1.substring(idx,  str_1.length());
		System.out.println(sub);
	}
}





