package day1;
class Book {
    String title = "Java Basics";
    String author = "Naik";
    double price = 499.99;
    String isbn  =  "ISBN123";

    void read(){
        System.out.println("Reading book");

    }
    void borrow(){
        System.out.println("Borrowing book");
    }
    void returnBook(){
        System.out.println("Returning book");
    }
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title);
        System.out.println(b.author);
        System.out.println(b.price);
        System.out.println(b.isbn);
        b.read();
        b.borrow();
        b.returnBook();

    }
}
