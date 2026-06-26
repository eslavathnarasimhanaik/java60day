package Day02;

public class Book {
    String title;
    String  author; 

    Book(String title,String author){
        this.title = title;
        this.author = author;
    }
    void read(){
        System.out.println("reading ");
    }

    public static void main(String[] args) {
        Book b = new Book(null, null);
        System.out.println(b.title);
        System.out.println(b.author);
        b.read();
        
    }
}
