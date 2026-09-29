import java.util.Scanner;

public class MbKb {

public static void main(String[]args) {

    Scanner sc = new Scanner (System.in);

    double megabyte;
    double kilobyte;

    System.out.println("Calculamos la conversion de megabyte a kilobyte");
    System.out.println("=============================================================");
    System.out.print("Introduzca la cantidad de megabyte: ");

    megabyte = sc.nextDouble();
    kilobyte = megabyte * 1024;
     
    System.out.println("La conversión de megabyte a kilobyte es: "+ kilobyte );

    
}
}