# Tipos De Variables  

## 🟩 Variables Locales
* Se declaran dentro de métodos, bloques o constructores.  
* Solo existen mientras el método se ejecuta.  
* No tienen valor por defecto → deben ser inicializadas.  

## 🟦 Variables De Instancia
* Se declaran fuera de los métodos, pero sin static.  
* Son parte del objeto, por eso se accede a ellas con 'this'.  
* Cada objeto tiene su propia copia.  
* Pertenecen al objeto  

## 🟨 Variables Estaticas (Static)
* Se declaran con la palabra clave static.  
* No dependen del objeto, sino de la clase.  
* Solo hay una copia para todos los objetos.  
* Pertenecen a la clase  

## Nota: las variables 'estaticas' se puede pensar en ellas como una variable global pero dentro de una clase, porque:  
* Se comparten entre todos los objetos.  
* Se puede acceder a ellas sin crear un objeto (Clase.nombreVariable).  
* Solo hay una copia en memoria.  

---

## ¿Qué es un constructor y que hace?  
* Crea el objeto.  
* Le da valores iniciales a las variables de instancia.  
* Se llama automáticamente cuando haces new.  

## Datos clave sobre constructores:  
* Se llaman igual que la clase.  
* No tienen tipo de retorno (ni siquiera void).  
* Puedes tener constructores diferentes (sobrecarga).  
* Si no escribes ninguno, Java pone uno vacío por defecto.  


