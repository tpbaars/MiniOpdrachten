package miniopdrachten.miniopdracht1.miniopdracht9;

public class Spreeuw implements Vliegend {


    @Override
    public void vliegen() {
        System.out.println("Vliegen als een spreeuw");

    }

    @Override
    public int getAltitude() {
        return 150;
    }
}
