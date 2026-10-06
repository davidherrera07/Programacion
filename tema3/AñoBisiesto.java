import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un año: ");

        int año = sc.nextInt();

        if (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)) {
            System.out.println("Este año es bisiesto");
        } else {
            System.out.println("Este año no es bisiesto");
        }

        sc.close();
    }
}

        

    
