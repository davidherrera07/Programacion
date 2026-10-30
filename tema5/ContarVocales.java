package tema5;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));

            if (caracter == 'a' || caracter == 'e' ||
                caracter == 'i' || caracter == 'o' ||
                caracter == 'u') {
                contador++;
            }
        }

        System.out.println("Número de vocales: " + contador);

        sc.close();
    }
}
