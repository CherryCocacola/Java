package Chapter9;

public class SuperAirplane extends AirPlane {
	public final int Nomal =1;
	public final int SUPERSONIC =2;	
	public int flyMode = Nomal;
	
	@Override
		public void fly() {
			if(flyMode ==SUPERSONIC) {
				System.out.println("초음속 비행 중");	
			}else {
				super.fly();
			}
		}
	}

