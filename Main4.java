import java.util.ArrayList;

class Student {
    String name;
    String grade;
    ArrayList<String> courses;
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " added for " + name);
    }


    void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " removed for " + name);
        } else {
            System.out.println(course + " not found for " + name);
        }
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
        System.out.println("-----------------------------");
    }
}

public class Main4 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Alice", "A");
        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.addCourse("English");
        s1.displayStudent();
        s1.removeCourse("Science");
        s1.displayStudent();
    }
}
