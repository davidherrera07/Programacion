package tema4;

import java.util.Scanner;

public class DividirPalabra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = teclado.nextLine();

        int posicion = palabra.indexOf('A');
        int i = 0;

        if (posicion != -1) {
            while (i < posicion) {
                System.out.print(palabra.charAt(i));
                i++;
            }

            System.out.println();

            while (i < palabra.length()) {
                System.out.print(palabra.charAt(i));
                i++;
            }
        } else {
            System.out.println("No se encuentra la letra A.");
        }

        teclado.close();
    }
}
