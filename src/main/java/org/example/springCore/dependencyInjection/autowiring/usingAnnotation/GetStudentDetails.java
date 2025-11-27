package org.example.springCore.dependencyInjection.autowiring.usingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GetStudentDetails {

    // We Can Use Any of The Three Ways

    @Autowired @Qualifier("student1")
    Student student;

//    @Autowired
//    public GetStudentDetails(Student student) {
//        this.student = student;
//    }
//
//    @Autowired
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    public String getDetails() {

        return student.toString();
    }
}
