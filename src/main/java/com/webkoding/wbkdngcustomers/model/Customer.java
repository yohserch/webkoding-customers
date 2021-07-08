package com.webkoding.wbkdngcustomers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer autoId;

    private String id;

    private String username;

    private Date birthdate;

    private String password;

    private Date createdAt;

    private Boolean isActive;
}
