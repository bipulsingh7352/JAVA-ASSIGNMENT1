// Library System to manage books
class Book {
    String title;
    String author;
    int quantity;
    double price;
    double discount;

    // Constructor
    public Book(String title, String author, int quantity, double price, double discount) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    // Method to update quantity
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Method to calculate total cost after discount
    public double calculateTotalCost() {
        double total = quantity * price;
        return total - (total * (discount / 100));
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per book: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total cost after discount: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Creating a book object
        Book myBook = new Book("Java Programming", "James Gosling", 5, 50.0, 15);

        // Displaying book details
        System.out.println("Initial Book Details:");
        myBook.displayBookDetails();

        // Updating quantity
        myBook.updateQuantity(7);
        System.out.println("\nAfter updating quantity:");
        myBook.displayBookDetails();
    }
}