package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workers")
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "number_TK_Dogovor", nullable = false)
    private String number_TK_Dogovor;

    @Column(name = "dolzhnosty", nullable = false)
    private String dolzhnosty;

    @Column(name = "salari", nullable = false)
    private int salari;

    @Column(name = "stadj_in_Year", nullable = false)
    private int stadj_in_Year;

}
