package Modulo1.Tema3;

public class Metodos {
    //variable de instancia
    String nombre = "Juan";
    static double numero1 = 2;
    static double numero2 = 8;

    public void Saludo() {
        // imprime un mensaje y el valor de la variable de instancia
        System.out.println("Hola, me llamo " + nombre);
    }

    // las variables estaticas pueden estar dentro de un metodo de instancia pero no viceversa
    public double Suma() {
        return numero1 + numero2;
    }

    // metodo con parametros se hace static para llamar el metodo sin crear un objeto
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        // como el metodo es de tipo instancia tenemos que crear un objeto para acceder a el
        Metodos Saludos = new Metodos();
        // accedemos y la llamamos
        Saludos.Saludo();


        // para acceder a la variable de instancia creamos un objeto
        Metodos Saludo2 = new Metodos();
        // accedemos y la imprimimos
        System.out.println(Saludo2.nombre);

        // creamos un objeto para llamar al metodo suma()
        Metodos metodos = new Metodos();
        System.out.println("La suma es: " + metodos.Suma());

        // llamamos el metodo resta() sin crear objeto ya que el metodo es de tipo static
        System.out.println("La resta es: " + resta(3, 6));
    }

}
