import java.util.Scanner;

public class PrimeraHora {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el dia de la semana : ");
        String dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("A primera hora el lunes toca matemáticas");
                break;
            case "martes": 
                System.err.println("A primera hora el martes toca lengua");
                break;
            case "miercoles":
                System.out.println("A primera hora el miercoles toca historia");
                break;
            case "jueves":
                System.out.println("A primera hora el jueves toca educación física");

            case "viernes":
                System.out.println("A primera hora el viernes toca biología");
            
            default:
                System.out.println("El día introducido no es válido.");
                break;
        }
    
}
}
