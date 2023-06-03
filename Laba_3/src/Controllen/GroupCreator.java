package Controllen;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {
    public Group createGroup(int countOfStudents, int maxStudentsCount) {
        Group group = new Group();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < countOfStudents; i++) {
            students.add(studentCreator.createTypicalStudent());
        }
        group.setStudents(students);
        group.setMaxStudentCount(maxStudentsCount);

        return group;
    }

    public Group createTypicalGroup() {
        Group group = createGroup(5, 8);
        return group;
    }
}
