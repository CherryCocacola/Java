
public class Split_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "이현수";
		String pm = "010-4840!0531";

		int leng = name.length();
		String str[] = new String[leng];

		String str_1[] = pm.split("-|\\!");
		
		int one = str.length;
		int two = str_1.length;
		
		String str_2[] = new String [one+two];
		
		

		for (int i = 0; i < leng; i++) {
			str[i] = name.substring(i, i + 1);
		}



        System.arraycopy(str, 0,  str_2, 0,  str.length);
        

        System.arraycopy(str_1, 0, str_2, str.length, str_1.length);
        
        
        for(String k : str_2) {
        	System.out.println(k);
        }
		
		
		
//		for (String k : str) {
//			System.out.println(k);
//		}
//
//		for (String l : str_1) {
//			System.out.println(l);
//		}

	}

}
