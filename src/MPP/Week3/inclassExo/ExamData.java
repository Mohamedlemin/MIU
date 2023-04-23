package MPP.Week3.inclassExo;

public class ExamData {
    private String studentName ;
    private double testScore;

    public ExamData(String studentName, double testScore) {
        this.studentName = studentName;
        this.testScore = testScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getTestScore() {
        return testScore;
    }
}
