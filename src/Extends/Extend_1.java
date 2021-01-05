package Extends;

class book {
}

// book 상속
class cartoon extends book {
}

class novel extends book {
}

class graphic_novel extends novel {
} // book > novel 상속

class web_toon extends cartoon {
} // book > cartoon 상속

public class Extend_1 {
	public static void main(String[] args) {
		cartoon ct = new cartoon();
		novel nv = new novel();
		
		graphic_novel gv = new graphic_novel();
		web_toon wt = new web_toon();
		
		book b1 = ct;
		book b2 = nv;
		
		book b3 =gv;
		
		cartoon ct1 =wt;
		
		novel nv_1 = wt;
	}
}
