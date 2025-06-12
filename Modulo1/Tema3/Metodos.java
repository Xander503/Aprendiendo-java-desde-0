package Modulo1.Tema3;

public class Metodos {
    //Variable de instancia
    String nombre = "Juan";

    public void Saludo() {
        // imprime un mensaje y el valor de la variable de instancia
        System.out.println("Hola, me llamo " + nombre);
    }

    public static void main(String[] args) {
        // como el metodo es de tipo instancia tenemos que crear un objeto para acceder a el
        Metodos Saludos = new Metodos();
        // accedemos y la llamamos
        Saludos.Saludo();


        //para acceder a la variable de instancia creamos un objeto
        Metodos Saludo2 = new Metodos();
        // accedemos y la imprimimos
        System.out.println(Saludo2.nombre);
    }

}
