import java.util.Scanner;

public class MainApplication {
    public static void StudentInput(Scanner scanner,StudentManage studentManage){
        int numOfStudent=Integer.parseInt(scanner.nextLine());
        int i=0;
        while (i<numOfStudent){
            studentManage.add(new Student(scanner.nextLine(), scanner.nextLine()
                    , scanner.nextLine(), Float.parseFloat(scanner.nextLine())));
            i++;
        }
    }
    public static void ShowInfoStudent(StudentManage studentManage){
        studentManage.showInfo();
    }
    public static void searchStudent(Scanner scanner,StudentManage studentManage){
        String keyword= scanner.nextLine();
        studentManage.findByFullNameContaining(keyword);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentManage studentManage=new StudentManage();
        StudentInput(scanner,studentManage);
        studentManage.sortStudent();
        ShowInfoStudent(studentManage);
        searchStudent(scanner,studentManage);
    }
}
