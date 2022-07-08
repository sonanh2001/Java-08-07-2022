public class Student implements Comparable<Student>{
    private String studentId;
    private String fullName;
    private String phoneNumber;
    private float gpa;

    public Student(String studentId, String fullName, String phoneNumber, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(this.gpa,o.gpa);
    }
}
