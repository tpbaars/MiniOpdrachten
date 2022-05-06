package weekopdracht2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<KermisAttractie> kermisAttracties = new ArrayList<>();
        kermisAttracties.add(new KermisAttractie("Botsauto's", 2.00, 5, 30));
        kermisAttracties.add(new KermisAttractie("Zweefmolen", 1.00, 2, 20));
        kermisAttracties.add(new KermisAttractie("Achtbaan", 4.00, 2, 15));
        kermisAttracties.add(new KermisAttractie("Octopus", 3.00, 2, 20));
        kermisAttracties.add(new KermisAttractie("Touwtje trekken", 2.00, 10, 10));
        kermisAttracties.add(new KermisAttractie("Schiettent", 2.00, 10, 10));
        kermisAttracties.add(new KermisAttractie("Blikgooien", 2.00, 10, 10));
        kermisAttracties.add(new KermisAttractie("Draaimolen", 3.00, 2, 20));
        kermisAttracties.add(new KermisAttractie("Spookhuis", 4.00, 5, 20));
        kermisAttracties.add(new KermisAttractie("Kop van Jut", 2.00, 10, 1));

        Inpector inspector = new Inpector();
        double totalRevenue = 0;
        for (int i = 0; i < 3; i++) {
            for (KermisAttractie kermisAttractie : kermisAttracties) {
                if (kermisAttractie.getRounds() >= kermisAttractie.getRoundsBeforeInspection()) {
                    boolean defect = inspector.inspect(kermisAttractie);
                    kermisAttractie.setDefect(defect);
                }
                if (kermisAttractie.isDefect()) {
                    kermisAttracties.remove(kermisAttractie);
                }
                int customers = 1 + (int) (Math.random() * kermisAttractie.getMaxCustomers());
                kermisAttractie.perform(customers);
                totalRevenue += kermisAttractie.getRoundRevenue(customers);
            }
        }
        double btw = 0.06 * totalRevenue;
        for (KermisAttractie kermisAttractie : kermisAttracties) {
            System.out.println("Omzet " + kermisAttractie.getName() + ": " + kermisAttractie.getTotalRevenue());
        }
        System.out.println("Totale omzet: " + totalRevenue);
        System.out.println("Totale BTW: " + btw);
    }
}


