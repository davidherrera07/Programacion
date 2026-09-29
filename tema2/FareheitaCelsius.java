import java.util.Scanner;

public class FarenheitaCelsius { 

    public static void main(String[]args) {

        double farenheit = 0.0;
        double celsius = 0.0;

        System.out.println("Este programa calcula los grados celsius que hay en la cantidad de farenheit");
        System.out.println("=============================================================");
        System.out.print("Introduzca la temperatura en grados celsius:");

        celsius = sc.nextDouble();

        //Calculamos

        farenheit = 9.0/5 *celsius + 32;

        System.out.println("Estos son los grados farenheit convertidos de celsius = "+farenheit);


}
}
