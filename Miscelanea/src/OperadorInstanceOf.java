/**
 * <p><i>Archivo: OperadorInstanceOf.java</i></p>
 * @since 28/05/2022
 * @version 1.0
 * @author VictorSanz*/

class Animal {}

interface Felino {}
 
class Perro extends Animal {}
 
class Gato extends Animal implements Felino {}
 
public class OperadorInstanceOf {
 
     public static void main(String[] args) {
 
          Animal simba=new Animal();
          Perro idefix=new Perro();
          Gato azrael=new Gato();
 
          System.out.println("\n¿Simba es un animal? "+(simba instanceof Animal)); // true
          System.out.println("¿Simba es un perro? "+(simba instanceof Perro)); // false
          System.out.println("¿Simba es un felino? "+(simba instanceof Felino)); // false
 
          System.out.println("\n¿Idefix es un animal? "+(idefix instanceof Animal)); // true
          System.out.println("¿Idefix es un perro? "+(idefix instanceof Perro)); // true
          System.out.println("¿Idefix es un felino? "+(idefix instanceof Felino)); // false
 
          System.out.println("\n¿Azrael es un animal? "+(azrael instanceof Animal)); // true
          //System.out.println("¿Azrael es un perro? "+(azrael instanceof Perro)); Error de compilacion
 
          System.out.println("¿Azrael es un gato? "+(azrael instanceof Gato)); // true
          System.out.println("¿Azrael es un felino? "+(azrael instanceof Felino)); // true
          
     }
     
}
