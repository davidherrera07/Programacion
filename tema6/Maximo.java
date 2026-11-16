package tema6;


import java.util.Scanner;

public class Maximo {

    // Función que calcula el máximo de dos números
    public static int maximo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("El número máximo es: " + maximo(num1, num2));

        sc.close();
    }
}
