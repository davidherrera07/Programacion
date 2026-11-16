package tema6;


import java.util.Scanner;

public class DivisoresPrimos {

    // Comprueba si un número es primo
    public static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Cuenta los divisores primos de un número
    public static int divisoresPrimos(int numero) {

        int contador = 0;

        for (int i = 2; i <= numero; i++) {

            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        System.out.println("Tiene " + divisoresPrimos(numero)
                + " divisores primos.");

        sc.close();
    }
}

