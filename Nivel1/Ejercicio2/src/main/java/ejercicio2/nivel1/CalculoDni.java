package ejercicio2.nivel1;

public class CalculoDni {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateLetter(int number) {
        if (number < 0 || number > 99_999_999) {
            throw new IllegalArgumentException("Invalid DNI number");
        }
        return LETTERS.charAt(number % 23);
    }







}
