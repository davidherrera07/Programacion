import java.util.Scanner;

public class NumeroCapicua {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if (original == invertido) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }

        sc.close();
    }
}
    

