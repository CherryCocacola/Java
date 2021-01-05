package Chapter3;

import java.util.Scanner;

public class Game_1 {

	public static void main(String[] args) {
		int monster_hp = 100;
		String wepon = "";
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("무기를 선택하세요.");
		System.out.println("1: Sword,  2:AXE,  3:Hammer");
		int attk = 0;
		int wepon_num = sc.nextInt();

		switch (wepon_num) {
		case 1:
			wepon = "SWORD";
			attk = 10;
			break;

		case 2:
			wepon = "AXE";
			attk = 11;
			break;
		

		case 3:
			wepon = "Hammer";
			attk = 12;
			break;
				
		default:
			wepon = "주먹";
			attk = 1;
		}

		System.out.println("현재 선택된 무기는 :"+wepon+"입니다.");
		System.out.println("현재 선택된 무기의 공격력은 :"+attk+"입니다.");

	}

}
