package exercise1and2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator extends Classroom {

    public ReportGenerator(List<StudentGrade> studentGradeList) {
        super(studentGradeList);
    }

    public void generateReport() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/grade-reports.out"));
        StudentGrade maxStudentGrade = super.getMaxGrade();
        StudentGrade minStudentGrade = super.getWorstGrade();
        bufferedWriter.write("Cea mai mare nota: " + maxStudentGrade.getName() + " " + maxStudentGrade.getGrade());
        bufferedWriter.newLine();
        bufferedWriter.write("Nota medie: " + super.getAverageGrade());
        bufferedWriter.newLine();
        bufferedWriter.write("Cea mai mica nota: " + minStudentGrade.getName() + " " + minStudentGrade.getGrade());
        bufferedWriter.close();
    }


}
