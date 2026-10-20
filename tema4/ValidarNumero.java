package tema4;

import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numero;

        System.out.print("Introduce un número de entre 2 y 7 dígitos: ");
        numero = sc.nextLine();

        if (numero.length() >= 2 && numero.length() <= 7
                && numero.matches("[0-9]+")) {
            System.out.println("El número es válido.");
        } else {
            System.out.println("El número no es válido.");
        }

        sc.close();
    }
}
