package miniopdracht2;

import miniopdracht2.LetterEInWordCounter;

public class App {

    public static void main(String[] args) {
        LetterEInWordCounter letterECounter = new LetterEInWordCounter("regenen");
        int eCount = letterECounter.letterECounter();
        System.out.println(eCount);

    }
}
