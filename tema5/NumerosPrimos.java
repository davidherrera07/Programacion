package tema5;

public class NumerosPrimos {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 50; numero++) {
            boolean primo = true;

            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero);
            }
        }
    }
}