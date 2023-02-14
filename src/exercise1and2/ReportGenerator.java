package exercise1and2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {

    public static void generateReport(List<StudentGrade> studentGrades) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/grade-reports.out"));
        StudentGrade maxStudentGrade = Classroom.getMaxGradeForReport(studentGrades);
        StudentGrade minStudentGrade = Classroom.getWorstGradeForReport(studentGrades);
        bufferedWriter.write("Cea mai mare nota: " + maxStudentGrade.getName() + " " + maxStudentGrade.getGrade());
        bufferedWriter.newLine();
        bufferedWriter.write("Nota medie: " + Classroom.getAverageGradeForReport(studentGrades));
        bufferedWriter.newLine();
        bufferedWriter.write("Cea mai mica nota: " + minStudentGrade.getName() + " " + minStudentGrade.getGrade());
        bufferedWriter.close();
    }
}