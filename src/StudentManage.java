import java.util.ArrayList;
import java.util.Collections;

public class StudentManage {
    private ArrayList<Student> students;

    public StudentManage(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManage() {
        this.students=new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void add(Student student){
        students.add(student);
    }
    public void sortStudent(){
        Collections.sort(students);
    }
    public void showInfo(){
        for (Student student:students){
            System.out.println(student);
        }
    }
    public void findByFullNameContaining(String keyword){
        for (Student student: students
             ) {
            if(student.getFullName().contains(keyword)){
                System.out.println(student);
            }
        }
    }
}
