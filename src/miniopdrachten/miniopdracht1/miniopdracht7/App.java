package miniopdrachten.miniopdracht1.miniopdracht7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String wordToGuess = "fiets";
        String guess = "";
        int attempts = 0;
        System.out.println("_____");
        while (attempts < 5 & !(guess.equals(wordToGuess))) {
            Scanner sc = new Scanner(System.in);
            guess = sc.nextLine();
            char[] guessCharArr = guess.toCharArray();
            char[] wordToGuessCharArr = wordToGuess.toCharArray();
            StringBuilder sbAlert = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                if (guessCharArr[i] == wordToGuessCharArr[i]) {
                    sbAlert.append(2);
                }
                if (guessCharArr[i] != wordToGuessCharArr[i] & !(wordToGuess.contains(Character.toString(guessCharArr[i])))) {
                    sbAlert.append(0);
                }
                if (guessCharArr[i] != wordToGuessCharArr[i] & wordToGuess.contains(Character.toString(guessCharArr[i]))) {
                    sbAlert.append(1);
                }
            }

            String alert = sbAlert.toString();
            System.out.println(alert);
            if (wordToGuess.equals(guess)) {
                System.out.println("U heeft het woord geraden");
            }
            if (alert != guess & attempts == 4) {
                System.out.println("U heeft het woord niet kunnen raden");
            }

            attempts++;

        }
    }


}
