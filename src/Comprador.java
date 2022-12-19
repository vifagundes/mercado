import java.util.Random;

public class Comprador {

    private final String name;
    private final String lastName;
    private final Mercado market;
    private final Vendedor seller;
    private double total;

    public Comprador(Mercado[] marketList) {
        Random random = new Random();
        this.name     = Main.namesList[random.nextInt(Main.namesList.length)];
        this.lastName = Main.lastNameList[random.nextInt(Main.lastNameList.length)];
        this.market   = marketList[random.nextInt(3)];
        this.seller   = market.getSellers()[random.nextInt(Main.qntSellers)];
    }

    public void buy() {
        Random random = new Random();
        double sellValue = random.nextDouble(901) + 100;
        this.setTotal(sellValue);
        seller.sell(sellValue);
        seller.setBuyersNames(this.getName());
    }

    public void setTotal(double value) {
        this.total = value;
    }

    public double getTotal() {
        return this.total;
    }

    public String getName() {
        return this.name + " " + this.lastName;
    }

    public Vendedor getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                name +
                lastName +
                ", market=" + market +
                ", seller=" + seller +
                ", total=" + total +
                '}';
    }
}
