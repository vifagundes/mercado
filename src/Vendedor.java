import java.util.Random;

public class Vendedor {
    private final String name;
    private Mercado market;
    private final double salesAmount;
    private double bonus;
    private double total;

    public Vendedor(){
        Random random = new Random();
        this.name        = Main.namesList[random.nextInt(Main.namesList.length)];
        this.salesAmount = Comprador.shopping();
    }

    public String getName() {
        return this.name;
    }

    public double getSalesAmount() {
        return this.salesAmount;
    }

    public void setMarket(Mercado market) {
        this.market = market;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTotal() {
        return total;
    }

    public void setBonus() {
        this.bonus = Regulador.aplicar(this.salesAmount, market.getMeta());
    }

    public void setTotal() {
        this.total = salesAmount + bonus;
    }
}