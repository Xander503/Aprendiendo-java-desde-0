package Modulo1.Tema2;

public class TiposDeDatos {

    // variable estática
    static int contadorGlobal = 0;
    // variable de instancia
    String nombre;

    //constructor vació
    public TiposDeDatos() {
    }

    //constructor inicializado
    public TiposDeDatos(String nombre) {
        this.nombre = nombre;
        contadorGlobal++;
    }

    public void mostrar() {
        // variable local
        int edad = 25;
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Total de personas: " + contadorGlobal);
    }

    public static void main(String[] args) {
        //creamos un objeto llamado p1
        TiposDeDatos p1 = new TiposDeDatos("Ana");
        p1.mostrar();

        //creamos un objeto llamado p2
        TiposDeDatos p2 = new TiposDeDatos("Luis");
        p2.mostrar();
    }
}

