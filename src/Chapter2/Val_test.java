package Chapter2;

public class Val_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		System.out.println("i 값은: " +i);
		int k = 0;
		
		if (i==10) {
			int j =20;
			System.out.println("if 안에서 i 값 :"+i);
			System.out.println("if 안에서 j 값 :"+j);
			k = i + j;
		}
	//	int k = i + j;
		
		System.out.println(k);
	
				
	}

}
