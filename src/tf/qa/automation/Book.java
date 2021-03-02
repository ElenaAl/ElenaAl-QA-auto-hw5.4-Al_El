package tf.qa.automation;


public class Book {
    String name;
    String author;
    int id;
    int pages;


    Book(String name, String author, int id, int pages) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.pages = pages;

    }

    //далее делаем перегрузку конструкторов
    Book(String name, int id, int pages) {
        this.name = name;
        this.author = "NoNameAuthor";
        this.id = id;
        this.pages = pages;

    }

    Book(String name, int id) {
        this.name = name;
        this.author = "NoNameAuthor";
        this.id = id;
        this.pages = 1;

    }

    Book(int id, int pages) {
        this.name = "Story without name";
        this.author = "NoNameAuthor";
        this.id = id;
        this.pages = pages;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", pages=" + pages +
                '}';
    }

}
