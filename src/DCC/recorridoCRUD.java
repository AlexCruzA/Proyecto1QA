package DCC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;
import objects.Recorrido;

public class recorridoCRUD {
	
	public long insertRecorrido(Recorrido recorrido) throws ClassNotFoundException {
        String SQL = "INSERT INTO recorrido(cod_Recorrido,num_Bus,desc_Recorrido,tiempo_Demora,zona_Recorrido,cantidad_Recorridos,estado) "
                + "VALUES(?,?,?,?,?,?,?)";
 
        long id = 0;
  
        try (Connection conn = Conexion.crearConexion();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                java.sql.Statement.RETURN_GENERATED_KEYS)) {
 
            pstmt.setInt(1, recorrido.getCod_Recorrido());
            pstmt.setInt(2, recorrido.getNum_Bus());
            pstmt.setString(3, recorrido.getDesc_Recorrido());
            pstmt.setString(4, recorrido.getTiempo_Demora());
            pstmt.setString(5, recorrido.getZona_Recorrido());
            pstmt.setInt(6, recorrido.getCantidad_Recorridos());
            pstmt.setBoolean(7, recorrido.getEstado());        
 
            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
	
	public int updateRecorrido(String cod_Recorrido, String num_Bus, String desc_Recorrido, String tiempo_Demora, String zona_Recorrido,
	int cantidad_Recorridos, Boolean estado)throws ClassNotFoundException {
	    String SQL = "UPDATE recorrido "
	            + "SET num_Bus = ?, desc_Recorrido = ?, tiempo_Demora = ?, zona_Recorrido = ?, cantidad_Recorridos = ?, estado = ? "
	            + "WHERE cod_Recorrido = ?";
	 
	        int affectedrows = 0;
	 
	        try (Connection conn = Conexion.crearConexion();
	                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
	 
	            pstmt.setString(1, num_Bus);
	            pstmt.setString(2, desc_Recorrido);
	            pstmt.setString(3, tiempo_Demora);
	            pstmt.setString(4, zona_Recorrido);
	            pstmt.setInt(5, cantidad_Recorridos);
	            pstmt.setBoolean(6, estado);
	        	pstmt.setString(7, cod_Recorrido);
	
	 
	            affectedrows = pstmt.executeUpdate();
	 
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
	        return affectedrows;
	}
	Recorrido r = new Recorrido();
	public Recorrido find_By_Id(int recorrido_Param) {
		return r;
	}
	public int deleteRecorrido(int id) throws ClassNotFoundException {
        String SQL = "DELETE FROM horario WHERE cod_Horario = ?";
 
        int affectedrows = 0;
 
        try (Connection conn = Conexion.crearConexion();
                PreparedStatement pstmt = conn.prepareStatement(SQL)) {
 
            pstmt.setInt(1, id);
 
            affectedrows = pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

}
