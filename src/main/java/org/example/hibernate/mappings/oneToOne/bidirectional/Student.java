package org.example.hibernate.mappings.oneToOne.bidirectional;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT_TABLE")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID", nullable = false, unique = true)
    private int Id;

    @Column(name = "STUDENT_NAME", nullable = false, length = 20)
    private String name;

    @Column(name = "STUDENT_EMAIL", nullable = false, length = 30, unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "CERTIFICATE_ID")
    Certificate certificate;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
