public class NumerosAleatorios {
    public static void main(String[]args) {

    int random1 = (int) (Math.random() * 10.0);
    int random2 = (int) (Math.random() * 10.0);

    System.out.println("Primer número aleatorio: " +random1);
    System.out.println("Segundo número aleatorio: " +random2);
   
    int resultado = random1 + random2;

    System.out.println("La suma de los dos números aleatorios es : "+resultado);




    
}
}
