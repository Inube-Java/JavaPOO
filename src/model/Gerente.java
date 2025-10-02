package model;

/**
 * Clase Gerente - clase que implementa los atributos y los métodos de la clase Gerente que implementa de la clase Empleado
 *
 * @author uriel
 * @version 1.0
 */

public class Gerente extends Empleado {

  /**
   * Nombre del departamento donde trabaja el empleado
   */
  private String departamento;

  /**
   * Constructor de la clase que implementa los atributos de la clase abstracta de persona, la clase empleado y los propios de la clase Gerente
   *
   * @param nombre       - propiedad heredada de la clase abstracta persona de tipo string
   * @param edad         - propiedad heredada de la clase abstracta persona de tipo int
   * @param salario      - propiedad heredada de la clase empleado, de tipo double
   * @param departamento - propiedad de la clase Gerente, de tipo string
   */
  public Gerente(String nombre, int edad, double salario, String departamento) {
    super(nombre, edad, salario);
    this.departamento = departamento;
  }

  /**
   * Método heredado de la clase abstracta persona se hace Override y polimorfismo, Sin argumentos
   * Imprime la información del gerente y su departamento
   */
  @Override
  public void mostrarInfo() {
    System.out.println("Gerente: " + getNombre() + ", Departamento: " + departamento);
  }

  /**
   * Método heredado de la clase empleado se hace Override y polimorfismo, Sin argumentos
   * Imprime la informacion en que trabaja el Gerente
   */
  @Override
  public void trabajar() {
    System.out.println(getNombre() + " supervisa el departamento de " + departamento);
  }

}
