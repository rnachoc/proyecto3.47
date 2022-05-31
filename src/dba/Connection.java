package dba;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {

	public static void crearbbdd(String[] args) {
		String db_ = "SQLQuery_347_1";
		String login_ = "root";
		String password_ = "";
		String url_ = "jdbc:mysql://127.0.0.1/" + db_;
		Connection connection_;
		Statement st_;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection_ = (Connection) DriverManager.getConnection(url_, login_, password_);

			System.out.println("Conexion a base de datos " + db_ + " correcta");
			st_ = ((java.sql.Connection) connection_).createStatement();

			// System.out.println("Creacion de la tabla Clientes");
			// st_.executeUpdate( "CREATE TABLE Clientes (IDPaciente int NOT NULL PRIMARY
			// KEY,Nombre VARCHAR(100) NOT NULL,Apellido1 VARCHAR(100) NOT NULL, Apellido2
			// VARCHAR(100) NOT NULL, FechaNacimiento date NOT NULL,"
			// + "DNI VARCHAR(100) NOT NULL, Telefono int NOT NULL,Genero VARCHAR(100) NOT
			// NULL)");

			st_.executeUpdate(
					"CREATE TABLE Tratamientos(GrupoTTo VARCHAR(100) NOT NULL,CodTto VARCHAR(100) NOT NULL,Tratamiento VARCHAR(100) NOT NULL,PrecioTarifa decimal NOT NULL)");

			((java.sql.Connection) connection_).close();
			st_.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
