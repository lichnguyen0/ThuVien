package trienkhaisingleton;

// Bước 1 và 2: Lớp BookSingleton với thuộc tính và constructor private
public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    // Bước 3: Phương thức mượn sách
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    // Bước 4: Phương thức trả sách
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }

    // Bước 5: Các phương thức get
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
