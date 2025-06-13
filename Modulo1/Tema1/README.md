# Entrada y salida de datos

## Entrada de datos:  
* Para leer datos del usuario por consola, se usa la clase `Scanner` del paquete `java.util`.  
* Se crea el objeto de tipo `Scanner`
* Leemos el dato con ayuda de un metodo: `(nextLine(), nextInt(), nextFloat(), nextDouble()...)`. 
* Los metodos no guardan los datos por si solo, nosotros decidimos si almacenarlo o no.


## Metodos mas comunes:  
* nextLine() -> Lee una linea hasta que el usuario presione enter.  
* next() -> Lee una sola parabra hasta el primer espacio.  
* nextInt() -> Lee un numero entero.  
* nextFloat() -> Lee un decimal de tipo float.  
* nextDouble -> Lee un decimal de tipo double.  
* nextBolean -> Lee un `True` o `False`.  

---

## Notas: 
* nextLine() es ideal para leer nombres completos, frases, descripciones, etc.  
* next() se queda con la primera palabra y deja el resto en espera.  
* hasNext...() te permite verificar si lo que sigue es del tipo correcto antes de intentar leerlo (evita errores).  
* Cuando usas nextInt() o nextDouble(), recuerda limpiar el Enter pendiente con nextLine() si después usas texto.  




