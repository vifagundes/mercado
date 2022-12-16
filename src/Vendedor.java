import java.util.Random;

public class Vendedor {
    private final String name;
    private Mercado market;
    private final double salesAmount;
    private double bonus;
    private double total;

    public Vendedor(){
        Random random = new Random();
        String[] namesList = {"Vini", "Nicole", "Tuti", "Kiko", "Neymar", "Pedro", "Gabriel", "Rodrigo", "Ana",
                "Alisson", "Wellington", "Cleber", "Sergio", "Bruno", "Myllena", "Richarlison", "Lucas", "Xande",
                "Arthur", "Bianca", "Bryan", "Falcao", "Renata", "Messi", "Ronaldo", "Guilerme", "Roger", "Zeite",
                "Marcelo", "Yasmin", "Patricia", "Caio", "Alfredo", "Fulano", "Luan", "Mariana", "Jesus", "Kevin",
                "Diego", "Fabio", "Monique", "Evandro"};
        this.name        = namesList[random.nextInt(namesList.length)];
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