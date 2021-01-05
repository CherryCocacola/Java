package Chapter9;

public class Dice_main {
	public static void main(String[] args) {
		Dice di = new Dice();

		int dice = di.play_dice(5); // 주사위 5 짜리를 굴린다.
		// System.out.println(dice);
		di.setDice_1(dice);

		switch (di.getDice_1()) {
		case 1:
			di.one(di.getDice_1());
			break;
		case 2:
			di.two(di.getDice_1());
			break;
		case 3:
			di.three(di.getDice_1());
			break;
		case 4:
			di.four(di.getDice_1());
			break;
		case 5:
			di.five(di.getDice_1());
			break;
		}
	}
}
