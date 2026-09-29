import java.util.Scanner;

public class KbMb {

    public static void main(String[]args) {

    Scanner sc = new Scanner (System.in);

    double megabyte;
    double kilobyte;

    System.out.println("Calculamos la conversion de klobyte a megabyte ");
    System.out.println("=============================================================");
    System.out.print("Introduzca la cantidad de kilobyte: ");

    kilobyte = sc.nextDouble();
    megabyte = kilobyte / 1024;
     
    System.out.println("La conversión de kilobyte a megabyte es: "+ megabyte );

    
}
}
    

