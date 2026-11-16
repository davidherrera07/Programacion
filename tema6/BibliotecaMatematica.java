package tema6;

import java.util.Scanner;

public class BibliotecaMatematica {

    // Comprueba si un número es capicúa
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    // Calcula la potencia de una base elevada a un exponente
    public static int potencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    // Cuenta el número de dígitos de un número
    public static int digitos(int numero) {
        numero = Math.abs(numero);

        if (numero == 0) {
            return 1;
        }

        int contador = 0;

        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }

    // Da la vuelta a un número
    public static int voltea(int numero) {
        int invertido = 0;
        int signo = numero < 0 ? -1 : 1;

        numero = Math.abs(numero);

        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        return invertido * signo;
    }

    // Quita n dígitos por detrás (por la derecha)
    public static int quitaPorDetras(int numero, int n) {
        return numero / potencia(10, n);
    }

    // Añade un dígito por delante de un número
    public static int pegaPorDelante(int numero, int digito) {
        return digito * potencia(10, digitos(numero)) + numero;
    }

    // Menú principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== BIBLIOTECA MATEMÁTICA =====");
            System.out.println("1. Comprobar si es capicúa");
            System.out.println("2. Calcular una potencia");
            System.out.println("3. Contar dígitos");
            System.out.println("4. Voltear un número");
            System.out.println("5. Quitar dígitos por detrás");
            System.out.println("6. Pegar un dígito por delante");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            int numero, base, exponente, n, digito;

            switch (opcion) {

                case 1:
                    System.out.print("Introduce un número: ");
                    numero = sc.nextInt();

                    System.out.println("¿Es capicúa? " + esCapicua(numero));
                    break;

                case 2:
                    System.out.print("Introduce la base: ");
                    base = sc.nextInt();

                    System.out.print("Introduce el exponente: ");
                    exponente = sc.nextInt();

                    System.out.println("Resultado: " +
                            potencia(base, exponente));
                    break;

                case 3:
                    System.out.print("Introduce un número: ");
                    numero = sc.nextInt();

                    System.out.println("Número de dígitos: " +
                            digitos(numero));
                    break;

                case 4:
                    System.out.print("Introduce un número: ");
                    numero = sc.nextInt();

                    System.out.println("Número volteado: " +
                            voltea(numero));
                    break;

                case 5:
                    System.out.print("Introduce un número: ");
                    numero = sc.nextInt();

                    System.out.print("¿Cuántos dígitos quieres quitar? ");
                    n = sc.nextInt();

                    if (n >= 0) {
                        System.out.println("Resultado: " +
                                quitaPorDetras(numero, n));
                    } else {
                        System.out.println("El número de dígitos no puede ser negativo.");
                    }
                    break;

                case 6:
                    System.out.print("Introduce un número: ");
                    numero = sc.nextInt();

                    System.out.print("Introduce el dígito que quieres pegar: ");
                    digito = sc.nextInt();

                    if (digito >= 0 && digito <= 9) {
                        System.out.println("Resultado: " +
                                pegaPorDelante(numero, digito));
                    } else {
                        System.out.println("Debes introducir un dígito entre 0 y 9.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

