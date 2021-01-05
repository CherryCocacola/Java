package Chapter7;

import java.util.Scanner;

public class String_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		String str = sc.nextLine();
		boolean b = string_boo(str);
		if (b==true) {
			int idx = string_idx(str);
			System.out.println("! 표는 "+ idx + "번째에 위치하고 있습니다.");		
		}else {
			System.out.println("! 가 없습니다.");
		}
	}
	
	public static boolean string_boo(String s) {
		boolean b = s.contains("!");
		return b;
	}
	
	public static int string_idx(String s) {
		int idx = s.indexOf("!");
		return idx;
	}
}
