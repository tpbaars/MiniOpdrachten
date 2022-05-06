package weekopdracht1;


public class Dice {
    private int min = 1;
    private int max = 6;

    public int roll() {
        int eyes = 1 + ((int) (Math.random() * 6));
        return eyes;
    }



}
