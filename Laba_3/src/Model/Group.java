package Model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Human head;
    private int maxStudentCount;
    List<Student> students;

    public int getMaxStudentCount() {
        return maxStudentCount;
    }

    public void setMaxStudentCount(int maxStudentCount) {
        this.maxStudentCount = maxStudentCount;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "maxStudentCount=" + maxStudentCount +
                ", students=" + students.toString() +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return maxStudentCount == group.maxStudentCount &&
                Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxStudentCount, students);
    }
}