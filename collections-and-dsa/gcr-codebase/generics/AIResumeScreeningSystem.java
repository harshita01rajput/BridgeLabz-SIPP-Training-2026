import java.util.ArrayList;
import java.util.List;

interface JobRole {
    void evaluate();
}

class SoftwareEngineer implements JobRole {
    public void evaluate() {
        System.out.println("Software Engineer Resume: Checked for Java, DSA, and Development Skills");
    }
}

class DataScientist implements JobRole {
    public void evaluate() {
        System.out.println("Data Scientist Resume: Checked for Python, ML, and Data Analysis Skills");
    }
}

class ProductManager implements JobRole {
    public void evaluate() {
        System.out.println("Product Manager Resume: Checked for Management and Communication Skills");
    }
}

class Resume<T extends JobRole> {

    String candidateName;
    T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public T getRole() {
        return role;
    }

    public String getCandidateName() {
        return candidateName;
    }
}

public class AIResumeScreeningSystem {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Candidate: " + resume.getCandidateName());
        resume.getRole().evaluate();
    }

    public static void displayAllResumes(List<? extends Resume<?>> resumes) {
        for (Resume<?> resume : resumes) {
            System.out.println("Candidate: " + resume.getCandidateName());
            resume.getRole().evaluate();
        }
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> resume1 =
                new Resume<>("Harshita", new SoftwareEngineer());

        Resume<DataScientist> resume2 =
                new Resume<>("Riya", new DataScientist());

        Resume<ProductManager> resume3 =
                new Resume<>("Amit", new ProductManager());

        List<Resume<?>> resumes = new ArrayList<>();

        resumes.add(resume1);
        resumes.add(resume2);
        resumes.add(resume3);

        System.out.println("AI Resume Screening Results:");

        displayAllResumes(resumes);
    }
}