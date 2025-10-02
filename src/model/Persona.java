package model;

import interfaces.Trabajador;

/**
 * Clase Abstracta clase que implementa los atributos y métodos comunes de una persona
 *
 * @author uriel
 * @version 1.0
 */

public abstract class Persona implements Trabajador {

  /**
   * Propiedad abstracta
   * Nombre de la persona
   */
  private String nombre;
  /**
   * Propiedad abstracta
   * Edad de la persona
   */
  private int edad;

  /**
   * Constructor de la clase abstracta
   *
   * @param nombre - Nombre de la persona, de tipo string
   * @param edad   - Edad de la persona, de tipo int
   */
  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  /**
   * Getter de la propiedad abstracta Nombre de la persona
   *
   * @return - regresa el nombre de la persona, de tipo String
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Setter de la propiedad abstracta Nombre de la persona
   *
   * @param nombre - Recibe el nombre de la persona, de tipo String
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Getter de la propiedad abstracta Edad de la persona
   *
   * @return - regresa la edad de la persona, de tipo int
   */
  public int getEdad() {
    return edad;
  }

  /**
   * Setter de la propiedad abstracta Edad de la persona
   *
   * @param edad - regresa la edad de la persona, de tipo int
   */
  public void setEdad(int edad) {
    this.edad = edad;
  }

  /**
   * Método abstracto que imprime la información de la Persona, se hace Override y Polimorfismo en la clase que la implemente
   */
  public abstract void mostrarInfo();

}
