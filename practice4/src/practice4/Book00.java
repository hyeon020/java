package practice4;

public class Book00 {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	
	public Book00() {
		this("", "");
		System.out.println("생성자 호출됨"); //생성자 호출 완료 출력
	}
	
	public Book00(String title) {
		this(title, "작자미상"); 
	}
	
	public Book00(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book00 littlePrince = new Book00("어린왕자", "생텍쥐페리");
		Book00 loveStory = new Book00("춘향전");
		Book00 emptyBook00 = new Book00();
		loveStory.show();
	}
}
