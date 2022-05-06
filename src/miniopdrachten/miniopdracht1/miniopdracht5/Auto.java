package miniopdrachten.miniopdracht1.miniopdracht5;

public class Auto {

    boolean motor;
    boolean deur;
    boolean voorruit;
    boolean uitlaat;

    public Auto(boolean[] kapotteOnderdelen) {
        this.motor = kapotteOnderdelen[0];
        this.deur = kapotteOnderdelen[1];
        this.voorruit = kapotteOnderdelen[2];
        this.uitlaat = kapotteOnderdelen[3];
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor +
                ", deur=" + deur +
                ", voorruit=" + voorruit +
                ", uitlaat=" + uitlaat +
                '}';
    }
}
