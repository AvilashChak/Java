package myJavaPractice;
class Library {
    String[] books;
    public int no_of_books;
    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" this book has been added.");
    }
    void showAvailableBooks() {
        System.out.println("Available books are: ");
        for(String book : this.books) {
            if(book == null) {
                continue;
            }
            System.out.println("> "+ book);
        }
    }
    void issueBook(String book) {
        for(int i=0; i<this.books.length; i++ ) {
            if(this.books[i].equals(book)) {
                System.out.println("The "+book+" book is issued.");
                this.books[i] = null;
                return;
            }
        }
            System.out.println("This "+book+" doesn't exist.");
    }
    void returnBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("The "+book+" book has been returned.");
    }
}

public class practice_exercise_4 {
    public static void main(String[] args) {
        // You have to implement a library using Java class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books, array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Song of Ice and Fire");
        centralLibrary.addBook("House of Dragons");
        centralLibrary.addBook("2 States");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Song of Ice and Fire");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Song of Ice and Fire");
        centralLibrary.showAvailableBooks();

    }
}
