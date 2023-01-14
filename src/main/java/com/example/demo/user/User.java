package main.java.com.example.demo.user;

import jakarta.persistence.*;


@Entity
@Table(name="users")
public class User {
    @Id
    @SequenceGenerator(
            name= "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
         strategy = GenerationType.SEQUENCE,
         generator = "user_sequence"

    )

    @Column(name= "id")
    public long id;
    public String userName;
    public String userPhone;
    public String userEmail;
    public String userPassword;
    public Integer userType;

    public User() {
    }

    public User(String userName, String userPhone, String userEmail, String userPassword, Integer userType) {
        this.userName= userName;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long userId) {
        this.id = userId;
    }


    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }








}
