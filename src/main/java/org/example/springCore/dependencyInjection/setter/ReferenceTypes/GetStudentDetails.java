package org.example.springCore.dependencyInjection.setter.ReferenceTypes;

public class GetStudentDetails {
    private Student studentObj;

    public Student getStudentObj() {
        return studentObj;
    }

    public void setStudentObj(Student studentObj) {
        this.studentObj = studentObj;
    }

    public String getDetails() {
        return studentObj.toString();
    }
}
