import java.util.Random;

public class Vendedor {
    private final String name;
    private final String lastName;
    private Mercado market;
    private double salesAmount;
    private int qntSells;

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
        this.salesAmount = value;
    }

    public double getSalesAmount() {
        return this.salesAmount;
    }

    @Override
    public String toString() {
        return name + lastName;
    }

    public int getQntSells() {
        return qntSells;
    }

    public void setQntSells(int qntSells) {
        this.qntSells = qntSells;
    }
}