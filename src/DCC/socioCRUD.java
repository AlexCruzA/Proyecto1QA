package DCC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;
import objects.Socio;

public class socioCRUD {
	
	public long insertSocio(Socio socio) throws ClassNotFoundException {
        String SQL = "INSERT INTO socio(cod_Socio,nombre,apellidos,linea,num_Bus,cap_Bus,ayudante,chofer,estado) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
 
        long id = 0;
  
        try (Connection conn = Conexion.crearConexion();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                java.sql.Statement.RETURN_GENERATED_KEYS)) {
 
            pstmt.setInt(1, socio.getCod_Socio());
            pstmt.setString(2, socio.getNombre());
            pstmt.setString(3, socio.getApellidos());
            pstmt.setString(4, socio.getLinea());
            pstmt.setInt(5, socio.getNum_Bus());
            pstmt.setInt(6, socio.getCap_Bus());
            pstmt.setString(7, socio.getAyudante());
            pstmt.setString(8, socio.getChofer());
            pstmt.setBoolean(9, socio.getEstado());

 
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
}
