package main.java.com.example.demo.admin;

import jakarta.persistence.*;


@Entity
@Table(name="admins")
public class Admin {
    @Id
    @SequenceGenerator(
            name= "admin_sequence",
            sequenceName= "admin_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "admin_sequence"
    )

    private long id;
    private String username;
    private String email;
    private String password;

    public Admin() {
    }

    public Admin(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
