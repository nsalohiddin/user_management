package com.sn.user.user_management.user_management.vo;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
@Table
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "position",nullable = false)
    private String position;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "active",nullable = false)
    private boolean active;
    @Column(name="date", nullable = false)
    private String date;

}
