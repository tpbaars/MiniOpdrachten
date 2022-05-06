package miniopdrachten.miniopdracht1.miniopdracht2;

public class App {

    public static void main(String[] args) {
        LetterEInWordCounter letterECounter = new LetterEInWordCounter("regenen");
        int eCount = letterECounter.letterECounter();
        System.out.println(eCount);

    }
}
