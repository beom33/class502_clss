package exam01;

import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book (1000, "책1", "저자1"));
        books.add(new Book (1000, "책1", "저자1"));
        books.add(new Book (1000, "책1", "저자2"));
        books.add(new Book (1000, "책1", "저자3"));
        books.add(new Book (1000, "책1", "저자4"));
        books.add(new Book (1000, "책1", "저자5"));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
