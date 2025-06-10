// Encapsulation: Keeping fields private and exposing them through public getters and setters
abstract class LibraryItem {
    private String title;
    private int itemID;
    private boolean available;

    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
        this.available = true; // initially, the item is available
    }

    public String getTitle() {
        return title;
    }

    public int getItemID() {
        return itemID;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Abstract method (Abstraction)
    public abstract void borrowItem();
    public abstract void returnItem();
}

// Inheritance: Book and DVD extend LibraryItem
class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemID, String author) {
        super(title, itemID);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Polymorphism: overriding borrowItem() and returnItem()
    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book '" + getTitle() + "' by " + author + " has been borrowed.");
        } else {
            System.out.println("Book '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable()) {
            setAvailable(true);
            System.out.println("Book '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("Book '" + getTitle() + "' was not borrowed.");
        }
    }
}

class DVD extends LibraryItem {
    private int duration; // in minutes

    public DVD(String title, int itemID, int duration) {
        super(title, itemID);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    // Polymorphism: overriding borrowItem() and returnItem()
    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("DVD '" + getTitle() + "' (Duration: " + duration + " min) has been borrowed.");
        } else {
            System.out.println("DVD '" + getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable()) {
            setAvailable(true);
            System.out.println("DVD '" + getTitle() + "' has been returned.");
        } else {
            System.out.println("DVD '" + getTitle() + "' was not borrowed.");
        }
    }
}

// Main class to demonstrate polymorphism
public class LibraryTest {
    public static void main(String[] args) {
        // Creating sample items
        LibraryItem[] items = new LibraryItem[4];
        items[0] = new Book("The Great Gatsby", 101, "F. Scott Fitzgerald");
        items[1] = new DVD("Inception", 201, 148);
        items[2] = new Book("1984", 102, "George Orwell");
        items[3] = new DVD("The Matrix", 202, 136);

        // Demonstrating polymorphism: borrow and return items using the LibraryItem reference
        System.out.println("=== Borrowing Items ===");
        for (LibraryItem item : items) {
            item.borrowItem();
        }

        System.out.println("\n=== Attempting to Borrow Already Borrowed Items ===");
        for (LibraryItem item : items) {
            item.borrowItem(); // Should display a message that it's already borrowed
        }

        System.out.println("\n=== Returning Items ===");
        for (LibraryItem item : items) {
            item.returnItem();
        }

        System.out.println("\n=== Checking Status After Returning ===");
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " is available: " + item.isAvailable());
        }
    }
}
