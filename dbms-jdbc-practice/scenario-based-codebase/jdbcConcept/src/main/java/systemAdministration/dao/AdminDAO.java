package systemAdministration.dao;

import systemAdministration.model.Specialty;

public interface AdminDAO {

	boolean addSpecialty(Specialty s);

	boolean updateSpecialty(int id, String newName);

	boolean deleteSpecialty(int id);

	void backupDatabase();

	void viewAuditLogs(String user, String tableName);
}
