package org.example.springCore.dependencyInjection.SpEL;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("#{18 + 2}")
    private int age;

    @Value("#{20 > 18 ? true : false}")
    private boolean isAbleToVote;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("age=").append(age);
        sb.append(", isAbleToVote=").append(isAbleToVote);
        sb.append('}');
        return sb.toString();
    }
}
