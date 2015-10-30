package HelloW;

public class Book {
	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;

		System.out.println(this.title);
		System.out.println(this.author);
		System.out.println(this.ISBN);
	}

	public Book(String title, int ISBN) {
		this(title, "Anonymous", ISBN);
	}

	public Book() {
		this(null, null, 0);
		System.out.println("�����ڰ� ȣ��Ǿ���");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 Ȳ����");
		Book javaBook = new Book("Java JDK", "Ȳ����", 201205040);
		Book holyBible = new Book("Holy Bible", 1);
		Book emptyBook = new Book();
	}

}
