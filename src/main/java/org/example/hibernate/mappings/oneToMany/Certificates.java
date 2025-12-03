package org.example.hibernate.mappings.oneToMany;

import jakarta.persistence.*;

@Entity
@Table(name = "CERTIFICATES")
public class Certificates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "UNIQUE_NUMBER")
    private String uniqueNumber;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
