public class BooksExample {
    public static void main(String[] args) {
        Books book1 = new Books("Fyodor", "Crime and Punishment", 19.99, 54321);
        Books book2 = new Books("Osamu", "No Longer Human", 39.99, 67890);

        double totalPrice = book1.getPrice() + book2.getPrice();
        
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + " - Price: $" + book1.getPrice());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + " - Price: $" + book2.getPrice());
        System.out.println("Total Price for both books: $" + totalPrice);
    }
}