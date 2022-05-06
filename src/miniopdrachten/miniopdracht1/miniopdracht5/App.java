package miniopdrachten.miniopdracht1.miniopdracht5;

public class App {

    public static void main(String[] args) {
        boolean[] kapotteOnderdelen = {false, true, true, true};
        Auto auto = new Auto(kapotteOnderdelen);
        Monteur monteur = new Monteur();
        double prijsReparatie = monteur.bepaalPrijsReparatie(auto);
        System.out.println(auto.toString());
        System.out.println(prijsReparatie);

    }
}
