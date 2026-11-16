package tema6;


import java.util.Scanner;

public class VolumenCilindro {

    // Función que calcula y muestra el volumen del cilindro
    public static void volumen(double radio, double altura) {

        double volumen = Math.PI * radio * radio * altura;

        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        double altura = sc.nextDouble();

        volumen(radio, altura);

        sc.close();
    }
}

