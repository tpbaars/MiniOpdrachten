package miniopdrachten.miniopdracht1.miniopdracht2;

public class LetterEInWordCounter {

    String word;

    LetterEInWordCounter(String word) {
        this.word = word;

    }

    public int letterECounter() {
        int eCount = 0;
        for (int i = 0; i < this.word.length(); i++) {
            char letter = this.word.charAt(i);
            char letterE = 'e';
            if (letter == letterE) {
                eCount++;
            }
        }
        return eCount;
    }
}
