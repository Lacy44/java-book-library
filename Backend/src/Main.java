import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book(1,"Still Me","Jojo Moyes"));
        books.add(new Book(2,"It Starts with Us","Coleen Hoover"));
        books.add(new Book(3,"It Starts with Us","Coleen Hoover"));
        books.add(new Book(4,"Matilda","Ronald Dahl"));

        for(Book book : books){
            System.out.println(book);
        }

        HashSet<String> authors = new HashSet<>();

        for (Book book : books){
            authors.add(book.getAuthor());
        }

        System.out.println(authors);

        HashMap<Integer,Book> bookHashMap= new HashMap<>();

        for (Book book: books){
            bookHashMap.put(book.getId(),book);
        }

        System.out.println(bookHashMap.get(3));


    }
}