package projects;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String description;
    private boolean isBorrowed;

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }
}

// LibraryOperations interface
interface LibraryOperations {
    void borrowBook(String title);

    void returnBook(String title);

    void viewBooks();

    void searchBook(String title);

    void submitBook();
}

// Library class implementing LibraryOperations
class Library implements LibraryOperations {
    private List<Book> books = new ArrayList<>();

    public Library() {
        books = BookData.getBooks();
    }
    public void borrowBook(String title) {
        if (title.isEmpty()) {
            System.out.println("Please enter the book name.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You have borrowed: " + book.getTitle());
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void returnBook(String title) {
        if (title.isEmpty()) {
            System.out.println("Please enter the book name.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You have returned: " + book.getTitle());
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void viewBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + (book.isBorrowed() ? " (Borrowed)" : ""));
            System.out.println("Description: " + book.getDescription());
        }
    }

    public void searchBook(String title) {
        if (title.isEmpty()) {
            System.out.println("Please enter the book name.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + (book.isBorrowed() ? " (Borrowed)" : ""));
                System.out.println("Description: " + book.getDescription());
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    public void submitBook() {
        Scanner scanner = new Scanner(System.in);

        String title, author, description;

        while (true) {
            System.out.print("Enter the book title: ");
            title = scanner.nextLine().trim();
            if (!title.isEmpty()) {
                break;
            } else {
                System.out.println("Book title cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter the author: ");
            author = scanner.nextLine().trim();
            if (!author.isEmpty() && !author.matches(".*\\d.*")) {
                break;
            } else {
                System.out.println("Invalid input. Author name cannot be empty or contain numbers. Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter a description for the book: ");
            description = scanner.nextLine().trim();
            if (!description.isEmpty()) {
                break;
            } else {
                System.out.println("Description cannot be empty. Please try again.");
            }
        }

        books.add(new Book(title, author, description));
        System.out.println("Thank you for submitting '" + title + "' by " + author + " to the library!");
    }
}

// User class
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Library Management System with improved input validation
public class Library_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        User user;

        // Input validation for user's name
        while (true) {
            System.out.print("Please enter your name: ");
            String userName = scanner.nextLine().trim();

            // Ensure name is alphabetic (can include spaces) and not empty
            if (!userName.isEmpty() && userName.matches("[a-zA-Z\\s]+")) {
                user = new User(userName);
                System.out.println("Hello, " + user.getName() + "!");
                break;
            } else {
                System.out.println("Invalid input. Name must contain only alphabetic characters and spaces. Please try again.");
            }
        }

        // Menu loop
        while (true) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. View Books");
                System.out.println("2. Borrow a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. Search for a Book");
                System.out.println("5. Submit a Book to the Library");
                System.out.println("6. Exit");

                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        library.viewBooks();
                        break;
                    case 2:
                        String borrowTitle;
                        while (true) {
                            System.out.print("Enter the book title to borrow: ");
                            borrowTitle = scanner.nextLine().trim();
                            if (!borrowTitle.isEmpty()) {
                                library.borrowBook(borrowTitle);
                                break;
                            } else {
                                System.out.println("Book title cannot be empty. Please try again.");
                            }
                        }
                        break;
                    case 3:
                        String returnTitle;
                        while (true) {
                            System.out.print("Enter the book title to return: ");
                            returnTitle = scanner.nextLine().trim();
                            if (!returnTitle.isEmpty()) {
                                library.returnBook(returnTitle);
                                break;
                            } else {
                                System.out.println("Book title cannot be empty. Please try again.");
                            }
                        }
                        break;
                    case 4:
                        String searchTitle;
                        while (true) {
                            System.out.print("Enter the book title to search: ");
                            searchTitle = scanner.nextLine().trim();
                            if (!searchTitle.isEmpty()) {
                                library.searchBook(searchTitle);
                                break;
                            } else {
                                System.out.println("Book title cannot be empty. Please try again.");
                            }
                        }
                        break;
                    case 5:
                        library.submitBook();
                        break;
                    case 6:
                        System.out.println("Thank you for using the Library Management System.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}
