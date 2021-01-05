package Chapter9;

public class SuperAirplane_main {

	public static void main(String[] args) {
		SuperAirplane ar = new SuperAirplane();
		int i = 10;
		ar.takeoff();
		ar.fly();
		ar.flyMode = ar.SUPERSONIC;
		ar.fly();
		ar.flyMode = ar.Nomal;
		ar.fly();
		ar.land();
	}
}
