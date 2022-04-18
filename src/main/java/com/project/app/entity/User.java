package com.project.app.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "ID_USER")
    private int idUser;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TELEPHONE")
    private String phone;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String pass;

    @OneToMany(mappedBy = "user")
    private Set<Advertisement> advertisements;

    @Column(name = "ROLE")
    private String role;

    public int getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public Set<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAdvertisements(Set<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser == user.idUser && Objects.equals(name, user.name) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && Objects.equals(pass, user.pass) && Objects.equals(advertisements, user.advertisements) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, phone, email, pass, advertisements, role);
    }
}
