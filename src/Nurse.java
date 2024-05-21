import java.util.ArrayList;

public class Nurse extends Person implements AppointmentManagement{
    //Attributes
    private String nurseId;
    private float salary;

    //Relationships
    private ArrayList<Doctor> doctorList;
    private ArrayList<Patient> patientList;

    //Methods
    public Nurse() {
        this.doctorList = new ArrayList<>();
        this.patientList = new ArrayList<>();
    }

    //Getters and Setters
    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public void scheduleAppointment() {

    }

    @Override
    public void makeAppointment() {

    }

    @Override
    public void cancelAppointment() {

    }
}
