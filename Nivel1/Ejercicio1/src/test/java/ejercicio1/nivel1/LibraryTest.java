package ejercicio1.nivel1;

import org.junit.jupiter.api.Test;

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






}
