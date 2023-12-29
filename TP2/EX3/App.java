public class App {
    public static void main(String[] args) {
        // Create Books
        Book book1 = new Book("The Alchemist", "PAULO COHELO", 1900);
        Novel novel1 = new Novel("Harry Potter And the Sorcerer's Stone", "JK ROWLING", 1900, "Fiction", "YOU'RE A WIZARD HARRY");
        TextBook textbook1 = new TextBook("Introduction to Algorithms", "Some Computer Scientist", 1900, "ALGORITHMS & DATA STRUCTURES");

        // Create Library
        Library library = new Library(20);

        // Add Books to Library
        library.addBook(book1);
        library.addBook(novel1);
        library.addBook(textbook1);

        // Display all books in the library
        System.out.println("Books in the library:");
        library.listAllBooks();

        // Remove a book from the library
        library.removeBook("The Alchemist");

        // Display updated list of books in the library
        System.out.println("\nBooks in the library after removal:");
        library.listAllBooks();

        // Create a Student
        Student student = new Student("Alice", 20, 1001, 2025);

        // Create a Teacher
        Teacher teacher = new Teacher("Mr. Smith", 35, "Physics", 2001, 2024);

        // Perform operations for the student
        System.out.println("\nStudent borrowing books:");
        try {
            student.borrowBook(textbook1, 2023, library);
            student.showBorrowedBooks();
            student.returnBook(textbook1, 2023, library);
            student.showBorrowedBooks();
            student.borrowBook(book1, 2023, library);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Perform operations for the teacher
        System.out.println("\nTeacher borrowing books:");
        try {
            teacher.borrowBook(textbook1, 2023, library);
            teacher.showBorrowedBooks();
            teacher.returnBook(textbook1, 2023, library);
            teacher.showBorrowedBooks();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

