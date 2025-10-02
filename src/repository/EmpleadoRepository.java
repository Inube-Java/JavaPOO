package repository;

import model.Empleado;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase EmpleadoRepository - clase que implementa los métodos agregar, obtener, listar y eliminar empleado
 *
 * @author uriel
 * @version 1.0
 */
public class EmpleadoRepository {

  /**
   * Mapa de empleados Map<Integer, Empleado>
   */
  private Map<Integer, Empleado> empleados = new HashMap<>();
  /**
   * Contador de empleados de la empresa
   */
  private int idCounter = 1;

  /**
   * Método que implementa agregar un empleado en la base de datos
   *
   * @param empleado - Objeto de tipo empleado
   * @return - Aumenta en 1 el contador de empleados de la empresa
   */
  public int agregarEmpleado(Empleado empleado) {
    empleados.put(idCounter, empleado);
    System.out.println("HashMap: agregado " + empleado.getNombre() + " con ID=" + idCounter);
    return idCounter++;
  }

  /**
   * Método que devuelve del mapa de empleados un objeto de tipo Empleado por id
   *
   * @param id - Id del empleado que se va a devolver del mapa de empleados
   * @return - Devuelve un objeto de tipo Empleado
   */
  public Empleado obtenerEmpleado(int id) {
    return empleados.get(id);
  }

  /**
   * Método que imprime en consola el mapa de empleados
   */
  public void listarEmpleados() {
    System.out.println("\nEmpleados en HashMap:");
    for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
      System.out.print("ID=" + entry.getKey() + " → ");
      entry.getValue().mostrarInfo();
    }
  }

  /**
   * Método que elimina un objeto Empleado del mapa de empleados por id
   *
   * @param id - Id del empleado a eliminar del mapa de empleados
   */
  public void eliminarEmpleado(int id) {
    if (empleados.containsKey(id)) {
      empleados.remove(id);
      System.out.println("HashMap: eliminado empleado con ID=" + id);
    } else {
      System.out.println("HashMap: no existe empleado con ID=" + id);
    }
  }

}
