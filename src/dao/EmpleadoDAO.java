package dao;

import db.DatabaseConnection;
import model.Empleado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase EmpleadoDAO - clase que implementa el create y getAll de la clase Empleado
 *
 * @author uriel
 * @version 1.0
 */
public class EmpleadoDAO {
  

  /**
   * Método que inserta un empleado en la base de datos
   *
   * @param empleado - instancia de la clase Empleado
   * @throws SQLException - Captura de excepción si existe al insertar en base de datos
   */
  public void insertarEmpleado(Empleado empleado) throws SQLException {
    String sql = "INSERT INTO EMPLEADO (NOMBRE, EDAD, SALARIO) VALUES (?, ?, ?)";
    Connection conn = DatabaseConnection.getInstancia().getConexion();
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, empleado.getNombre());
      ps.setInt(2, empleado.getEdad());
      ps.setDouble(3, empleado.getSalario());
      ps.executeUpdate();
      System.out.println("Insertado en Oracle: " + empleado.getNombre());
    }
  }

  /**
   * Método que devuelve el listado de empleados de la base de datos
   *
   * @return - Devuelve un List<Empleado>
   * @throws SQLException - Captura la excepción al leer los datos de la base de datos
   */
  public List<Empleado> obtenerEmpleados() throws SQLException {
    List<Empleado> lista = new ArrayList<>();
    String sql = "SELECT NOMBRE, EDAD, SALARIO FROM EMPLEADO";
    Connection conn = DatabaseConnection.getInstancia().getConexion();
    try (Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {
      while (rs.next()) {
        Empleado emp = new Empleado(
            rs.getString("NOMBRE"),
            rs.getInt("EDAD"),
            rs.getDouble("SALARIO")
        );
        lista.add(emp);
      }
    }
    return lista;
  }

}
