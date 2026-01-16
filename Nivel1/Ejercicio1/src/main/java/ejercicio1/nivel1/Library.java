package ejercicio1.nivel1;

import java.util.ArrayList;
import java.util.Collections;
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

    public String getBookByIndex(int index) {
        return books.get(index);
    }

    public void addBookAt(int index, String title) {
        if (!books.contains(title)) {
            books.add(index, title);
        }
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public List<String> getSortedBooks() {
        List<String> sorted = new ArrayList<>(books);
        Collections.sort(sorted);
        return sorted;
    }







}






