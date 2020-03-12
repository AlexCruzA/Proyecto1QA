package DCC;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.Conexion;
import objects.Horario;
import java.sql.Connection;

public class horarioCRUD {
	
	public long insertHorario(Horario horario) throws ClassNotFoundException {
        String SQL = "INSERT INTO horario(cod_Horario,num_bus,desc_Horario,tiempo_Salida,tiempo_llegada,estado) "
                + "VALUES(?,?,?,?,?,?)";
 
        long id = 0;
  
        try (Connection conn = Conexion.crearConexion();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                java.sql.Statement.RETURN_GENERATED_KEYS)) {
 
            pstmt.setInt(1, horario.getCod_Horario());
            pstmt.setInt(2, horario.getNum_Bus());
            pstmt.setString(3, horario.getDesc_Horario());
            pstmt.setString(4, horario.getTiempo_Salida());
            pstmt.setString(5, horario.getTiempo_llegada());
            pstmt.setBoolean(6, horario.getEstado());

 
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
