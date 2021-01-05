package Chapter7;

public class Identify {
	public static int age(String name) {
		int age = 0;
		switch(name) {
		case ("LEE"):
			age=42;
		break;
		case ("KIM"):
			age=38;
		break;
		case ("PARK"):
			age=27;
		break;
		}
		return age;
	}
	
	public static String[]  Job() {
		String job[] = {"a", "b", "c", "d"};
		return job;
	} 
	
}

