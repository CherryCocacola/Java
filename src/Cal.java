
public class Cal {
	public static void main(String[]args) {
	int i = 10;
	int j = 20;

	int sum = i + j;
	int k = sum*i;
	System.out.println("sum1: "+sum);
	
	i++;
	i++;
	
	sum++;
	++sum;
	int l = sum*i;
	
	System.out.println("sum2: "+sum);
	
	System.out.println(k);
	System.out.println(l);
	

	}

}
