package foreach.cda.Wrappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import foreach.cda.Model.Formateur;



public class FormateurWrapper implements RowMapper<Formateur> {

    @Override
    public Formateur mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Formateur(rs.getInt("Id"),
        rs.getString("Nom"),
        rs.getString("Prenom"), 
        rs.getString("Email"),
        rs.getString("Telephone")
        );
    }
    
}
