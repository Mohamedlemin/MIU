package MPP.Week1.association.factory;
import MPP.Week1.association.factory.otherpackage.DataRecord;
import MPP.Week1.association.factory.otherpackage.Database;
import MPP.Week1.association.factory.studreport.GradeReport;
import MPP.Week1.association.factory.studreport.StudentAndReport;
import MPP.Week1.association.factory.studreport.StudentGradeReportFactory;

import java.util.*;




public class Main {

	public static void main(String[] args) {
		printTopStudents();		
	}
	public static void printTopStudents() {
		var data = Database.h.values();
		List<GradeReport> reports = new ArrayList<>();
		for(DataRecord d : data) {
			StudentAndReport sr
			  = StudentGradeReportFactory
			      .createStudentAndReport(d.getName(), d.getGrade());
			reports.add(sr.getReport());	
		}
		
		Collections.sort(reports);
		Iterator<GradeReport> it = reports.iterator();
		System.out.println("A Students:");
		GradeReport next = null;
		while((next =it.next()) != null && next.getGrade().equals("A")) {
			System.out.print(next.getStudent().getName() + " ");
		}
	}
	

}
