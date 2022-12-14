public class Mercado {
   private final Vendedor[] sellers;
   private String name;
   private String local;
   private double salesAmont;

public Mercado(Vendedor[] sellers){
        this.sellers = sellers;
    }

    public Vendedor[] getSellers() {
        return sellers;
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }

    public double getSalesAmont() {
        return salesAmont;
    }

    public double setSalesAmont() { // TODO implementar a logica do total das vendas
        double total = 0;
        double[] salesAmount = new double[sellers.length];
        for (int i = 0; i < sellers.length; i++) {
            salesAmount[i] = sellers[i].getSalesAmount();
        }
        for (int j = 0; j < sellers.length; j++) {
            total += salesAmount[j];
        }
        return total;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String setName(String name) {
       return this.name = name;
    }
}
