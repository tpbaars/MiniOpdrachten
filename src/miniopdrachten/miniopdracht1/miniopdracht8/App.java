package miniopdrachten.miniopdracht1.miniopdracht8;

public class App {

    public static void main(String[] args) {
        Boot boot = new Boot();
        Kapitein kapitein1 = new Kapitein();
        kapitein1.varen(boot);

        Speedboot speedboot = new Speedboot();
        Kapitein kapitein2 = new Kapitein();
        kapitein2.varen(speedboot);

    }


}
