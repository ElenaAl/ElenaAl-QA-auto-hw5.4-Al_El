package tf.qa.automation;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[100];
        LibCreat.library(books);
        Reader reader1=new Reader();
        books[0]=reader1.choiceBook(books);
        Book book =books[0];
        reader1.readBook(book);
        reader1.rate (book);
    }
}
