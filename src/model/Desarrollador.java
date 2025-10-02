package model;

/**
 * Clase Desarrollador - clase que implementa los atributos y métodos de la clase Desarrollador que implementa la clase Empleado
 *
 * @author uriel
 * @version 1.0
 */

public class Desarrollador extends Empleado {

  /**
   * Nombre del lenguaje de desarrollo
   */
  private String lenguaje;

  /**
   * Constructor de la clase que implementa los atributos de la clase abstracta de persona, la clase empleado y los propios de la clase desarrollador
   *
   * @param nombre   - propiedad heredada de la clase abstracta persona, de tipo string
   * @param edad     - propiedad heredada de la clase abstracta persona, de tipo int
   * @param salario  - propiedad heredada de la clase empleado, de tipo double
   * @param lenguaje - propiedad de la clase desarrollador, de tipo string
   */
  public Desarrollador(String nombre, int edad, double salario, String lenguaje) {
    super(nombre, edad, salario);
    this.lenguaje = lenguaje;
  }

  /**
   * Método que es heredado de la clase abstracta persona, se hace Override y polimorfismo, Sin argumentos
   * Imprime la información del desarrollador, nombre y lenguaje
   */
  @Override
  public void mostrarInfo() {
    System.out.println("Desarrollador: " + getNombre() + ", Lenguaje: " + lenguaje);
  }

  /**
   * Método que es heredado de la clase empleado, se hace Override y polimorfismo, sin argumentos
   * Imprime la informacion de en que trabaja el desarrollador
   */
  @Override
  public void trabajar() {
    System.out.println(getNombre() + " programa en " + lenguaje);
  }

}
