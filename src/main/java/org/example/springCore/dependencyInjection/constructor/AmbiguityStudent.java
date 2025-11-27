package org.example.springCore.dependencyInjection.constructor;

public class AmbiguityStudent {

    private String name;
    private int age;
    private int marks;
    private String course;

    public AmbiguityStudent(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public AmbiguityStudent(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public AmbiguityStudent() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AmbiguityStudent{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", marks=").append(marks);
        sb.append(", course='").append(course).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
