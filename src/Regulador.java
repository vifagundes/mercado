public class Regulador {

    public static double aplicar(double sallesAmount, double meta) {
        if (sallesAmount > meta) {
            return sallesAmount * 0.1;
        } else {
            return 0;
        }
    }
}
