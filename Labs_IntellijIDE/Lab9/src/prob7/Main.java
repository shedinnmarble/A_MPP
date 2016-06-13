package prob7;

import java.util.List;

/**
 * Created by yafen on 2016/6/11.
 */
public class Main {
    public static void main(String[] args){
        Book book=new Book("test",100);
        List<BookCopy> bookCopy=book.getCopies();
        bookCopy.forEach(bookCopy1 -> bookCopy1.changeAvailability());
        bookCopy.forEach(bookCopy1 -> bookCopy1.changeAvailability());

        System.out.println(book.isAvailable());


    }
}
