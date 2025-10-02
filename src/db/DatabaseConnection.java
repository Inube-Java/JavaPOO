package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase DatabaseConnection - clase que implementa una conexión singletón a oracle
 *
 * @author uriel
 * @version 1.0
 */

public class DatabaseConnection {

  /**
   * Miembro estático que indica la URL de la base de datos
   */
  private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
  /**
   * Miembro estático que indica el usuario de conexión a la base de datos
   */
  private static final String USUARIO = "javapoo";
  /**
   * Miembro estático que indica el password de conexión a la base de datos
   */
  private static final String PASSWORD = "java";
  /**
   * Miembro estático que indica un objeto DatabaseConnection
   */
  private static DatabaseConnection instancia;
  /**
   * Conexion a la base de datos, objeto de tipo Connection
   */
  private Connection conexion;

  /**
   * Constructor de la clase que realiza la conexión a la base de datos, sin argumentos
   */
  private DatabaseConnection() {
    try {
      Class.forName("oracle.jdbc.OracleDriver");
      conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
      System.out.println("Conexión a Oracle establecida.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Getter que devuelve la instancia de la conexión de la base de datos
   *
   * @return - Devuelve un objeto de tipo DatabaseConnection
   */
  public static DatabaseConnection getInstancia() {
    if (instancia == null) {
      instancia = new DatabaseConnection();
    }
    return instancia;
  }

  /**
   * Getter que devuelve la conexión a la base de datos
   *
   * @return - Devuelve un objeto de tipo Connection
   */
  public Connection getConexion() {
    return conexion;
  }

}
