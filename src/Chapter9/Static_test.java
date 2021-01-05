package Chapter9;

public class Static_test {
	final static int i = 10;
	private int j = 20;
	 int k = 10;
	public Static_test() {
	}
	
	public Static_test(int i, int j) {
	//	this.i = i;
		this.j =j;
	}
	public  void up() {
	//	i =i+10;
		j=j+20;
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
	
	
	

}
