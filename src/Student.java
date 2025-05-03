import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    List<String> subjects;

    //We do this to transfer all the data collected through the builder (like rollNumber, name, etc.) into the actual
    // Student object. The constructor acts as a data copier:
    public Student(StudentBuilder studentBuilder)
    {
        this.rollNumber= studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.subjects = studentBuilder.subjects;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
