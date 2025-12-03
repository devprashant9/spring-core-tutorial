package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "USERS_TABLE")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "USER_EMAIL", nullable = false, unique = true)
    private String userEmail;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String userPassword;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "LAST_UPDATED_AT")
    private LocalDateTime updatedAt;

    public UserModel() {
        // Because JPA Creates Object With Reflection And Not With "new" Keyword
    }

    public UserModel(Integer userId, String userName, String userEmail, String userPassword, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist  // Runs Before A New Row Is Inserted
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate // Runs Before A New Row Is Updated
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

}
