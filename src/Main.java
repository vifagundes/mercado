public class Main {
    public static void main(String[] args) {
        Vendedor[] sellers = new Vendedor[2];
        Vendedor seller1 = new Vendedor("vini");
        Vendedor seller2 = new Vendedor("pedro");

        sellers[0] = seller1;
        sellers[1] = seller2;
        Mercado store = new Mercado(sellers);

        String storeName = store.setName("loja do Zé");

        seller1.setSalesAmount(200.7);
        seller2.setSalesAmount(5690.89);
        double total = store.setSalesAmont();
        System.out.printf("O vendedor %s vendeu R$ %.2f e o vendedor %s vendeu R$ %.2f\n", seller1.getName(), seller1.getSalesAmount(), seller2.getName(), seller2.getSalesAmount());
        System.out.printf("O total das vendas da loja %s foi de %.2f", storeName, total);
    }
}
