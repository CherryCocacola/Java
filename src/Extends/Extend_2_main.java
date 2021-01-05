package Extends;

public class Extend_2_main {

	public static void main(String[] args) {
			Extend_2_1 e21 = new Extend_2_1();  //자식
			
			Extend_2 e2 =  e21;    //부모
			
			e2.print_first();
			e2.print_second();
			e2.print_third();
			//e2.print_forth();

	}

}
