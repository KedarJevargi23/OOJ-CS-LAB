import java.util.Scanner;

class Book {
    public String book_name;
    public String author_name; 
    public int price;          
    public int num_pages;    

    
    Book(String book_name, String author_name, int price, int num_pages) {
        this.book_name = book_name;
        this.author_name = author_name;
        this.price = price;
        this.num_pages = num_pages;
    }

    @Override
    public String toString() {
        String name, author, price, numPages;
        name = "Book Name: " + this.book_name + "\n";
        author = "Author Name: " + this.author_name + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of Pages: " + this.num_pages + "\n";
        return name + author + price + numPages;
    }
}

public class ride {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of books: ");
        int count = sc.nextInt();
        sc.nextLine(); 

        Book[] arr = new Book[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter book " + (i + 1) + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter author " + (i + 1) + " name: ");
            String author = sc.nextLine();
            System.out.print("Enter book " + (i + 1) + " price: ");
            int price = sc.nextInt();
            System.out.print("Enter book " + (i + 1) + " pages: ");
            int pages = sc.nextInt();
            sc.nextLine(); 

            arr[i] = new Book(name, author, price, pages);
            System.out.println(arr[i]);
        }

        sc.close(); 
    }
}
