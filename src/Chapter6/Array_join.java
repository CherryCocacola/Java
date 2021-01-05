package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Array_join {
    public static void main(String[] args){
        try{
            //파일 객체 생성
            File file = new File("C:\\workspace_re\\Java_Practice\\src\\Chapter6\\test.txt");
            //스캐너로 파일 읽기
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
            	String str = sc.nextLine();
            	String array[]= str.split("-| |@");
            	for (int i =0; i<array.length;i++) {
            		System.out.println(array[i]);
            	}
            }
            //System.out.println(scan.useDelimiter("\\z").next());
        }catch (FileNotFoundException e) {
        	System.out.println(e);
        }
    }
}

