package org.example.hibernate.mappings.oneToOne.bidirectional;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT_CERTIFICATE")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CERTIFICATE_ID", nullable = false, unique = true)
    private int Id;

    @Column(name = "COURSE_NAME", nullable = false)
    private String course;

    @Column(name = "UNIQUE_NUMBER", nullable = false, length = 20, unique = true)
    private String certificateNumber;

    @OneToOne(mappedBy = "certificate")
    private Student student;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
