package foreach.cda.Wrappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import foreach.cda.Model.Cours;
import foreach.cda.Services.EtudiantService;
import foreach.cda.Services.FormateurService;
import foreach.cda.Services.UEService;

public class CoursWrapper implements RowMapper<Cours> {
    private UEService ueService;
    private FormateurService formateurService;
    private EtudiantService etudiantService;

    public CoursWrapper() {
        this.ueService = new UEService();
        this.formateurService = new FormateurService();
        this.etudiantService = new EtudiantService();
    }

    

    @Override
    public Cours mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Cours(rs.getInt("Id"),
        rs.getDate("Date_Debut"),
        rs.getDate("Date_Fin"),
        this.ueService.getByID(rs.getInt("FK_UE")),
        this.formateurService.getByID(rs.getInt("FK_Formateur")),
        this.etudiantService.getByCourID(rs.getInt("Id"))
        );
    }
    
}
