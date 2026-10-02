 import java.util.Scanner;

public class NumeroMayor {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        int a = 0, b = 0;

        System.out.println("Introduzca el número uno: ");
        a = sc.nextInt();

        System.out.println("Introduzca el número dos: ");
        b = sc.nextInt();

        if(a > b )
            System.out.println("El mayor es el primer número");
        
        else if (a < b) { System.out.println("El mayor es el segundo número");     
            }
           
        else 
            System.out.println("Son iguales");
        

        sc.close();
    
}
}
