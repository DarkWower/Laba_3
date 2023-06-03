package Controllen;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(int countOfDepartments, int maxDepartmentsCount, Human director) {
        Faculty faculty = new Faculty();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < countOfDepartments; i++) {
            departments.add(departmentCreator.createTypicalDepartment());
        }

        faculty.setDepartments(departments);
        faculty.setMaxDepartmentCount(maxDepartmentsCount);
        faculty.setDirector(director);

        return faculty;
    }

    public Faculty createTypicalFaculty() {
        HumanCreator humanCreator = new HumanCreator();
        Faculty faculty = createFaculty(3, 5, humanCreator.createTypicalHuman());
        return faculty;
    }
}