import java.util.*;

public class Student {
    private String name;
    private int course;
    public Student(String n, int c)
    {
        this.name = n;
        this.course = c;
    }

    public String getName()
    {
        return this.name;
    }
    public int getCourse()
    {
        return this.course;
    }
    public static Set<String> PrintStudents(Map<String,Integer> map)
    {
        Set<String> result = new HashSet<>();
        System.out.print("Введіть курс: ");
        Scanner scanner = new Scanner(System.in); int selected_course = scanner.nextInt();
        if(map.containsValue(selected_course))
        {
            for(Map.Entry<String,Integer> entry: map.entrySet())
            {
                if(Objects.equals(entry.getValue(), selected_course))
                {
                    result.add(entry.getKey());
                }
            }
        }
        return result;
    }
    public static void printStudents(List<Student> students) {
        System.out.print("Введіть курс: ");
        Scanner scanner = new Scanner(System.in); int c = scanner.nextInt();
        Iterator<Student> iterator = students.iterator();
        System.out.print("Студенти які навчаються на " + c + " курсі: ");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getCourse() == c)
            {
                System.out.print(student.getName() + " ");
            }
        }
    }

}
