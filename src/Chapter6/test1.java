package Chapter6;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N = 0;
        
        Scanner scan=new Scanner(System.in);
        N=scan.nextInt();
        
        if(N>=1 && N<=100)
        {
            for(int i=1;i<=N;i++)
            {
                for(int j=1;j<=i;++j)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
