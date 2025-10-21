package data;

import java.util.List;


public class StudentDTO {
    private String name;
    private List<String> activities;

    public StudentDTO() {
    }

    // constructor, getters, setters, toString

    public String getName() {
        return name;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public StudentDTO(String name, List<String> activities) {
        this.name = name;
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", activities=" + activities +
                '}';
    }
}
