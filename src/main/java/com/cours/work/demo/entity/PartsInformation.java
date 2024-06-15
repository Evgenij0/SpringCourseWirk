package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Parts_information")
//=  таблица из ER - Запчасть (данные) - Сулимов
public class PartsInformation {
    @Id
    @Column(name = "id_part", nullable = false)
    private Long id_part;

    @Column(name = "part_name", nullable = false)
    private String part_name;

    @Column(name = "part_ind_num", nullable = false)
    private String part_ind_num;

    @Column(name = "part_type", nullable = false)
    private String part_type;

    @Column(name = "supplier_code", nullable = false)
    private Long supplier_code;

    @Column(name = "part_condition", nullable = false)
    private String part_condition;
}
