package org.example.springCore.dependencyInjection.BeanLifeCycle.usingXML;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Property");
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void init() {
        System.out.println("InIt Method");
    }

    public void destroy() {
        System.out.println("Destroy Method");
    }
}
