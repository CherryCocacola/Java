package Chapter9;
public class Men {
	int weight;
	int goFloor;
	int stayFloor;
	public static void main(String[] args) {
		Men men = new Men();
		men.weight = 60;
		men.goFloor = 5;
		men.stayFloor = 1;
		
		
		EvCall(men.goFloor, men.stayFloor, men.weight);
		
		Men_2 men_2 = new Men_2();
		
		EvCall2(men_2.goFloor, men_2.stayFloor, men_2.weight);
	}
	
	public static void EvCall(int goFloor, int stayFloor, int weight) {
		if (goFloor > stayFloor) {
			EV ev = new EV(weight);
			ev.up(goFloor);
			
		} else if (goFloor < stayFloor) {

		} else {
		}	
	}
	
	public static void EvCall2(int goFloor, int stayFloor, int weight) {
		if (goFloor > stayFloor) {
			EV ev_2 = new EV(weight);
			ev_2.up(goFloor);
			
		} else if (goFloor < stayFloor) {

		} else {
		}	
	}
}

class Men_2 {
	int weight;
	int goFloor;
	int stayFloor;

	public Men_2() {
		this.weight = 80;
		this.goFloor = 7;
		this.stayFloor = 1;
	}

}