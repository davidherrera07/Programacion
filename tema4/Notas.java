package tema4;
import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        double n4 = sc.nextDouble();
        System.out.print("Nota 5: ");
        double n5 = sc.nextDouble();

        System.out.println("Nota 1 redondeada: " + Math.round(n1 * 10) / 10.0);
        System.out.println("Al alza: " + Math.ceil(n1 * 10) / 10);
        System.out.println("A la baja: " + Math.floor(n1 * 10) / 10);
        System.out.println("Truncada: " + (int)n1);

        System.out.println("Nota 2 redondeada: " + Math.round(n2 * 10) / 10.0);
        System.out.println("Al alza: " + Math.ceil(n2 * 10) / 10);
        System.out.println("A la baja: " + Math.floor(n2 * 10) / 10);
        System.out.println("Truncada: " + (int)n2);

        System.out.println("Nota 3 redondeada: " + Math.round(n3 * 10) / 10.0);
        System.out.println("Al alza: " + Math.ceil(n3 * 10) / 10);
        System.out.println("A la baja: " + Math.floor(n3 * 10) / 10);
        System.out.println("Truncada: " + (int)n3);

        System.out.println("Nota 4 redondeada: " + Math.round(n4 * 10) / 10.0);
        System.out.println("Al alza: " + Math.ceil(n4 * 10) / 10);
        System.out.println("A la baja: " + Math.floor(n4 * 10) / 10);
        System.out.println("Truncada: " + (int)n4);

        System.out.println("Nota 5 redondeada: " + Math.round(n5 * 10) / 10.0);
        System.out.println("Al alza: " + Math.ceil(n5 * 10) / 10);
        System.out.println("A la baja: " + Math.floor(n5 * 10) / 10);
        System.out.println("Truncada: " + (int)n5);

        System.out.println("Media: " + (n1+n2+n3+n4+n5)/5);
        System.out.println("Máximo: " + Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4,n5)))));
        System.out.println("Mínimo: " + Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4,n5)))));

        sc.close();
    }
}
