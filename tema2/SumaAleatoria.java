import java.util.Scanner;

public class SumaAleatoria {

    public static void main(String[]args) {

    int random1 = (int) (Math.random() * 10.0);
    int random2 = (int) (Math.random() * 10.0);
    int suma = 0, resultado = 0;
    Scanner sc = new Scanner(System.in);

    //calculamos la suma
    suma = random1 + random2;

    //Muestro los números al usuario y le pregunto el resultado    

    System.out.println("La suma de " + random1 + " + " + random2 + " es igual a ");
    System.out.println("Introduzca el valor de la suma");

    resultado = sc.nextInt();


    if (resultado == suma)
        System.out.println("Correcto");
    else 
        System.out.println("Incorrrecto");
    sc.close();
    
    }
    
}
