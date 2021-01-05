package Chapter7;

public class Men {
	static int maxSpeed= 270;
	static int km = 15000;
	static String name ="이현수";
	static int bus_card = 5000;

	public static void main(String[] args) {
//		Bus bus = new Bus();
		// bus_card=bus.reader(bus_card);
//		Elevaitor ev = new Elevaitor(5);
//		ev.up(6);
		 Sonata mycar = new Sonata(maxSpeed, km, name);
		 mycar.getModel();
		
	
//		boolean reading = true;
//		int i =0;
//		while (reading) {
//			i++;
//			Book book = new Book(i);
//		
//			System.out.println(i+" 페이지");
//			if (book.Pages_read == 0) {
//				reading = false;
//				
//				System.out.println("나는" + book.title + " 을 다 읽었다.");
//			}
//		
//		}



		// Smart_phone sp = new Smart_phone(name, 1);

	}
}
