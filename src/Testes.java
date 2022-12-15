import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendedor[] firstStoreSellers = new Vendedor[5];

        for (int i = 0; i < firstStoreSellers.length ; i++) {
            firstStoreSellers[i] = new Vendedor(scanner.nextLine());
            firstStoreSellers[i].setSalesAmount();
            System.out.printf("vendedor: %s valor da venda: %.2f\n", firstStoreSellers[i].getName(), firstStoreSellers[i].getSalesAmount());
        }

        Mercado store = new Mercado(firstStoreSellers);
        store.setName("loja do Ze");
        store.setSalesAmont();

        System.out.printf("total de vendas do mercardo %s: %.2f",store.getName(), store.getSalesAmont());
    }
}
