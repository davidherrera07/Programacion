package tema6;


import java.util.Scanner;

public class NumerosAmigos {

    // Calcula la suma de los divisores de un número
    // sin contar el propio número
    public static int sumaDivisores(int numero) {

        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma;
    }

    // Comprueba si dos números son amigos
    public static boolean sonAmigos(int num1, int num2) {

        return sumaDivisores(num1) == num2
                && sumaDivisores(num2) == num1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {

            if (sonAmigos(num1, num2)) {
                System.out.println("Los números son amigos.");
            } else {
                System.out.println("Los números no son amigos.");
            }

        } else {
            System.out.println("Los números deben ser positivos.");
        }

        sc.close();
    }
}

