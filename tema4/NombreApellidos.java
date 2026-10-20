package tema4;

import java.util.Scanner;

public class NombreApellidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreCompleto;
        String nombre;
        String primerApellido;
        String segundoApellido;

        System.out.print("Introduce tu nombre y dos apellidos: ");
        nombreCompleto = sc.nextLine();

        String[] partes = nombreCompleto.split(" ");

        nombre = partes[0];
        primerApellido = partes[1];
        segundoApellido = partes[2];

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer apellido: " + primerApellido);
        System.out.println("Segundo apellido: " + segundoApellido);

        sc.close();
    }
}