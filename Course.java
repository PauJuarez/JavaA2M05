package activiti2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> students;

    // Constructor
    public Course() {
        this.students = new ArrayList<>();
    }

    // Operation: Count students
    public int countStudents() {
        return students.size();
    }

    // Operation: Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Operation: Remove student
    public void removeStudent(Student student) {
        students.remove(student);
    }
}

