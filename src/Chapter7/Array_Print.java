package Chapter7;

class Array_Print {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i,i+1);
			sum +=Integer.parseInt(s);
		}
		System.out.println("sum : " + sum);
	}
}
