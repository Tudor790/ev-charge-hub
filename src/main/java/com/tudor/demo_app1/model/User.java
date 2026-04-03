package com.tudor.demo_app1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private String email;
    private String role;

}
