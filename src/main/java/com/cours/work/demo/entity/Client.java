package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
//=  таблица из ER - клиент - Антошкин
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "skidka", nullable = false)
    private double skidka;
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "phone", nullable = false)
    private String phone;

}

//comment_1