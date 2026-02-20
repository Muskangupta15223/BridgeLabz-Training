package appointmentScheduling;

import java.time.LocalDate;
import java.time.LocalTime;

import appointmentScheduling.dao.AppointmentDAO;
import appointmentScheduling.dao.AppointmentDAOImpl;
import appointmentScheduling.model.Appointment;

public class Main {

    public static void main(String[] args) {

        AppointmentDAO dao = new AppointmentDAOImpl();

        Appointment ap = new Appointment();
        ap.setPatientId(1);
        ap.setDoctorId(3);
        ap.setDate(LocalDate.now());
        ap.setTime(LocalTime.of(10, 0));

        dao.bookAppointment(ap);

        dao.checkDoctorAvailability(1, "2026-02-14");

        dao.viewDailySchedule("2026-02-14");

        dao.cancelAppointment(1);
    }
}
