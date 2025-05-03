import java.util.List;

abstract public class StudentBuilder {

    int rollNumber;
    int age;
    String name;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber)
    {
        this.rollNumber=rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
