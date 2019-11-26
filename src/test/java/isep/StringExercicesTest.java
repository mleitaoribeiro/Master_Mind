package isep;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExercicesTest {

    //a.

    @Test
    @DisplayName("Return a uppercase word to lowercase")
    void converterParaMinusculas() {
        String result = StringExercices.convertToUppercaseOrLowercase("HELLO");
        assertEquals("hello", result);
    }

    @Test
    @DisplayName("Return a lowercase word to uppercase")
    void converterParaMaiusculas() {
        String result = StringExercices.convertToUppercaseOrLowercase("hello");
        assertEquals("HELLO", result);
    }

    @Test
    @DisplayName("Return word with 1 or more uppercase letters to uppercase")
    void converterParaMinusculas2() {
        String result = StringExercices.convertToUppercaseOrLowercase("heLLo");
        assertEquals("hello", result);
    }


    @Test
    @DisplayName("Return true to a String uppercase word")
    void isUpperCaseUppercase() {
        StringExercices c = new StringExercices();
        boolean result = c.isCharacterUpperCase("HELLO");
        assertEquals(true, result);
    }

    @Test
    @DisplayName("Return false to a String lowercase word")
    void isUpperCaseIsLowercase() {
        StringExercices c = new StringExercices();
        boolean result = c.isCharacterUpperCase("hello");
        assertEquals(false, result);
    }

    @Test
    @DisplayName("Return true to a String with one uppercase character")
    void isUpperCaseHasUppercaseCharacterBeggining() {
        StringExercices c = new StringExercices();
        boolean result = c.isCharacterUpperCase("Hello");
        assertEquals(true, result);
    }

    @Test
    @DisplayName("Return false to a String lowercase word")
    void isUpperCaseHasUppercaseCharacterEnd() {
        StringExercices c = new StringExercices();
        boolean result = c.isCharacterUpperCase("hellO");
        assertEquals(true, result);
    }

    @Test
    @DisplayName("Return false to a String lowercase word")
    void isUpperCaseHasUppercaseCharacterMiddle() {
        StringExercices c = new StringExercices();
        boolean result = c.isCharacterUpperCase("HeLlo");
        assertEquals(true, result);
    }

    //a.1

    @Test
    @DisplayName("Return true to a String with one word which first letter is uppercase")
    void isFirstCharacterUpperCaseWord() {
        StringExercices c = new StringExercices();
        boolean result = c.isFirstCharacterUpperCase(new String[]{"Hello World"});
        assertEquals(true, result);
    }

    @Test
    @DisplayName("Return false to a String with one word which first letter is not uppercase")
    void isFirstCharacterUpperCaseword() {
        StringExercices c = new StringExercices();
        boolean result = c.isFirstCharacterUpperCase(new String[]{"hello World"});
        assertEquals(false, result);
    }

    @Test
    @DisplayName("Return false to a String with one word which first letter is not uppercase but has uppercase letter " +
                    "in the middle")
    void isFirstCharacterUpperCasewoRd() {
        StringExercices c = new StringExercices();
        boolean result = c.isFirstCharacterUpperCase(new String[]{"heLlo worLd"});
        assertEquals(false, result);
    }

    @Test
    @DisplayName("Convert first letters of a string to uppercase of a 2 word string")
    void convertFirstLetterWordUppercaseStringTwoWords() {
        String result = StringExercices.convertFirstLetterWordUppercase("face branca");
        assertEquals("Face Branca", result);
    }

    @Test
    @DisplayName("Convert first letters of a string to uppercase of a 3 word string")
    void convertFirstLetterWordUppercaseStringThreeWords() {
        String result = StringExercices.convertFirstLetterWordUppercase("face branca avermelhada");
        assertEquals("Face Branca Avermelhada", result);
    }

    @Test
    @DisplayName("Convert first letters of a string to uppercase of a 3 word string")
    void convertFirstLetterWordUppercaseStringNome() {
        String result = StringExercices.convertFirstLetterWordUppercase("marta leitão ribeiro");
        assertEquals("Marta Leitão Ribeiro", result);
    }

    //b.

    @Test
    @DisplayName("Delete spaces that are not necessary in the beginning of the String")
    void delSpacesBeginning() {
        String result = StringExercices.delSpacesBeginning("     face      branca     ");
        assertEquals("face      branca     ", result);
    }

    @Test
    @DisplayName("Delete spaces that are not necessary in the end of the String")
    void delSpacesEnd() {
        String result = StringExercices.delSpacesEnd("     face      branca     ");
        assertEquals("     face      branca", result);
    }

    @Test
    @DisplayName("Delete spaces that are not necessary in a String")
    void delSpaces() {
        String result = StringExercices.delSpaces("     face      branca     ");
        assertEquals("face branca", result);
    }

    //c.

    @Test
    @DisplayName("Return the simetric of a 4 letter word")
    void returnSimetric4Letter() {
        String result = StringExercices.returnSimetric("face");
        assertEquals("ecaf", result);
    }

    @Test
    @DisplayName("Return the simetric of a 5 letter word")
    void returnSimetric5Letter() {
        String result = StringExercices.returnSimetric("major");
        assertEquals("rojam", result);
    }

    @Test
    @DisplayName("Return false when a word that is not a palindrome")
    void isPalindromeMajor() {
        boolean result = StringExercices.isPalindrome("major");
        assertEquals(false, result);
    }

    @Test
    @DisplayName("Return true when a word is a palindrome")
    void isPalindromeAna() {
        boolean result = StringExercices.isPalindrome("ana");
        assertEquals(true, result);
    }

    //d.

    @Test
    @DisplayName("Return a number that is not a capicua")
    void isCapicua123() {
        boolean result = StringExercices.isCapicua(123);
        assertEquals(false, result);
    }

    @Test
    @DisplayName("Return if a number is a capicua")
    void isCapicua1221() {
        boolean result = StringExercices.isCapicua(1221);
        assertEquals(true, result);
    }

    //e.

    @Test
    @DisplayName("Return how many 2 digits a number has")
    void moreThanOneEqualAlg2() {
        int result = StringExercices.moreThanOneEqualAlg(1221, '2');
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Return how many 4 digits a number has")
    void moreThanOneEqualAlg4() {
        int result = StringExercices.moreThanOneEqualAlg(4484, '4');
        assertEquals(3, result);
    }

    //f.

    @Test
    @DisplayName("Return how many digits a 448 has")
    void digitsNumber448() {
        int result = StringExercices.digitsNumber(448);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Return how many digits a 11500 has")
    void digitsNumber11500() {
        int result = StringExercices.digitsNumber(11500);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Return how many digits a 448 has")
    void digitsNumber2448() {
        int result = StringExercices.digitsNumber2(448);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Return how many digits a 448 has")
    void digitsNumber211500() {
        int result = StringExercices.digitsNumber2(11500);
        assertEquals(5, result);
    }

    //g.

    @Test
    @DisplayName("Substitute ã for a")
    void substituteLettersJoao() {
        String result = StringExercices.substituteLetters("João", 'ã', 'a');
        assertEquals("Joao", result);
    }
}