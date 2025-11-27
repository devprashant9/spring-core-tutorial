package org.example.springCore.dependencyInjection.autowiring.usingXML;

public class GetStudentDetails {
    Student student; // Looks For Bean By This Name in XML Configuration

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDetails() {
        return student.toString();
    }
}
