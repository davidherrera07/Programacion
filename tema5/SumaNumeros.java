package tema5;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Introduce números enteros (0 para terminar):");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            numero = sc.nextInt();
        }

        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}
