package isep;

import javax.security.auth.callback.CallbackHandler;
import java.util.Arrays;

public class StringExercices {

    //Exercícios com Strings:
    //a. Converter String para maiusculas ou minusculas.
    //a.1 Converter a primeira letra de cada palavra de uma string em maiusculas.
    //b. Retirar espaços desnecessários numa string.
    //c. Verificar se uma String é palindroma.
    //d. Verificar se um número em formato String é capicua.
    //e. Verificar se um número tem algarismos iguais.
    //f. Retornar número de algarismos de um número.
    //g. Substituir letras numa String.

    //a.

    public static String convertToUppercaseOrLowercase (String text) {
        boolean isUpperCase = isCharacterUpperCase(text);
        if (isUpperCase==true) {
            text = text.toLowerCase();
        }
        else if (isUpperCase==false) {
            text = text.toUpperCase();
        }
        return text;
    }

    public static boolean isCharacterUpperCase (String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //a.1

    public static boolean isFirstCharacterUpperCase (String [] text) {
        for (int i = 0; i < text.length; i++) {
            if (Character.isUpperCase(text[i].charAt(0))) {
                return true;
            }
        }
        return false;
    }

    public static String convertFirstLetterWordUppercase (String text) {
        text = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();

        String finaltext = "";
        for (int i = 0; i < text.length(); i++) {
            finaltext = finaltext + text.charAt(i);
            if (text.charAt(i) == ' ') {
                char upperCase = Character.toUpperCase(text.charAt(i+1));
                finaltext = finaltext + upperCase;
                i++;
            }
        }
        return finaltext;
    }


    //b.

    public static int findSpacesBeginning (String text) {
        int posInitial = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                posInitial = i;
                return posInitial;
            }
        }
        return posInitial;
    }

    public static int findSpacesEnd (String text) {
        int posInitial = 0;

        for (int i = text.length(); i > 0; i++) {
            if (text.charAt(i) != ' ') {
                posInitial = i;
                return posInitial;
            }
        }
        return posInitial;
    }

    public static String delSpacesBeginning (String text) {
        String finaltext = "";
        int spaces = findSpacesEnd(text);

        int i = spaces;
        while (i < text.length()) {
            finaltext = finaltext + text.charAt(i);

            i++;
        }

        return finaltext;
    }

    public static String delSpacesEnd (String text) {
        String finaltext = "";
        int spaces = findSpacesBeginning(text);

        int i = 0;
        while (i < text.length()-5) {
            finaltext = finaltext + text.charAt(i);

            i++;
        }

        return finaltext;
    }

    public static String delSpaces (String text) {
        String finaltext = "";
        int inital = findSpacesBeginning(text);
        int end = findSpacesEnd(text);

        for (int i = inital; i < end; i++) {
            if (text.charAt(i) != ' ') {
                finaltext = finaltext + text.charAt(i);
                if (text.charAt(i) == ' ' && text.charAt(i-1) != ' ') {
                    finaltext = finaltext + text.charAt(i);
                }
            }
        }

        return finaltext;
    }

    //c.

    public static String returnSimetric (String text) {
        char [] charCopy = text.toCharArray();
        char [] charAux = new char[text.length()];
        int pos = text.length()-1;
        for (int i = 0; i < text.length(); i++) {
            charAux[i] = charCopy[pos];
            pos--;
        }
        String result = String.valueOf(charAux);
        return result;
    }

    public static boolean isPalindrome (String text1) {
        String result = returnSimetric(text1);
        if(result.equals(text1)) {
            return true;
        }
        else
            return false;
    }

    //d.

    public static boolean isCapicua (int num) {
        String number = Integer.toString(num);
        String result = returnSimetric(number);
        if(result.equals(number)) {
            return true;
        }
        else
            return false;
    }

    //e.

    public static int moreThanOneEqualAlg (int number, char digit) {
        String num = Integer.toString(number);
        char [] numb = num.toCharArray();
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (numb[i] == digit) {
                count++;
            }
        }
        return count;
    }

    //f.

    public static int digitsNumber (int number) {
        String num = Integer.toString(number);
        int result = num.length();
        return result;
    }

    //OU

    public static int digitsNumber2 (int number) {
        String num = Integer.toString(number);
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            count++;
        }
        return count;
    }

    //g.

    public static String substituteLetters (String text, char letter1, char letter2) {
        String finaltext = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter1) {
                char newLetter = letter2;
                finaltext = finaltext + newLetter;
            }
            else {
                finaltext = finaltext + text.charAt(i);
            }
        }
        return finaltext;
    }
}
