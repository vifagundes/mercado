public class Mercado {
   private final Vendedor[] sellers;
   private String name;
   private String local;
   private double salesAmont;

public Mercado(Vendedor[] sellers){
        this.sellers = sellers;
    }

    public Vendedor[] getSellers() {
        return this.sellers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return this.local;
    }

    public void setSalesAmont() {
        for (int i = 0; i < sellers.length; i++) {
            this.salesAmont += sellers[i].getSalesAmount();
        }
    }

    public double getSalesAmont() {
        return this.salesAmont;
    }
}
