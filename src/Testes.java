import java.util.Scanner;

public class Testes {


    public static int qntSellers = 5;
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

        Mercado firststore = new Mercado(firstStoreSellers, "Automotivo", "Rio Grande do Sul", 700);
        firststore.setSalesAmont();

        Mercado secondStore = new Mercado(secondStoreSellers, "Informatica", "São Paulo", 400);
        secondStore.setSalesAmont();

        Mercado thirdStore = new Mercado(thirdStoreSellers, "Fitnes", "Minas Gerais", 300);
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
        System.out.println("\nSUMARIO DO MERCADO " + firststore.getName().toUpperCase());
        for (int i = 0; i < qntSellers; i++) {
            System.out.printf("\nVENDEDOR: %-15sVALOR VENDIDO: R$ %.2f",firstStoreSellers[i].getName(), firstStoreSellers[i].getSalesAmount());
        }

        System.out.println("\n\nSUMARIO DO MERCADO " + secondStore.getName().toUpperCase());
        for (int i = 0; i < qntSellers; i++) {
            System.out.printf("\nVENDEDOR: %-15sVALOR VENDIDO: R$ %.2f",secondStoreSellers[i].getName(), secondStoreSellers[i].getSalesAmount());
        }

        System.out.println("\n\nSUMARIO DO MERCADO " + thirdStore.getName().toUpperCase());
        for (int i = 0; i < qntSellers; i++) {
            System.out.printf("\nVENDEDOR: %-15sVALOR VENDIDO: R$ %.2f",thirdStoreSellers[i].getName(), thirdStoreSellers[i].getSalesAmount());
        }

    }
}
