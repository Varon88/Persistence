package org.example;


import jakarta.persistence.*;

@Entity //converts the class into the form of an entity
@Table(name = "student")
public class student {

    @Id //creates the property as a Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", userName='" + userName + '\'' + '}';
    }
}
