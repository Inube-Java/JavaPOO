package model;

import interfaces.Trabajador;

/**
 * Clase Empleado - clase que implementa los atributos y metodos de la clase Empleado que implementa la clase abstracta Persona y la interface Trabajador
 *
 * @author uriel
 * @version 1.0
 */

public class Empleado extends Persona implements Trabajador {

  /**
   * Miembro estático que indica el nombre completo de la empresa
   */
  public static final String EMPRESA = "Tech Solutions";
  /**
   * Miembro estático que indica el número de empleados de la empresa
   */
  private static int contadorEmpleados = 0;

  /**
   * Salario del empleado
   */
  private double salario;

  /**
   * Constructor de la clase que implementa los atributos de la clase abstracta persona y los propios de la clase Empleado
   *
   * @param nombre  - propiedad heredada de la clase abstracta Persona, de tipo string
   * @param edad    - propiedad heredad de la clase abstracta Persona, de tipo int
   * @param salario - propiedad de la clase Empleado, de tipo double
   */
  public Empleado(String nombre, int edad, double salario) {
    super(nombre, edad);
    this.salario = salario;
    contadorEmpleados++;
  }

  /**
   * Método estático de la clase Empleado, que devuelve el número de empleados de la empresa, sin argumentos
   *
   * @return - devuelve el número de empleados, de tipo int
   */
  public static int getContadorEmpleados() {
    return contadorEmpleados;
  }

  /**
   * Getter de la propiedad salario
   *
   * @return - devuelve el salario del empleado, de tipo double
   */
  public double getSalario() {
    return salario;
  }

  /**
   * Método heredado de la clase abstracta persona se hace Override y polimorfismo, Sin argumentos
   * Imprime la informacion del empleado, nombre, edad, salario y empresa
   */
  @Override
  public void mostrarInfo() {
    System.out.println("Empleado: " + getNombre() + ", Edad: " + getEdad() +
        ", Salario: $" + salario + ", Empresa: " + EMPRESA);
  }

  /**
   * Método heredado de la interface Trabajador se hace Override y polimorfismo, Sin argumentos
   * Imprime en que trabaja el Empleado
   */
  @Override
  public void trabajar() {
    System.out.println(getNombre() + " está trabajando en proyectos generales.");
  }

}
