import java.util.Random;

public class Vendedor {
    private final String[] names =
            {"Vini", "Nicole" ,"Tuti", "Kiko", "Neymar", "Pedro", "Gabriel", "Rodrigo", "Ana", "Alisson",
            "Cleber", "Sergio" ,"Bruno", "Myllena", "Richarlison", "Lucas", "Xande", "Arthur", "Bianca","Bryan",
                    "Renata", "Messi" ,"Ronaldo", "Guilerme", "Roger", "Zeite", "Marcelo", "Yasmin", "Patricia"};
    private final String name;
    private Mercado market;
    private double salesAmount;
    private double bonus;
    private double total;

    Random random = new Random();

    public Vendedor(){
        this.name  = names[random.nextInt(29)];
    }

    public String getName() {
        return this.name;
    }

    public double getSalesAmount() {
        return this.salesAmount;
    }

    public void setSalesAmount() {
        Random random = new Random();
        this.salesAmount = random.nextDouble(901) + 100;
    }

    public void setMarket(Mercado market) {
        this.market = market;
    }

    public String getMarketName() {
        return market.getName();
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
