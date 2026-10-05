package D_S_Assignment;

public class Course {
    // Fields
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[10];
        this.numberOfStudents = 0;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Add Student
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop Student
    public void dropStudent(String student) {
        int index = -1;

        // 1. Loop
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
            }
        }


        if (index != -1) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    // Get Students List
    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, currentStudents, 0, numberOfStudents);
        return currentStudents;
    }
}



class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structure");
        c1.addStudent("Ahmed");
        c1.addStudent("Farhia");
        c1.addStudent("Mohamed");

        System.out.println("Course Name: " + c1.getCourseName());
        System.out.println("Number of students: " + c1.getNumberOfStudents());

        System.out.println("Dropping Mohamed...");
        c1.dropStudent("Mohamed");
        System.out.println("Number of students now: " + c1.getNumberOfStudents());
    }
}