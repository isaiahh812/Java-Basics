
public class Book {
	String Author;
	int numPages;
	String title;
	String publisher;
	Boolean hardcover;
	int numChapters;
	
	
	Book(){
		
	}
	Book(String Author, int numPages, String title,String publisher, Boolean hardcover, int numChapters){
		this.Author = Author;
		this.numPages = numPages;
		this.title = title;
		this.publisher = publisher;
		this.hardcover = hardcover;
		this.numChapters = numChapters;
		
	}
	Book(String Author, String title){
		this.Author = Author;
		this.title = title;
	}
	
	
	void setAuthor(String Author) {
		this.Author = Author;
	}
	void setNumPages(int numPages) {
		this.numPages =numPages;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void setHardcover(Boolean hardcover) {
		this.hardcover = hardcover;
	}
	void setNumChapter(int numChapters) {
		this.numChapters = numChapters;
	}
	
	
	String getAuthor() {
		return this.Author;
	}
	int getNumPages() {
		return this.numPages;
	}
	String getTitle() {
		return this.title;
	}
	String getPublisher() {
		return this.publisher;
	}
	Boolean getHardcover() {
		return this.hardcover;
	}
	int getNumChapters() {
		return this.numChapters;
	}
	
}
