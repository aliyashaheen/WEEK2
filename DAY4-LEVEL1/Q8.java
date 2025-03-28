import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Professor: " + name);
    }
}

class Student {
    String name;
    ArrayList<Course> enrolledCourses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.title);
    }

    void viewCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.title);
        }
    }
}

class Course {
    String title;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String title) {
        this.title = title;
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.name + " assigned to " + title);
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showCourseInfo() {
        System.out.println("Course: " + title);
        if (professor != null) {
            System.out.print("Taught by: ");
            professor.display();
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        c1.showCourseInfo();
        c2.showCourseInfo();

        s1.viewCourses();
        s2.viewCourses();
    }
}
