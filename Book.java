public class Book {
    String title;
    String author;
    Double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }
    public void displayDetails() {
        System.out.println("-----------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        // TODO: Complete the rest of this method.
    }
    public void updatePrice(double newPrice) {
        if(newPrice <= 0.0){
            System.out.println("-----------------------------------------------");
            System.out.println("INVALID newPRICE!");
        } else {
            price = newPrice;
        }
    }
    public void applyDiscount(double discount){
        if(discount <= 0.00 || discount >= 100.00){
            System.out.println("-----------------------------------------------");
            System.out.println("INVALID discount!!!");
        }
        else{
            price = price * (1 - discount / 100);
            System.out.println("Discount of " + discount + "% applied. New price: " + price);
        }
    }
}
