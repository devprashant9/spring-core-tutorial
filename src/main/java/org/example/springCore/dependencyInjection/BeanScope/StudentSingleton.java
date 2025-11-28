package org.example.springCore.dependencyInjection.BeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentSingleton {

    @Value("Prashant Kumar Jha Singleton Object")
    private String name;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentSingleton{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
