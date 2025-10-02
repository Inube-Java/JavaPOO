package exceptions;

/**
 * Clase que maneja las excepciones personalizadas
 * @version 1.0
 * @author uriel
 */

public class EmpleadoException extends Exception {

  /**
   * Método de excepción personalizada de la clase Empleado
   * @param mensaje - parametro de la función que indica el mensaje personalizado de la excepción
   */
  public EmpleadoException(String mensaje) {
    super(mensaje);
  }

}
