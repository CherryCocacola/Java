package Chapter9;

public class Node {
	private int x;
	private int y;
	static int num;
	int k;
	
	public void plus(int kk) {
//		this.x = x;
//		num = x;
		k =k+10;
		num = num +10;
		System.out.println("k: "+this.k);	
		System.out.println("num: "+num);	
	}	
	
	public void plus_1(int k) {
//		this.x = x;
		num=num+10;
		this.k =this.k+10;
		System.out.println("k: "+this.k);	
		System.out.println("num: "+num);	
	}

}


