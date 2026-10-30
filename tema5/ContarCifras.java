package tema5;

import java.util.Scanner;

public class ContarCifras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();

        int contador = 0;

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " cifras.");

        sc.close();
    }
}
    

