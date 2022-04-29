package miniopdracht9;

public class Vliegtuig implements Vliegend{



    @Override
    public void vliegen() {
        System.out.println("Vliegen als een vliegtuig");
    }

    @Override
    public int getAltitude() {
        return 100;
    }
}
