// 4.Create a List<String> with book titles.
// Write methods to add a book title, remove a title, and check if a specific title exists.

import java.util.ArrayList;
import java.util.List;

public class hmw4 {

    private List<String> bookTitle;   // "variabila"

    public hmw4() {   // constructor
        bookTitle = new ArrayList<>();
    }

    public void addBookTitle(String title) {
        bookTitle.add(title);
        System.out.println("The new title add: " + title);
    }

    public void removeBookTitle(String title) {
        if (bookTitle.remove(title)) {
            System.out.println("The removed title is: " + title);
        } else {
            System.out.println(title + "The title hasn't been found.");
        }
    }

    public boolean checkTitle(String title) {
        if (bookTitle.contains(title)) {
            System.out.println("The title " + title + " is in the list.");
        } else {
            System.out.println("The title " + title + " hasn't been found.");
        }
        return bookTitle.contains(title);
    }


    public void printBookTitle() {
        System.out.println("The list of book titles: " + bookTitle);
    }

    public static void main(String[] args) {

        hmw4 bookList = new hmw4();

        bookList.addBookTitle("The little prince");
        bookList.addBookTitle("Bob");
        bookList.addBookTitle("The mentalist");
        bookList.addBookTitle("The Lord of the Rings");
        bookList.addBookTitle("Avatar");
        System.out.println(" ");
        bookList.printBookTitle();
        System.out.println(" ");
        bookList.removeBookTitle("The little prince");
        bookList.printBookTitle();
        System.out.println(" ");
        bookList.checkTitle("Bob");
        bookList.checkTitle("Hundreds");

    }
}
