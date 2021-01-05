import java.util.Scanner;

public class Tostring_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();

		String str = Integer.toString(num);
		int leng = str.length();
		String Array[] = new String[leng];
		int sum = 0;
		for(int i =0; i<leng; i++) {
			Array[i]= str.substring(i,i+1);	
			int count = Integer.parseInt(Array[i]);
			sum += count;   //sum = sum + count
		}
		System.out.println(sum);
	}
}
