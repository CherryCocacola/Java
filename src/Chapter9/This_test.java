package Chapter9;

public class This_test {
	String brand = "Benz";
	String color;
	int cc;
	int door;

	public This_test() { // 흰색, 2000, 2
		this("white", 2000, 2);
	}

	public This_test(int door) { // 흰색, 2000, 4
		this("white", 2000, door);
	}

	public This_test(int cc, int door) { // 노란색, 4000, 4
		this("yellow", cc, door);
	}

	public This_test(String color, int cc, int door) { // 검은색, 4000, 4
		this.color = color;
		this.cc = cc;
		this.door = door;
	}

}
