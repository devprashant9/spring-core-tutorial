package org.example.springCore.dependencyInjection.constructor;

public class Student {
    private String name;
    private String age;
    private String course;

    public Student(String name, String age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", course='").append(course).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
