package a4streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapFilterReduce {

    public static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream() //stream<student>
                .filter(student -> student.getGradeLevel()>3)
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoteBooks)//stream<Integer>
                .reduce(0,Integer::sum);
//                .reduce(0,(a,b)->a+b);
    }
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
