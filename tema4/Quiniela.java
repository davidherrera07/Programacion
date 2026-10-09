package tema4;

import java.util.Random;

public class Quiniela {

    public static void main(String[] args) {

        Random random = new Random();

        int numero = random.nextInt(6) + 1;

        if (numero <= 3) {
            System.out.println("1");
        } else if (numero <= 5) {
            System.out.println("X");
        } else {
            System.out.println("2");
        }
    }
}
    

