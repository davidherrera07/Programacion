package tema4;

import java.util.Random;

public class CaracteresRandom {
    public static void main(String[] args) {
        Random random = new Random();
        String palabra = "";

        for (int i = 0; i < 5; i++) {
            char letra = (char) ('A' + random.nextInt(26));
            palabra += letra;
        }

        System.out.println("Mayúsculas: " + palabra);
        System.out.println("Minúsculas: " + palabra.toLowerCase());
    }
}
    
