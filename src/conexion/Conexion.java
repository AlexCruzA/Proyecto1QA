package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static final String URL = "jdbc:postgresql://localhost:5432/projectQA";
	static final String USER = " ";
	static final String PASS = "12345";
	 
	public static Connection crearConexion() throws ClassNotFoundException, SQLException{
	Class.forName("org.postgresql.Driver");
	Connection conexion = DriverManager.getConnection(URL, USER, PASS);
	if (conexion != null){
	System.out.print("Conexion establecida...");
	return conexion;
	}
	return null;
	}
}

