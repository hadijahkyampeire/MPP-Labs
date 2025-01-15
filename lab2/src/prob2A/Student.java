package prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeReport=" + gradeReport +
                '}';
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

}
