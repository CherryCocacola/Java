package Chapter7;

 class Sonata {
	private String model = "Sonata";
	final static String brand = "Hyundai";
	 String owner = "";
	 int maxSpeed = 250;
	 int km = 0;
	
	public  Sonata(int maxSpeed, int km, String name) { //생성자 (매개변수로 maxSpeed, km, name
		this.maxSpeed = maxSpeed;     //maxSpeed 필드 값에 매개변수 maxSpeed 를 저장
		this.km = km;							//km 필드 값에 매개변수 km 를 저장
		this.owner = name;					//owner 필드 값에 매개변수 name 를 저장
		//run(model, brand, maxSpeed , km, owner);  //run 메서드 호출
	}
	
	public String getModel() {
		model = "벤츠";
		return model;
	}
	
	protected static void run() {
		
		//System.out.println("나는 "+model+" 다.");
	//	System.out.println("내 주인은 : "+owner+"님이야");
		System.out.println("나를 만든 자는 : " + brand);
	//	System.out.println("내 최고속도는  : " + maxSpeed+ "km" );
	//.out.println("난 이만큼 달려왔어 : "+km +"km");
	//	
		
	}
}
