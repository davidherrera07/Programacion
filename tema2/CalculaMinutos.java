import java.util.Scanner;

public class CalculaMinutos {

    public static void main(Strings[]args) {
        int segundos;
        int minutos;
        int segundosRestantes;

        Scanner sc = new Scanner(System.in);

        // Mostraremos en pantalla 
        System.out.println("Calculamos el nº minutos y seg, dada una cantidad de segundos");
        System.out.print("Introduzca el número de segundos:");

        segundos=sc.nextInt();
        minutos=segundos/60;
        segundosRestantes= minutos%60;

        System.out.println("El nº de minutos es" +minutos+ "y el numero de segundos restantes es" +segundosRestantes);
    }
}