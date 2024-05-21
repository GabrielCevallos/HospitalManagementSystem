import javax.print.Doc;
import java.util.Date;

public class MedicalAppointment {
    //Attributes
    private Date date;
    private Date hour;
    private String reason;

    //Relationships
    private Patient patient;
    private Doctor doctor;

    //Methods
    public Patient getPatient() {
        return null;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return null;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
