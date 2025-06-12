package Modulo1.Tema1;

public class VariablesYTiposDeDatos {

    public static void main(String[] args) {

        //Tipos de datos (primitivos)
        int entero = 5;
        float decimal = 5.2f;  //al final del numero debe llevar una f
        double decimalPreciso = 6.35;
        char caracter = 'A';
        boolean verdaderoFalso = true;
        //(no primitivos)
        String cadenaTexto = "Este mensaje es para probar las cadenas de texto";

        //imprimimos las variables
        System.out.println("imprimir int: " + entero);
        System.out.println("imprimir double: " + decimal);
        System.out.println("imprimir double:" + decimalPreciso);
        System.out.println("imprimir char: " + caracter);
        System.out.println("imprimir booleano: " + verdaderoFalso);
        System.out.println("imprimir String: " + cadenaTexto);

    }

}
