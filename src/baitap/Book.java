package baitap;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean browsed;
    private static int totalBooks = 0;

    public Book ( String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.browsed = browsed;

    }
    public void brorowBook(){
        this.browsed = true;
    }

        public void returnBook(){
        this.browsed = false;
        }

}

