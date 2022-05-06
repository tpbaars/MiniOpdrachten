package miniopdrachten.miniopdracht1.miniopdracht8;

public class Kapitein {

    public void varen(Boot boot) {
        if (boot instanceof Speedboot) {
            boot.start();
            System.out.println("Ik zet mijn pet even af!");
        } else {
            boot.start();
            System.out.println("Ik houd mijn pet op");
        }
    }

}
