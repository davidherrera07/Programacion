package tema4;

import java.util.Random;

public class CaracteresRandom {
    public static void main(String[] args) {
        Random random = new Random();

        String mayusculas = "";

        mayusculas += (char) ('A' + random.nextInt(26));
        mayusculas += (char) ('A' + random.nextInt(26));
        mayusculas += (char) ('A' + random.nextInt(26));
        mayusculas += (char) ('A' + random.nextInt(26));
        mayusculas += (char) ('A' + random.nextInt(26));

        System.out.println(mayusculas + mayusculas.toLowerCase());
    }
}
    
