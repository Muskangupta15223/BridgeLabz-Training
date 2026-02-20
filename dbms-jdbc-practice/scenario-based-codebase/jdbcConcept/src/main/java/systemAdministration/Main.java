package systemAdministration;

import systemAdministration.dao.AdminDAO;
import systemAdministration.dao.AdminDAOImpl;
import systemAdministration.model.Specialty;

public class Main {

    public static void main(String[] args) {

        AdminDAO dao = new AdminDAOImpl();

        Specialty s = new Specialty();
        s.setName("Neurology");
        dao.addSpecialty(s);

        dao.updateSpecialty(1, "Advanced Neurology");

        dao.backupDatabase();

        dao.viewAuditLogs("admin", "specialties");
    }
}
