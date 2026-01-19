package ejercicio1.nivel1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class LibraryTest {

    @Test
    void libraryCollectionShouldNotBeNull() {
        Library library = new Library();

        assertThat(library.getBooks()).isNotNull();
    }

    @Test
    void librarySizeShouldIncreaseWhenAddingBooks() {
        Library library = new Library();

        library.addBook("Clean Code");
        library.addBook("Effective Java");

        assertThat(library.getBooks()).hasSize(2);
    }

    @Test
    void shouldReturnCorrectBookByIndex() {
        Library library = new Library();

        library.addBook("Clean Code");
        library.addBook("Effective Java");

        assertThat(library.getBookByIndex(1)).isEqualTo("Effective Java");
    }

    @Test
    void shouldInsertBookAtSpecificPosition() {
        Library library = new Library();

        library.addBook("Clean Code");
        library.addBook("Refactoring");

        library.addBookAt(1, "Effective Java");

        assertThat(library.getBooks())
                .containsExactly("Clean Code", "Effective Java", "Refactoring");
    }

    @Test
    void shouldRemoveBookByTitle() {
        Library library = new Library();

        library.addBook("Clean Code");
        library.addBook("Effective Java");

        library.removeBook("Clean Code");

        assertThat(library.getBooks()).hasSize(1);
    }

    @Test
    void shouldReturnSortedCopyWithoutModifyingOriginalList() {
        Library library = new Library();

        library.addBook("Clean Code");
        library.addBook("Effective Java");
        library.addBook("Algorithms");

        List<String> sortedBooks = library.getSortedBooks();

        assertThat(sortedBooks)
                .containsExactly("Algorithms", "Clean Code", "Effective Java");

        assertThat(library.getBooks())
                .containsExactly("Clean Code", "Effective Java", "Algorithms");
    }

    @Test
    void shouldNotAllowDuplicateBookTitles() {
        Library library = new Library();

        library.addBook("Clean Code");
        library.addBook("Clean Code");

        assertThat(library.getBooks())
                .hasSize(1)
                .containsExactly("Clean Code");
    }

}
