package tf.qa.automation;

public class LibCreat {

    public static void library(Book[] books) {
        String name = "Happy book";
        int addname =0;
        String author = "Artur";
        int id = 568;
        int pages = 100;
        int countBook;
        for (countBook = 0; countBook < books.length; countBook++) {
            if (countBook % 3 == 0) {
                books[countBook] = new Book(name + addname+3, id +103, pages);
                addname+=3;
                id+=3;
                pages += 50;
                //ниже код для проверки работы создания книг для библиотеки
                //System.out.println(books[countBook].name+" " + books[countBook].author+" "  + books[countBook].id+" "  + books[countBook].pages);
            }
            if (countBook % 7 == 0) {
                books[countBook] = new Book(name + addname+7, id + 207);
                addname+=7;
                id+=7;
                //ниже код для проверки работы создания книг для библиотеки
                //System.out.println(books[countBook].name+" "  + books[countBook].author+" "  + books[countBook].id+" "  + books[countBook].pages);
            }
            if (countBook % 5 == 0) {
                books[countBook] = new Book(id + 305, pages);
                id+=5;
                pages += 10;
                //ниже код для проверки работы создания книг для библиотеки
                //System.out.println(books[countBook].name+" "  + books[countBook].author+" "  + books[countBook].id+" "  + books[countBook].pages);
            } else {
                books[countBook] = new Book(name + addname+1, author, id + 1, pages);
                addname+=1;
                id+=1;
                pages += 0;
                //ниже код для проверки работы создания книг для библиотеки
                //System.out.println(books[countBook].name+" "  + books[countBook].author+" "  + books[countBook].id+" " + books[countBook].pages);
            }
        }
        //ниже код для проверки работы создания книг для библиотеки
        // System.out.println(books.length);

    }
}
