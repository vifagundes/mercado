import java.util.Random;

public class Vendedor {
    private final String name;
    private double salesAmount;

    public Vendedor(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getSalesAmount() {
        return this.salesAmount;
    }

    public void setSalesAmount() {
        Random random = new Random();
        this.salesAmount = random.nextDouble(100, 1001);
    }
}
