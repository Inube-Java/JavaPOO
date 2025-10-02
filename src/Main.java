import dao.EmpleadoDAO;
import db.DatabaseConnection;
import exceptions.EmpleadoException;
import model.Desarrollador;
import model.Empleado;
import model.Gerente;
import model.Persona;
import repository.EmpleadoRepository;

import java.util.List;

/**
 * Clase Principal el proyecto de ejemplo de POO
 *
 * @author uriel
 * @version 1.0
 */

public class Main {
  /**
   * Método principal de la aplicación
   *
   * @param args - Argumentos de línea de comandos (no se usa en esta aplicación)
   */

  public static void main(String[] args) {

    // Try catch para el manejo de excepciones
    try {
      // Objetos
      Empleado e1 = new Empleado("Carlos", 30, 15000);
      Gerente g1 = new Gerente("Ana", 40, 25000, "TI");
      Desarrollador d1 = new Desarrollador("Luis", 25, 20000, "Java");

      // Polimorfismo
      Persona[] personas = {e1, g1, d1};
      for (Persona p : personas) {
        p.mostrarInfo();
        p.trabajar();
      }

      System.out.println("Total empleados en memoria: " + Empleado.getContadorEmpleados());

      if (d1.getSalario() < 10000) {
        throw new EmpleadoException("El salario del desarrollador es demasiado bajo.");
      }

      // Conexión Oracle (Singleton)
      DatabaseConnection db = DatabaseConnection.getInstancia();

      // DAO
      EmpleadoDAO dao = new EmpleadoDAO();
      dao.insertarEmpleado(e1);
      dao.insertarEmpleado(d1);

      List<Empleado> lista = dao.obtenerEmpleados();
      System.out.println("Empleados en Oracle:");
      for (Empleado emp : lista) {
        emp.mostrarInfo();
      }

      // HashMap Repository
      EmpleadoRepository repo = new EmpleadoRepository();
      int id1 = repo.agregarEmpleado(e1);
      int id2 = repo.agregarEmpleado(d1);
      int id3 = repo.agregarEmpleado(g1);

      repo.listarEmpleados();

      System.out.println("Buscar en HashMap ID=" + id2);
      Empleado encontrado = repo.obtenerEmpleado(id2);
      if (encontrado != null) encontrado.mostrarInfo();

      repo.eliminarEmpleado(id1);
      repo.listarEmpleados();

      // Crear la clase GerenteDAO
      // Crear la clase GerenteRepository
      // Insertar 3 Gerentes
      // Listar los gerentes (4) 1 existen, 3 agregados


    } catch (EmpleadoException e) {
      System.out.println("Error de empleado: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Error general: " + e.getMessage());
    }

  }

}