package Modulo1.Tema1;

// importamos la clase Scanner del paquete java.util

import java.util.Scanner;

public class EntradaYSalidaDeDatosC2 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para poder leer datos que el usuario escriba por teclado
        Scanner entradaDatos = new Scanner(System.in);

        // Mostramos mensajes para pedir información (esto es salida)
        // Y usamos el objeto Scanner (entradaDatos) para capturar lo que escribe el usuario (esto es entrada)
        System.out.println("Ingrese su nombre: ");
        String nombre = entradaDatos.nextLine(); // Lee una línea de texto (nombre)

        System.out.println("Ingrese su apellido: ");
        String apellido = entradaDatos.nextLine(); // Lee otra línea de texto (apellido)

        System.out.println("Háblanos de ti: ");
        String datosPersonales = entradaDatos.nextLine(); // Lee una descripción personal

        System.out.println("Ingrese su edad: ");
        int edad = entradaDatos.nextInt(); // Lee un número entero (edad)

        System.out.println(); // Línea en blanco para separar visualmente la salida

        // Mostramos (salida) todos los datos que el usuario ingresó
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Sobre mí: " + datosPersonales);
    }

}
