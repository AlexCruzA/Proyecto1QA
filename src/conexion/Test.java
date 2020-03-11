package conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args){
		try {
			Connection con = Conexion.crearConexion();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
