package Chapter4;

public class String_indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yang!%#*Jung" ;

		boolean con = str.contains("yang");
		System.out.println("Yang 값이 있는가? :"+con);

		System.out.println(str.indexOf("가"));
		
		int idx = str.indexOf("가");
		
		if (str.indexOf("!")>-1 || str.indexOf("%")!=-1 || str.indexOf("#")!=-1 || str.indexOf("*")!=-1) {
			System.out.println("다시 입력해주세요.");
		}
	}
}
