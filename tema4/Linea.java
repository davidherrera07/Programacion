package tema4;

import java.util.Random;

public class Linea {

     public static void main(String[] args) {
        Random random = new Random();

        char[] caracteres = {'#', '$', '€', '&'};

        char caracter = caracteres[random.nextInt(4)];

        System.out.println(String.valueOf(caracter).repeat(5));
    }
}
  
