// 12. Create a Book class with title, author, and year.
// Add several books to a Set<Book>, including some with the same author and title.
// Implement equals and hashCode to ensure each book is unique.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hmw12Book {

    public static void main(String[] args) {

        Set<Book> bookHashset = new HashSet<>();
        Set<Book> bookTreeSet = new TreeSet<>();
        Set<Book> bookLinkedHashSet = new LinkedHashSet<>();

        bookHashset.add(new Book("Tom Sawyer", "Mark Twain", 1987));
        bookHashset.add(new Book("Grangsta granny", "David Williams", 2020));
        bookHashset.add((new Book("The secret ZOO", "Bryan Chich", 2022)));
        bookHashset.add(new Book("Grangsta granny", "David Williams", 2020));
        bookHashset.add((new Book("The secret ZOO", "Bryan Chich", 2023)));
        bookHashset.add(new Book("Tom Sawyer", "Mark Twain", 1989));

        bookTreeSet.add(new Book("Tom Sawyer", "Mark Twain", 1987));
        bookTreeSet.add(new Book("Grangsta granny", "David Williams", 2020));
        bookTreeSet.add((new Book("The secret ZOO", "Bryan Chich", 2022)));
        bookTreeSet.add(new Book("Grangsta granny", "David Williams", 2020));
        bookTreeSet.add((new Book("The secret ZOO", "Bryan Chich", 2023)));
        bookTreeSet.add(new Book("Tom Sawyer", "Mark Twain", 1989));

        bookLinkedHashSet.add(new Book("Tom Sawyer", "Mark Twain", 1987));
        bookLinkedHashSet.add(new Book("Grangsta granny", "David Williams", 2020));
        bookLinkedHashSet.add((new Book("The secret ZOO", "Bryan Chich", 2022)));
        bookLinkedHashSet.add(new Book("Grangsta granny", "David Williams", 2020));
        bookLinkedHashSet.add((new Book("The secret ZOO", "Bryan Chich", 2023)));
        bookLinkedHashSet.add(new Book("Tom Sawyer", "Mark Twain", 1989));

        System.out.println(" ");
        for (Book book : bookHashset) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
        System.out.println("_________________________________________");
        for (Book book : bookTreeSet) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
        System.out.println("_________________________________________");
        for (Book book : bookLinkedHashSet) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
    }
}
