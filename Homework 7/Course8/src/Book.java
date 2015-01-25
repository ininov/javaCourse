
public abstract class Book {
	
	protected int words;
	protected String text;
	
	public Book(int words, String text){
		this.words = words;
		this.text = text;
		
	}
	
	public void countWords(){
		 String[] newWords = this.text.split(" ");			
		}


}
