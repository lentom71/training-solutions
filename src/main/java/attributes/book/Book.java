package attributes.book;

public class Book {
    String title;

    public Book(String title)
    {
        this.title = title;
    }

    public void  setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
}


class BookMain
{
    public static void main(String[] args) {
        Book bok = new Book("Zabhegyező");
        System.out.println(bok.getTitle());

        bok.setTitle("Winnetou");
        System.out.println(bok.getTitle());
    }
}