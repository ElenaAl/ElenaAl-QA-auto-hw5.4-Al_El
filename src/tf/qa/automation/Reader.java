package tf.qa.automation;
import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books){
        Random random = new Random();
        int bookId = random.nextInt(books.length);
        //System.out.println(books[bookId].name + books[bookId].author + books[bookId].id + books[bookId].pages);
        String name=books[bookId].name;
        String author=books[bookId].author;
        int id=books[bookId].id;
        int pages=books[bookId].pages;

        Book book=new Book(name, author, id, pages);
        return book;
    }

    public void readBook(Book book) {

        System.out.println(book);
    }

    public void rate(Book book) {
        String name;
        int n;
        String author;
        int a=0;
        int id=book.id;
        int pages;
        int rate;

        Random random = new Random();
        int ran1=0;
        int ran2=0;
        int ran3=0;

        if (book.name!="Story without name"){
            name= book.name;
            n=name.length();
        }
        else {
            n=0;
            ran1= random.nextInt();
        }

        if (book.author!="NoNameAuthor"){
            author= book.author;
            a=author.length();
        }
        else {
            n=0;
            ran2= random.nextInt();
        }

        if (book.pages!=1){
            pages=book.pages;
        }
        else {
            pages=0;
            ran3= random.nextInt();
        }

        // в данном случае id у книги есть всегда

        rate=n+a-id+pages-ran1-ran2-ran3;

        System.out.println("Название книги: "+book.name+"\nОценка пользователя: "+rate);
    }

}

