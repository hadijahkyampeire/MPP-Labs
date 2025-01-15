package prob2A;

public class GradeReport {
    private Student student;

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student.getName() +
                '}';
    }

    GradeReport(Student studentInput) {
        this.student = studentInput;
    }

    public Student getStudent() {
        return student;
    }
}
