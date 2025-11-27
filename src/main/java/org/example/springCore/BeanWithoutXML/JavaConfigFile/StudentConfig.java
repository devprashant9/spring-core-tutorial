package org.example.springCore.BeanWithoutXML.JavaConfigFile;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.springCore.BeanWithoutXML.JavaConfigFile")
public class StudentConfig {
}
