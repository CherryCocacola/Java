package test;

import java.util.Random;
import java.util.Scanner;

public class Number_final {
	String no;
	String name;

	public String getNo() {

		return no;
	}

	public void setNo(String no) {
		this.no = no;

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void to() {
		boolean b = true;
		String n = "";
		int i = 0;
		while (b) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 이륙 2. 착륙");
			int a = sc.nextInt();
			if(a==1) {
				n = "이륙 or 상승";
				i = i + 500;
				if (i > 10000) {
					i = 10000;
					System.out.println("더이상 올라갈 수 없습니다. 현재 높이를 유지합니다.\n" + "현재 높이" + i + "m");
					b=false;
				}
			}
			if(a==2) {
				n = "착륙 or 하강";
				i = i - 500;
				if (i < 0) {
					i = 0;
					System.out.println("착륙했습니다.");
					b = false;
				}
			}
			System.out.println(n + "합니다.\n " + "현재 높이" + i + "m");

		}
	}
	public void ran() {
		Random rdm = new Random();
		
		int a = rdm.nextInt(10);
	}
}
