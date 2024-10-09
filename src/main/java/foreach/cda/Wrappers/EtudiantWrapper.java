package foreach.cda.Wrappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import foreach.cda.Model.Etudiants;

public class EtudiantWrapper implements RowMapper<Etudiants> {

    @Override
    public Etudiants mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Etudiants(
            rs.getInt("Id"), 
            rs.getString("Nom"), 
            rs.getString("Prenom"), 
            rs.getString("Email"), 
            rs.getString("Telephone")
        );
    }
    
}
