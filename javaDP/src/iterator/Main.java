package iterator;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("삼국지"));

		// 명시적 Iterator 사용방법
		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();

		// 확장 for문 사용방법
		for (Book book : bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}
}
