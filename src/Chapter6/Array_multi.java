package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_multi {
	public static void main(String[] args) {
		try {
			// 파일 객체 생성
			File file = new File("C:\\workspace_re\\Java_Practice\\src\\Chapter6\\number.txt");
			// 스캐너로 파일 열기
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split(" ");
				for (int i = 0; i < array.length; i++) {
//					System.out.println(array[i]);
					System.out.println(array[i] + "x" + array[i + 1] + "=" + array[i + 2]);
					i += 2;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
