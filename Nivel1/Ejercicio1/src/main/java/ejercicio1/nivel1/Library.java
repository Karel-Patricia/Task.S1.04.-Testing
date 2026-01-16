package ejercicio1.nivel1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String title) {
        books.add(title);
    }




}
