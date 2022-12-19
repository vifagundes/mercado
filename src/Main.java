import java.util.Random;

public class Main {
    public static int qntSellers = 10;
    public static int qntBuyers  = 50;

    public static String[] namesList =
            {"Vini", "Nicole", "Tuti", "Kiko", "Neymar", "Pedro", "Gabriel", "Rodrigo", "Ana",
            "Alisson", "Wellington", "Cleber", "Sergio", "Bruno", "Myllena", "Richarlison", "Lucas", "Xande",
            "Arthur", "Bianca", "Bryan", "Falcao", "Renata", "Messi", "Ronaldo", "Guilerme", "Roger", "Zeite",
            "Marcelo", "Yasmin", "Patricia", "Caio", "Alfredo", "Fulano", "Luan", "Mariana", "Jesus", "Kevin",
            "Diego", "Fabio", "Monique", "Evandro", "Jociele", "Breno", "Vitor", "Alesandro", "Cicero", "Debora",
            "Eduardo", "Ezio", "Grabriel", "Vitor", "Wallys"};

    public static String[] lastNameList =
            {"Blauth", "Fagundes", "Abreu", "Prestes", "Silva", "Hammacher", "Santos",
    "Junior", "Macedo", "Rodrigues", "Souza", "Gomes", "Wink", "Flores", "Xavier",
                    "Farias", "Serpa", "Silveira", "Martins"};

    public static void main(String[] args) {

        Vendedor[] firstStoreSellers  = new Vendedor[qntSellers];
        Vendedor[] secondStoreSellers = new Vendedor[qntSellers];
        Vendedor[] thirdStoreSellers  = new Vendedor[qntSellers];
        Mercado[]  marketList         = new Mercado[3];


        Comprador[] buyersList = new Comprador[qntBuyers];

        for (int i = 0; i < qntSellers ; i++) {
            firstStoreSellers[i]  = new Vendedor();
            secondStoreSellers[i] = new Vendedor();
            thirdStoreSellers[i]  = new Vendedor();
        }

        marketList[0]  = new Mercado(firstStoreSellers, "Automotivo", "Rio Grande do Sul", 300);
        marketList[1]  = new Mercado(secondStoreSellers, "Informatica", "São Paulo", 500);
        marketList[2]  = new Mercado(thirdStoreSellers, "Fitnes", "Minas Gerais", 700);

        for (int i = 0; i < qntSellers; i++) {
            firstStoreSellers[i].setMarket(marketList[0]);
            secondStoreSellers[i].setMarket(marketList[1]);
            thirdStoreSellers[i].setMarket(marketList[2]);
        }

        for (int j = 0; j < qntBuyers; j++) {
            buyersList[j] = new Comprador(marketList);
            buyersList[j].buy();
            buyersList[j].setTotal();
        }

        sumary(firstStoreSellers, marketList[0]);
        sumary(secondStoreSellers, marketList[1]);
        sumary(thirdStoreSellers, marketList[2]);
        for (int i = 0; i < buyersList.length; i++) {
            System.out.println(buyersList[i]);
        }
    }

    private static void sumary(Vendedor[] sellers, Mercado store) {
        store.setSalesAmont();
        System.out.println("\n==========================================" +
                "=================================================");
        System.out.printf("SUMARIO DO MERCADO %S EM %S - META: R$ %.2f\n",
                store.getName(),
                store.getLocal(),
                store.getMeta());
        for (int i = 0; i < qntSellers; i++) {
            if (sellers[i].getSalesAmount() == 0) {
                System.out.printf("\nVENDEDOR: %-25sNÃO VENDEU NADA", sellers[i].getName());
            } else {
                System.out.printf("\nVENDEDOR: %-25sVALOR VENDIDO: R$ %.2f EM %d VENDAS",
                        sellers[i].getName(),
                        sellers[i].getSalesAmount(),
                        sellers[i].getQntSells());
            }
        }
        System.out.println();
        int totalbonus = 0;
        if (totalbonus == 0) {
            System.out.println("\nNENHUM VENDEDOR ATINGIU A META");
        }
        System.out.printf("\nTOTAL VENDIDO NO MERCADO: R$ %.2f", store.getSalesAmont());
        System.out.println("\n==========================================" +
                "=================================================");
    }
}