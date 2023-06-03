package Model;

import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private Human head;
    private int maxGroupCount;
    private List<Group> groups;
    public int getMaxGroupCount() {
        return maxGroupCount;
    }
    public void setMaxGroupCount(int maxGroupCount) {
        this.maxGroupCount = maxGroupCount;
    }
    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "maxGroupCount=" + maxGroupCount +
                ", groups=" + groups +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department department = (Department) o;
        return maxGroupCount == department.maxGroupCount &&
                Objects.equals(groups, department.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxGroupCount, groups);
    }
}