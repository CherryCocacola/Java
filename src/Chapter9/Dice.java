package Chapter9;

import java.util.Random;

public class Dice {
	private int dice_1;
	public int play_dice(int no) {
		Random rdm = new Random();
		int dice = rdm.nextInt(no);
		return dice;
	}
	public int getDice_1() {
		return dice_1;
	}
	public void setDice_1(int dice_1) {
		this.dice_1 = dice_1;
	}
	public void one(int no) {
		System.out.println(no + " 가 나왔습니다.");
	}
	public void two(int no) {
		System.out.println(no + " 가 나왔습니다.");
	}
	public void three(int no) {
		System.out.println(no + " 가 나왔습니다.");
	}
	public void four(int no) {
		System.out.println(no + " 가 나왔습니다.");
	}
	public void five(int no) {
		System.out.println(no + " 가 나왔습니다.");
	}
}
