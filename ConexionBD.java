import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/campus_ejercicios";
    private static final String USUARIO = "root";
    private static final String CLAVE = "91011121314";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC - " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a MySQL: " + e.getMessage());
        }
        return conexion;
    }
}