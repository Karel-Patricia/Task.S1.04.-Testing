package ejercicio1.nivel1;

import java.util.*;

public class Library {

    private Set<String> books;

    public Library() {
        books = new LinkedHashSet<>();
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(String title) {
        books.add(title);
    }

    public String getBookByIndex(int index) {
        return getBooks().get(index);
    }

    public void addBookAt(int index, String title) {
        if (books.contains(title)){
            return;
        }

        List<String> tempList = new ArrayList<>(books);
        tempList.add(index, title);

        books.clear();
        books.addAll(tempList);
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






