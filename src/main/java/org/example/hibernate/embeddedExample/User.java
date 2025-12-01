package org.example.hibernate.embeddedExample;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_TABLE")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "USER_FULL_NAME", nullable = false, length = 20)
    private String fullName;

    @Column(name = "USER_EMAIL", nullable = false, unique = true, length = 30)
    private String email;

    @Column(name = "USER_ADDRESS")
    private Address address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
