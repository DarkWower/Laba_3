package Model;

import java.util.List;
import java.util.Objects;

public class Faculty extends Object {
    private String name;
    private Human head;
    private Human director;
    private int maxDepartmentCount;
    private List<Department> departments;

    public Human getDirector() {
        return director;
    }

    public void setDirector(Human director) {
        this.director = director;
    }

    public int getMaxDepartmentCount() {
        return maxDepartmentCount;
    }

    public void setMaxDepartmentCount(int maxDepartmentCount) {
        this.maxDepartmentCount = maxDepartmentCount;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "director=" + director +
                ", maxDepartmentCount=" + maxDepartmentCount +
                ", departments=" + departments +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return maxDepartmentCount == faculty.maxDepartmentCount &&
                director.equals(faculty.director) &&
                departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(director, maxDepartmentCount, departments);
    }
}