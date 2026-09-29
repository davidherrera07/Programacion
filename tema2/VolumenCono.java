import java.util.Scanner;

public class VolumenCono {

    public static void main(String[]args) {

        Scanner sc = new Scanner (System.in);

        double altura;
        double radio;
        double volumenCono;

        System.out.println("Calculamos el área del cono");
        System.out.println("=============================================================");
        System.out.print("Introduzca la altura del cono: ");

        altura = sc.nextDouble();

        System.out.print("Introduzca el radio del cono: ");

        radio = sc.nextDouble();

        volumenCono = (1.0 / 3.0) * Math.PI * radio * radio * altura;

        System.out.println("El cono de radio "+radio+ " y altura " + altura + " tiene un volumen de "+volumenCono );
    
}
}
