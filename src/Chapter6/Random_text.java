package Chapter6;
import java.util.Random;
import java.util.Scanner;
public class Random_text {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 글자를 뽑으시겠습니까?");
	    int count = sc.nextInt();
	    Random rd = new Random();
	    String str[] = new String[count];
	    String text = "";
	    for(int i=0; i<count ;i++) {
	    	int txt = rd.nextInt(57)+65; //122 
	    	System.out.println("뽑힌 숫자는 :"+txt);
	    	if (txt >=91&&txt <=96 ) {
	    		i = -1;
	    		continue;
	    	}
	    	char c= (char) txt;
	    	str[i]= Character.toString(c);	
	    }
	   for(String t: str ) {
		   System.out.println(t);
		   text +=t;	   
	   }
	   System.out.println(text);
	}

}
