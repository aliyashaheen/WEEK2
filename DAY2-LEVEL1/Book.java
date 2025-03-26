import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String isbn, String t, String a) {
        ISBN = isbn;
        title = t;
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    EBook(String isbn, String t, String a) {
        super(isbn, t, a);
    }

    void displayEBook() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ISBN:");
        String isbn = sc.nextLine();

        System.out.println("Enter Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author:");
        String author = sc.nextLine();

        EBook ebook = new EBook(isbn, title, author);
        ebook.display();
        ebook.displayEBook();

        sc.close();
    }
}
