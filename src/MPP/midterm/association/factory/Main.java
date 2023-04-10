package MPP.midterm.association.factory;
import MPP.midterm.association.factory.otherpackage.DataRecord;
import MPP.midterm.association.factory.otherpackage.Database;
import MPP.midterm.association.factory.studreport.GradeReport;
import MPP.midterm.association.factory.studreport.StudentAndReport;
import MPP.midterm.association.factory.studreport.StudentGradeReportFactory;

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
