import java.time.LocalDate;

public class Student implements Comparable<Student>{
    private Long studentId;
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public Student(Long studentId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + this.studentId +'\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", patronymic='" + this.getPatronymic() + '\'' +
                ", dateOfBirth=" + this.getDateOfBirth() +
                '}';
    }
}
