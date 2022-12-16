public class Testes {


    public static int qntSellers = 10;
    public static void main(String[] args) {

        Vendedor[] firstStoreSellers  = new Vendedor[qntSellers];
        Vendedor[] secondStoreSellers = new Vendedor[qntSellers];
        Vendedor[] thirdStoreSellers  = new Vendedor[qntSellers];

        for (int i = 0; i < qntSellers ; i++) {
            firstStoreSellers[i] = new Vendedor();
            firstStoreSellers[i].setSalesAmount();

            secondStoreSellers[i] = new Vendedor();
            secondStoreSellers[i].setSalesAmount();

            thirdStoreSellers[i] = new Vendedor();
            thirdStoreSellers[i].setSalesAmount();
        }

        Mercado firststore = new Mercado(firstStoreSellers, "Automotivo", "Rio Grande do Sul", 300);
        firststore.setSalesAmont();

        Mercado secondStore = new Mercado(secondStoreSellers, "Informatica", "São Paulo", 500);
        secondStore.setSalesAmont();

        Mercado thirdStore = new Mercado(thirdStoreSellers, "Fitnes", "Minas Gerais", 700);
        thirdStore.setSalesAmont();

        for (int i = 0; i < qntSellers; i++) {
            firstStoreSellers[i].setMarket(firststore);
            secondStoreSellers[i].setMarket(secondStore);
            thirdStoreSellers[i].setMarket(thirdStore);

            firstStoreSellers[i].setBonus();
            secondStoreSellers[i].setBonus();
            thirdStoreSellers[i].setBonus();

            firstStoreSellers[i].setTotal();
            secondStoreSellers[i].setTotal();
            thirdStoreSellers[i].setTotal();
        }
        sumary(firstStoreSellers, firststore);
        sumary(secondStoreSellers, secondStore);
        sumary(thirdStoreSellers, thirdStore);


    }

    private static void sumary(Vendedor[] sellers, Mercado store) {
        System.out.printf("\n\nSUMARIO DO MERCADO %S EM %S - META: R$ %.2f",
                store.getName(),
                store.getLocal(),
                store.getMeta());
        for (int i = 0; i < qntSellers; i++) {
            System.out.printf("\nVENDEDOR: %-15sVALOR VENDIDO: R$ %.2f", sellers[i].getName(), sellers[i].getSalesAmount());
        }
        System.out.println();
        int totalbonus = 0;
        for (int j = 0; j < qntSellers; j++) {
            if (sellers[j].getBonus() > 0) {
                System.out.printf("\nVENDEDOR: %-15s ATINGIU A META E RECEBEU O BONUS DE R$ %.2f TOTALIZANDO: R$ %.2f",
                        sellers[j].getName(),
                        sellers[j].getBonus(),
                        sellers[j].getTotal());
                totalbonus += sellers[j].getBonus();
            }
        }
        if (totalbonus == 0) {
            System.out.println("\nNENHUM VENDEDOR ATINGIU A META");
        }
    }
}
