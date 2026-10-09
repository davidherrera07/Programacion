package tema4;

import java.util.Random;

public class BarajaFrancesa {
    public static void main(String[] args) {

        Random random = new Random();

        // Elegir un palo al azar
        int palo = random.nextInt(4) + 1;

        // Elegir un valor al azar
        int valor = random.nextInt(13) + 1;

        // Mostrar el valor de la carta
        switch (valor) {
            case 1:
                System.out.print("As");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("Jota");
                break;
            case 12:
                System.out.print("Reina");
                break;
            case 13:
                System.out.print("Rey");
                break;
        }

        System.out.print(" de ");

        // Mostrar el palo
        switch (palo) {
            case 1:
                System.out.println("picas");
                break;
            case 2:
                System.out.println("corazones");
                break;
            case 3:
                System.out.println("diamantes");
                break;
            case 4:
                System.out.println("tréboles");
                break;
        }
    }
}
    

