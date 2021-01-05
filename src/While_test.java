import java.util.Scanner;

public class While_test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean b = true;
		for(int i =0; i <30; i++) {  //01 2 3 45 6 7 8 910
			if(i%2==0) {
				i -=i;
				continue;
				
			}
			System.out.println(i+" 입니다.");
		}
	}
}
