public class Main {
    public static void main(String[] args) {
        Student student = new EngineeringStudentBuilder()
                .setRollNumber(101)
                .setName("Abhijeet")
                .setAge(24)
                .setSubjects()  // This sets default Engineering subjects
                .build();       // This builds the final Student object

        System.out.println(student);
    }
}