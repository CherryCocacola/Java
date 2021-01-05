package Chapter7;

public class Book {
	String title = "채식주의자";
	String author = "한강";
	static int page = 360;
	static int Pages_read =0;
	String note = "나는 어두웠다고 그는 느낄때가 있었다. 그는 어두웠다. 어두운 곳에 그가 있었다. 그가 이즈음 경험하는 색채들이 부재했던 그 흑백의 세계는 아름답고 고즈넉했으나 그로서는 다시 돌아갈 수 없는 곳이었다. ";

	public Book(int rp) {	
		this.Pages_read = this.page-rp;
	}
	
	
	
}
