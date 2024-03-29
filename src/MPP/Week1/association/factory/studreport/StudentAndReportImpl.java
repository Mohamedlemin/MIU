package MPP.Week1.association.factory.studreport;

//Immutable relative to its package studreport
final class StudentAndReportImpl implements StudentAndReport {
	private Student student;
	private GradeReport report;
	StudentAndReportImpl(Student s, GradeReport g) {
		student = s;
		report = g;
	}
	public Student getStudent() {
		return student;
	}
	public GradeReport getReport() {
		return report;
	}
}
