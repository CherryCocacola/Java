package Car;

public class Car extends Car_color {
	Tire[] tires = {
			new Tire("FRONT-L", 6),  //0
			new Tire("FRONT-R", 2),  //1
			new Tire("REAR-L", 3),    //2
			new Tire("REAR-R", 4)    //3
	};
	

	public void color() {
		System.out.println("이차의 색상은 " + color[3]);
	}

	
	public int run() {
		System.out.println("[차가 달립니다.]");
		for(int i=0; i<tires.length; i++) {		//0~3
			if(tires[i].roll()==false) { 
				stop(); 
				return (i+1); 
			} 
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("[차가 정지합니다..]");
	}
}

