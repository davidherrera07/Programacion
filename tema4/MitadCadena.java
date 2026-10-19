package tema4;

import java.util.Scanner;

public class MitadCadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        int mitad = cadena.length() / 2;
        int i = 0;

        while (i < mitad) {
            System.out.print(cadena.charAt(i));
            i++;
        }

        System.out.print("<>");

        while (i < cadena.length()) {
            System.out.print(cadena.charAt(i));
            i++;
        }
    }
}