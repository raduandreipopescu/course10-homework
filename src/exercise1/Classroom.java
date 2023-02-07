package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentGradeList;

    public Classroom(List<StudentGrade> studentGradeList) {
        this.studentGradeList = studentGradeList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> results = new ArrayList<>();
        for (StudentGrade studentGrade : studentGradeList) {
            if (discipline.equals(studentGrade.getDiscipline())) {
                results.add(studentGrade.getGrade());
            }
        }
        return results;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> results = new ArrayList<>();
        for (StudentGrade studentGrade : studentGradeList) {
            if (student.equals(studentGrade.getName())) {
                results.add(studentGrade.getGrade());
            }
        }
        return results;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade bestStudentForDiscipline = new StudentGrade();
        Integer maxGrade = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            if (discipline.equals(studentGrade.getDiscipline()) && studentGrade.getGrade() > maxGrade) {
                maxGrade = studentGrade.getGrade();
                bestStudentForDiscipline = studentGrade;
            }
        }
        return bestStudentForDiscipline;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade bestStudent = new StudentGrade();
        Integer maxGrade = 0;
        for (StudentGrade studentGrade : studentGradeList) {
            if (studentGrade.getGrade() > maxGrade) {
                maxGrade = studentGrade.getGrade();
                bestStudent = studentGrade;
            }
        }
        return bestStudent;
    }

    public Integer getAverageGrade(String discipline) {
        List<Integer> gradesForDiscipline = this.getGradesForDiscipline(discipline);
        Integer sumOfGrades = 0;
        for (Integer grade : gradesForDiscipline) {
            sumOfGrades += grade;
        }
        return sumOfGrades / gradesForDiscipline.size();
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade worstStudentForDiscipline = new StudentGrade();
        Integer lowestGrade = Integer.MAX_VALUE;
        for (StudentGrade studentGrade : studentGradeList) {
            if (discipline.equals(studentGrade.getDiscipline()) && studentGrade.getGrade() < lowestGrade) {
                lowestGrade = studentGrade.getGrade();
                worstStudentForDiscipline = studentGrade;
            }
        }
        return worstStudentForDiscipline;
    }
}
