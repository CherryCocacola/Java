package Chapter2;
import java.util.Scanner;
public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("교환할 금액을 입력하세요.(원)");
		int won = sc.nextInt();
		System.out.println("현재 환율");
		int exchange = sc.nextInt();
		
		double dollor = ((double)won/(double)exchange);
		double dollor_a = ((double)won%(double)exchange);
		int dollor_e = (int)dollor;
		int dollor_f = (int)dollor_a;
		
		System.out.println("환전한 금액:" +dollor_e+"달러");
		System.out.println("환전하지 못한 금액"+dollor_f+"원");
		
		
		
	}

}
