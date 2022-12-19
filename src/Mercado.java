public class Mercado {
   private final Vendedor[] sellers;
   private final String name;
   private final String local;
   private double salesAmont;
   private final double meta;

public Mercado(Vendedor[] sellers, String name, String local, double meta){
        this.sellers = sellers;
        this.name    = name;
        this.local   = local;
        this.meta    = meta;
    }

    public void setBonus() {
        for (int i = 0; i < sellers.length; i++) {
            if (Regulador.isApplicable(sellers[i].getSalesAmount(), meta)) {
                sellers[i].setBonus(sellers[i].getSalesAmount() * 0.1);
                sellers[i].setTotal(sellers[i].getBonus() + sellers[i].getSalesAmount());
            } else {
                sellers[i].setBonus(0.0);
                sellers[i].setTotal(0.0);
            }
        }

    }

    public Vendedor[] getSellers() {
        return this.sellers;
    }

    public String getName() {
        return this.name;
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

    public double getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return name;
    }
}
