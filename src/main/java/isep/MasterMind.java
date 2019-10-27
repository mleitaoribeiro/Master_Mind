package isep;

import java.util.Random;
import java.util.Scanner;

public class MasterMind {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        String RESET = "\u001B[0m"; //codigo das várias cores!!!
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";

        System.out.println("                           " + RED + "MA" + YELLOW + "ST" + GREEN + "E" + BLUE + "R" + PURPLE + "MI" + CYAN + "ND" + "                          " + RESET);
        System.out.println();
        System.out.println("                      Welcome to MasterMind!");
        System.out.println();
        System.out.println("There is a secret combination of 4 colors that you have to guess. The colors can be repeated!");
        System.out.println("The colors are: " + RED + "R - Red " + YELLOW + "Y - Yellow " + GREEN + "G - Green " + BLUE + "B - Blue " + PURPLE + "P - Purple " + CYAN + "C - Cyan" + RESET);
        System.out.println("                      You have 12 tries.");
        System.out.println("                       (please write OK)");

        for (int i = 0; ; i++) { //obrigar o utilizador a clicar em ok!!!
            String start = reader.nextLine().toUpperCase();
            if (start.equals("OK")) {
                break;
            }
            if (! start.equals("OK")) {
                System.out.println("ERROR!");
            }
            System.out.println("                       (please write OK)");
        }

        System.out.println("                         Let's begin!");
        System.out.println();

        char [] solution = gerarString(); //gera uma solução aleatória
        char [] solutionCopy = solution; //copia a solução

        System.out.println();

        int nrGuesses = 11; //nr de tentativas possiveis
        for (int nrTries = 0; nrTries<=nrGuesses; nrTries++) { //para cada tentativa
            System.out.println("Enter your guess:");
            String trie = reader.nextLine().toUpperCase(); //o utlizador introduz uma resposta

            if (trie.length() > solution.length) { //se a resposta for > que 4, dá erro
                System.out.println("ERROR! The combination has only 4 colors!");
            }

            if (verifyColorPosition(solutionCopy,trie) == 4) { //vai à funcão verificar as cores e a posição
                break;
            }

            int remainingGuesses = nrGuesses - nrTries; //tentativas que restam

            if (nrGuesses != nrTries) { //se as tentativas feitas foram diferentes das tentativas que restam
                System.out.println("You have " + remainingGuesses + " tries."); //imprime o numero de tentativas que ainda faltam

            } else { //senao, se as tentivas acabarem, tentativas totais = tentivas feitas
                System.out.println();
                System.out.println("Sorry!!! You have no more tries!! Please try again!"); //programa acaba com esta mensagem
            }

            System.out.println();
        }

    }

    public static char [] gerarString () {
        Random c = new Random();
        char [] colors = {'R','Y','G','B','P','C'}; //chars que eu quero gerar
        char [] array = new char[4]; //array de chars que vai conter 4 chars da sequencia anterior
        for (int i = 0; i <array.length; i++) { //para os 4 espaços do array de chars
            int index = c.nextInt(6); //gerar um index aleatorio para um intervalo de 0 a 5 (6 espaços)
            array [i] = colors[index]; //preencher o array indice a indice com um char aleatorio do array colors
            System.out.print(array[i]);
        }
        return array;
    }

    public static int verifyColorPosition (char [] solution, String trie) {
        int countColorsRPosition = 0; //contar cor correta em posição correta
        int countColorsWPosition = 0; //contar cor correta em posição errada

        for (int i = 0; i < solution.length; i++) { //corre enquanto tiver o tamanho da solução
            if (trie.indexOf(solution[i]) != -1 && solution[i] == trie.charAt(i)) { //se a cor for correta, ou seja, dentro do string que a pessoa der tiver um cor que existe no array solução o resultado da função é sempre diferente de -1, e também a posição dos chars da string do utlizador for igual à da solução
                countColorsRPosition++; //conta +1
            }
            else if (trie.indexOf(solution[i]) != -1 && solution[i] != trie.charAt(i)) {//se a a cor for incorreta mas a posição estiver mal
                countColorsWPosition++; //conta+1
            }
        }
        System.out.println("There are " + (countColorsRPosition) + " colors in the right position and " + (countColorsWPosition) + " colors in the wrong position."); //aqui printa as cores que estão em posições corretas e as que estão em posições incorretas

        if (countColorsRPosition == 4) { // se todas as posições tiverem cores corretas, o programa parabeniza o utilizador e acaba
            System.out.println("Congratulations!! You guessed the secret combination!! :)");
        }
        return countColorsRPosition;
    }

}
