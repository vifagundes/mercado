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

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
