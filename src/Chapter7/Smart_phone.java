package Chapter7;
import java.sql.Date;

public class Smart_phone {
	String brand = "Samsung";
	String model = "갤럭시 s20 ultra";
	static Date d;
	int camera = 1^8;
	static String user = "";
	static int function = 0;
	
	public Smart_phone(String user, int function) {
		this.user = user;
		this.function = function;
		this.d = time();
		if(function==1) {
			viewTime();		
		}
	}
	
	public static Date time() {
		Date date_now = new Date(System.currentTimeMillis());
		return date_now;
	}
	
	public static void viewTime() {
		System.out.println(user+" 님 현재시간은 ");
		System.out.println(d);
	}
	
	

//	public static String chrome() {
//		String news = "코로나19 3단계 격상";
//		return news;
//	}
}
