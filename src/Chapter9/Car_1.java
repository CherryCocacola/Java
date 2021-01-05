package Chapter9;

abstract class Car_1 {
	int speed =0;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan extends Car_1{
	@Override
	void upSpeed(int speed) {
		if(speed>100) {
		this.speed = speed/10;
		}else {
			super.upSpeed(speed);
		}
	}
}

class Truck extends Car_1{
}