package ejercicio2.nivel1;

public class CalculoDni {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateLetter(int number) {
        return LETTERS.charAt(number % 23);
    }

}
