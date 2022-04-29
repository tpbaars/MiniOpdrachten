package miniopdracht5;

public class Monteur {

    double prijsReparatie;

    public double bepaalPrijsReparatie(Auto auto) {
        if (auto.motor) {
            this.prijsReparatie += 25;
        }
        if (auto.deur) {
            this.prijsReparatie += 25;
        }
        if (auto.voorruit) {
            this.prijsReparatie += 25;
        }
        if (auto.uitlaat) {
            this.prijsReparatie += 25;
        }
        return this.prijsReparatie;
    }
}
