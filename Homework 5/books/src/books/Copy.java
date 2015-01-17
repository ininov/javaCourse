package books;

public class Copy {
	Book book1;
	int copy;
	
	public Copy(Book book1, int copy){
		super();
		this.book1 = book1;
		this.copy = copy;
	}

	public Book getBook1() {
		return book1;
	}

	public void setBook1(Book book1) {
		this.book1 = book1;
	}

	public int getCopy() {
		return copy;
	}

	public void setCopy(int copy) {
		this.copy = copy;
	}
	
}
