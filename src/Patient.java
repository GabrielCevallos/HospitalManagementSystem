import java.util.ArrayList;

public class Patient extends Person{
    //Attributes
    private String patientId;

    //Relationships
    private ArrayList<Doctor> doctorList;
    private ArrayList<Nurse> nurseList;
    private MedicalAppointment medicalAppointment;

    //Methods
    public Patient() {
        this.doctorList = new ArrayList<>();
        this.nurseList = new ArrayList<>();
    }

    //Getters and Setters
    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
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
