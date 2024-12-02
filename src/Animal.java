import java.util.Arrays;
import java.util.Date;

public class Animal {
    private String name;
    private TypePet type;
    private String breed;
    private String age;
    private MedicalHistory medicalHistory;

    public Animal() {
    }

    public Animal(String name, TypePet type, String breed, String age, MedicalHistory medicalHistory) {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePet getType() {
        return type;
    }

    public void setType(TypePet type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", breed='" + breed + '\'' +
                ", age='" + age + '\'' +
                ", medicalHistory=" + medicalHistory +
                '}';
    }
}

class MedicalHistory {
    private String medicalHistoryDetails;
    private VacPet[] vaccinations;
    private Treatment treatment;
    private DiagnosisDetails diagnosisDetails;

    public MedicalHistory() {
    }

    public MedicalHistory(String medicalHistoryDetails, VacPet[] vaccinations, Treatment treatment, DiagnosisDetails diagnosisDetails) {
        this.medicalHistoryDetails = medicalHistoryDetails;
        this.vaccinations = vaccinations;
        this.treatment = treatment;
        this.diagnosisDetails = diagnosisDetails;
    }

    // Getters and Setters
    public String getMedicalHistoryDetails() {
        return medicalHistoryDetails;
    }

    public void setMedicalHistoryDetails(String medicalHistoryDetails) {
        this.medicalHistoryDetails = medicalHistoryDetails;
    }

    public VacPet[] getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(VacPet[] vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public DiagnosisDetails getDiagnosisDetails() {
        return diagnosisDetails;
    }

    public void setDiagnosisDetails(DiagnosisDetails diagnosisDetails) {
        this.diagnosisDetails = diagnosisDetails;
    }

    @Override
    public String toString() {
        return "MedicalHistory{" +
                "medicalHistoryDetails='" + medicalHistoryDetails + '\'' +
                ", vaccinations=" + Arrays.toString(vaccinations) +
                ", treatment=" + treatment +
                ", diagnosisDetails=" + diagnosisDetails +
                '}';
    }
}

class DiagnosisDetails {
    private String diagnosis;
    private Date treatmentDate;
    private String diagnosisDate;

    public DiagnosisDetails() {
    }

    public DiagnosisDetails(String diagnosis, Date treatmentDate, String diagnosisDate) {
        this.diagnosis = diagnosis;
        this.treatmentDate = treatmentDate;
        this.diagnosisDate = diagnosisDate;
    }

    // Getters and Setters
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public String getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(String diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }
}