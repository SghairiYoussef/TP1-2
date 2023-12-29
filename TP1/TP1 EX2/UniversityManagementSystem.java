public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating instructors
        Instructor instructor1 = new Instructor(1, "John", "Doe");
        Instructor instructor2 = new Instructor(2, "Jane", "Smith");

        // Creating courses with instructors
        Course course1 = new Course(101, "Mathematics", instructor1);
        Course course2 = new Course(202, "Physics", instructor2);

        // Creating students
        Student student1 = new Student(1001, "Alice", "Johnson");
        Student student2 = new Student(1002, "Bob", "Williams");

        // Enrolling students in courses
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course2);

        // Displaying student information
        System.out.println("Student 1:");
        System.out.println("ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Courses enrolled:");
        for (Course course : student1.getCourses()) {
            System.out.println("- " + course.getCourseName() + " taught by " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
        }
        System.out.println();

        System.out.println("Student 2:");
        System.out.println("ID: " + student2.getStudentId());
        System.out.println("Name: " + student2.getFirstName() + " " + student2.getLastName());
        System.out.println("Courses enrolled:");
        for (Course course : student2.getCourses()) {
            System.out.println("- " + course.getCourseName() + " taught by " + course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
        }
    }
}

