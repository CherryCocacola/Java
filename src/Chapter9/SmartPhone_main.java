package Chapter9;

public class SmartPhone_main {

	public static void main(String[] args) {
		String name = "이현수";
		SmartPhone sp = new SmartPhone(name);
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	}
}
