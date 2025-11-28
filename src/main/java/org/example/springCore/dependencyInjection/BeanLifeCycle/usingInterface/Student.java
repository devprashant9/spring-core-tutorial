package org.example.springCore.dependencyInjection.BeanLifeCycle.usingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student implements InitializingBean, DisposableBean {

    @Value("Prashant Kumar Jha")
    private String name;

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InIt Method");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
