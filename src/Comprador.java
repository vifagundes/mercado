import java.util.Random;

public class Comprador {

    private final String name;
    private final String lastName;
    private Mercado market;
    private Vendedor seller;
    private double total;

    public Comprador(Mercado[] marketList) {
        Random random = new Random();
        this.name     = Main.namesList[random.nextInt(Main.namesList.length)];
        this.lastName = Main.lastNameList[random.nextInt(Main.lastNameList.length)];
        this.market   = marketList[random.nextInt(3)];
        this.seller   = market.getSellers()[random.nextInt(Main.qntSellers)];
    }

    public void buy(){
        Random random = new Random();
        double sellValue = random.nextDouble(901) + 100;
        if (seller.getSalesAmount() > 0) {
            seller.sell(seller.getSalesAmount() + sellValue);
            seller.setQntSells(seller.getQntSells() + 1);
        } else {
            seller.sell(sellValue);
            seller.setQntSells(1);
        }
    }

    public void setTotal() {
        this.total = this.seller.getSalesAmount();
    }

    public double getTotal() {
        return this.total;
    }

    public String getName() {
        return this.name + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", market=" + market +
                ", seller=" + seller +
                ", total=" + total +
                '}';
    }
}
