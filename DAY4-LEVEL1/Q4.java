import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student student) {
        students.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName + " | Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " | Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("School: " + schoolName + " | Students List:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("Sunrise High School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        school.showAllStudents();
        System.out.println();

        s1.showCourses();
        s2.showCourses();
        System.out.println();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
