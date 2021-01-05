package Chapter4;

public class String_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "사과(apple) 가격은 개당 1,000원 입니다." ;
        

        if(str.matches(".*사과.*")) {
            System.out.println("matches 포함");
        }else {
            System.out.println("matches 미포함");
        }

        // matches 문자열 정규식 숫자 찾기
        if(str.matches(".*[0-9].*")) {
            System.out.println("matches 숫자 포함");
        }else {
            System.out.println("matches 숫자 미포함");
        }
	}

}
