package Chapter9;

import java.util.Random;

public class EV {
	static int maxWeight;
	int floor;
	
	public EV(int weight) {
		Random rdm = new Random();
		this.floor = rdm.nextInt(9)+1;
		this.maxWeight = maxWeight+weight;
	}
	
	public void  up(int floor) {
		System.out.println(maxWeight);
		if(maxWeight >= 100) {
			System.out.println("중량이 초과되었습니다.");
		}else {
			System.out.println(floor + " 층 에 도착하였습니다");
		}
		
		
	}
	public void  down() {
		
	}
	
}
