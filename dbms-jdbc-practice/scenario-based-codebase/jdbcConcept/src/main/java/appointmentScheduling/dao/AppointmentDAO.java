package appointmentScheduling.dao;

import appointmentScheduling.model.Appointment;

public interface AppointmentDAO {

	boolean bookAppointment(Appointment ap);

	void checkDoctorAvailability(int doctorId, String date);

	boolean cancelAppointment(int appointmentId);

	boolean rescheduleAppointment(int appointmentId, Appointment newAp);

	void viewDailySchedule(String date);
}
