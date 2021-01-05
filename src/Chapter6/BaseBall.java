package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		boolean game = true;
		while (game) {
			int speed = rdm.nextInt(50) + 100;
			int range = rdm.nextInt(8) + 1;
			
			System.out.println("투수 던졌습니다!  " + speed + "km");

			System.out.println("히팅 방향을 정해주세요 1~9");
			int hit = sc.nextInt();

			if (range == hit) {
				System.out.println("쳤습니다. 안타~");
				count =0;
			} else {
				System.out.println("스트라이크~");
				count++;
				System.out.println(count);
				if (count == 3) {
					System.out.println("스트라이크 아웃");
					count = 0;
				}
			}
		}
	}
}
