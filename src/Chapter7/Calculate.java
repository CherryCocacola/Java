package Chapter7;
public class Calculate {
	 static int num_1;
	 static int num_2;
	 static String op;
	
	public Calculate(int num_1, int num_2, String op) {
		this.num_1= num_1;
		this.num_2 = num_2;
		this.op = op;
		
		
	}
	

	
	public  int cal () {
		int sum = 0;
		switch (op) {
		case ("+"):
			sum= num_1+num_2;
		}
		return sum;
	}

}