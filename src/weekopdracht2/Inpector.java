package weekopdracht2;

public class Inpector {

    public boolean inspect(KermisAttractie kermisAttractie) {
        System.out.println("Inspecting " + kermisAttractie.getName());
        boolean defect = Math.random() < 0.2;
        return defect;

    }
}
