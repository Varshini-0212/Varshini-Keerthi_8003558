package exercise06.library;

import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    // Linear Search
    public static Book linearSearch(Book[] books,
                                    String targetTitle) {

        for(Book book : books) {

            if(book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }

        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books,
                                    String targetTitle) {

        int left = 0;
        int right = books.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            int compare =
                    books[mid].title
                            .compareToIgnoreCase(targetTitle);

            if(compare == 0) {

                return books[mid];
            }
            else if(compare < 0) {

                left = mid + 1;
            }
            else {

                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {

                new Book(101,
                        "Java Programming",
                        "James Gosling"),

                new Book(102,
                        "Data Structures",
                        "Mark Allen"),

                new Book(103,
                        "Algorithms",
                        "Robert Sedgewick"),

                new Book(104,
                        "Database Systems",
                        "Elmasri")
        };

        // Linear Search
        Book result1 =
                linearSearch(
                        books,
                        "Algorithms");

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        // Sort books by title
        Arrays.sort(
                books,
                Comparator.comparing(
                        b -> b.title));

        // Binary Search
        Book result2 =
                binarySearch(
                        books,
                        "Algorithms");

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}