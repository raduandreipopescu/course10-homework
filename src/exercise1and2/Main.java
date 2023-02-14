package exercise1and2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Classroom classroom = new Classroom(new StudentsFromFile("files/grades.txt").putStudentsFromFileToList());

        System.out.println("Grades for Mathematics are: " + classroom.getGradesForDiscipline("Mathematics"));
        System.out.println("Grades for Amilia Hilaria are: " + classroom.getGradesForStudent("Amilia Hilaria"));
        System.out.println("Max grade for Mathematics is: " + classroom.getMaxGrade("Mathematics"));
        System.out.println("Max grade is: " + classroom.getMaxGrade());
        System.out.println("Average grade for Mathematics is: " + classroom.getAverageGrade("Mathematics"));
        System.out.println("Worst grade for Mathematics is: " + classroom.getWorstGradeForReport("Mathematics"));

        ReportGenerator.generateReport(classroom.getStudentGradeList());
    }
}