package exercise1and2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentsFromFile {
    private String filePath;

    public StudentsFromFile(String filePath) {
        this.filePath = filePath;
    }

    public List<StudentGrade> putStudentsFromFileToList() throws IOException {
        List<StudentGrade> studentGradeList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String readLine;
        while ((readLine = bufferedReader.readLine()) != null) {
            studentGradeList.add(splitReadLine(readLine));
        }
        bufferedReader.close();
        return studentGradeList;
    }

    private StudentGrade splitReadLine(String readLine) {
        String[] partOfReadLine = readLine.split(Pattern.quote("|"));
        return new StudentGrade(partOfReadLine[0], partOfReadLine[1], Integer.parseInt(partOfReadLine[2]));
    }
}