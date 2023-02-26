import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        System.out.print("Скільки студентів додати у список?: "); Scanner scanner = new Scanner(System.in);
        int studentsCount = scanner.nextInt();
        for(int i = 0; i < studentsCount; i++)
        {
            System.out.print("Імя " + (i+1) + "-го " + "студента: ");
            String name = scanner.next();
            System.out.print("Група " + (i+1) + "-го " + "студента: ");
            int course = scanner.nextInt();
            studentList.add(new Student(name,course));
        }
        Student.printStudents(studentList);
    }
}