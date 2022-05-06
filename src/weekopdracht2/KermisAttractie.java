package weekopdracht2;

public class KermisAttractie {

    private double price;
    private String name;
    private int rounds = 0;
    private int roundsBeforeInspection;

    private double totalRevenue = 0.00;
    private int maxCustomers;

    private boolean defect = false;

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getMaxCustomers() {
        return maxCustomers;
    }

    public void setMaxCustomers(int maxCustomers) {
        this.maxCustomers = maxCustomers;
    }

    KermisAttractie(String name, double price, int roundsBeforeInspection, int maxCustomers) {
        this.price = price;
        this.name = name;
        this.roundsBeforeInspection = roundsBeforeInspection;
        this.maxCustomers = maxCustomers;
    }

    public void perform(int customers) {
        System.out.println("Performing Kermisattractie " + this.name);
        this.rounds++;
        double roundRevenue = getRoundRevenue(customers);
        this.totalRevenue += roundRevenue;
    }

    public double getRoundRevenue(int customers) {
        return customers * this.price;
    }

    public double getBTW() {
        return 0.06 * this.totalRevenue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRoundsBeforeInspection() {
        return roundsBeforeInspection;
    }

    public void setRoundsBeforeInspection(int roundsBeforeInspection) {
        this.roundsBeforeInspection = roundsBeforeInspection;
    }

    public boolean isDefect() {
        return defect;
    }

    public void setDefect(boolean defect) {
        this.defect = defect;
    }

    @Override
    public String toString() {
        return "KermisAttractie{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", rounds=" + rounds +
                ", roundsBeforeInspection=" + roundsBeforeInspection +
                ", totalRevenue=" + totalRevenue +
                ", maxCustomers=" + maxCustomers +
                ", defect=" + defect +
                '}';
    }
}
