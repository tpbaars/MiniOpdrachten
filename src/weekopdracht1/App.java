package weekopdracht1;

public class App {

    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = dice.roll();
        System.out.println(roll1);
        int roll2 = dice.roll();
        System.out.println(roll2);
        int roll3 = dice.roll();
        System.out.println(roll3);
        System.out.println(roll1 + roll2 + roll3);
    }
}
