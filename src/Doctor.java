import java.util.ArrayList;

public class Doctor extends Person{
    //Attributes
    private String doctorId;
    private float salary;

    //Relationships
    private ArrayList<Patient> patientList;
    private ArrayList<Nurse> nurseList;
    private MedicalAppointment medicalAppointment;

    //Methods
    public Doctor() {
        this.patientList = new ArrayList<>();
        this.nurseList = new ArrayList<>();
    }

    //Getters and Setters
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    @Override
    public void scheduleAppointment() {
        System.out.println("Scheduling appointment");
    }

    @Override
    public void makeAppointment() {
        System.out.println("Making appointment");
    }

    @Override
    public void cancelAppointment() {
        System.out.println("Cancelling appointment");
    }
}
