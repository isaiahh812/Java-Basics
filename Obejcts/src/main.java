import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int myArray [] = new int [10];
		Book firstBook = new Book();
		firstBook.setAuthor("Moses Hernandez");
		System.out.println(firstBook.getAuthor());
		Book secondBook = new Book("Isaiah Hernandez", 350, "Java Basics", "Code ORG", true, 15);
		
		System.out.println(secondBook.getNumChapters());
		*/
		Scanner scrn = new Scanner(System.in);
		int numBooks;
		System.out.println("How many books do you want to enter? ");
		numBooks = scrn.nextInt();
		Book books [] = new Book [numBooks];
		for(int i =0; i<books.length; i++) {
			String Author;
			int pages;
			String title;
			String pub;
			Boolean cover;
			int chapters;
			System.out.println("Name of the Author: ");
			scrn = new Scanner(System.in);
			Author = scrn.nextLine();
			System.out.println("Number of pages: ");
			pages = scrn.nextInt();
			System.out.println("Title: ");
			scrn = new Scanner(System.in);
			title = scrn.nextLine();
			System.out.println("Name of publisher: ");
			scrn = new Scanner(System.in);
			pub = scrn.nextLine();
			System.out.println("Is it a hardcover? ");
			scrn = new Scanner(System.in);
			String hard = scrn.nextLine();
			System.out.println("Number of chapters: ");
			chapters = scrn.nextInt();
			if(hard.equalsIgnoreCase("yes")) {
				cover = true;
			}
			else {
				cover = false;
			}
			books[i] = new Book(Author, pages, title, pub, cover,chapters);
		}
		for(int i =0; i < books.length; i++) {
			System.out.println(books[i].getTitle());
		}
		
	}

}
