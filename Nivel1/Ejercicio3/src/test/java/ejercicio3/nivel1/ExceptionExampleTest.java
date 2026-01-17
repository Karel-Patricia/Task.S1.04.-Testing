package ejercicio3.nivel1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ExceptionExampleTest {

    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {
        ExceptionExample example = new ExceptionExample();

        assertThatThrownBy(example::causeException)
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }
}
