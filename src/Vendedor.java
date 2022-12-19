import java.util.ArrayList;
import java.util.Random;

public class Vendedor {
    private final String name;
    private final String lastName;
    private Mercado market;
    private double salesAmount;
    private int qntSells;
    private final ArrayList<String> buyersNames = new ArrayList<>();
    private double bonus;
    private double total;

    public Vendedor(){
        Random random = new Random();
        this.name     = Main.namesList[random.nextInt(Main.namesList.length)];
        this.lastName = Main.lastNameList[random.nextInt(Main.lastNameList.length)];
    }

    public String getName() {
        return this.name + " " + this.lastName;
    }

    public void setMarket(Mercado market) {
        this.market = market;
    }

    public void sell(double value) {
        if (salesAmount > 0) {
            this.qntSells = getQntSells() + 1;
            this.salesAmount = salesAmount + value;
        } else {
            this.qntSells = 1;
            this.salesAmount = value;
        }
    }

    public double getSalesAmount() {
        return this.salesAmount;
    }

    public Mercado getMarket() {
        return market;
    }

    public int getQntSells() {
        return qntSells;
    }

    public void setQntSells(int qntSells) {
        this.qntSells = qntSells;
    }

    public void setBuyersNames(String name) {
        buyersNames.add(name);
    }

    public ArrayList<String> getBuyersNames() {
        return buyersNames;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return name + lastName;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}