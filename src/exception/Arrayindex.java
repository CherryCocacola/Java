package exception;

public class Arrayindex {

	public static void main(String[] args) {
		try {

//			Scanner sc = new Scanner(System.in);
			String str = "ABCDEFG";
			String sub[] = new String[str.length()];
			for (int i = 0; i <= str.length(); i++) {
				sub[i] = str.substring(i, i + 1);
			}
			for (int i = 0; i <= sub.length; i++) {
				System.out.println(sub[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (RuntimeException e) {
			System.out.println(e);
		}
	}
}
