package org.example.springCore.BeanWithoutXML.BeanAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("Prashant Kumar Jha")
    private String name;

    @Value("23")
    private int age;

    @Value("Python & Django")
    private String course;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", course='").append(course).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
