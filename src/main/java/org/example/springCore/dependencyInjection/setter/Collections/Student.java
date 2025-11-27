package org.example.springCore.dependencyInjection.setter.Collections;

import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    List<String> addresses;
    Map<String, Integer> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", addresses=").append(addresses);
        sb.append(", courses=").append(courses);
        sb.append('}');
        return sb.toString();
    }
}
