package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PartsSupply")
//=  таблица из ER - поставки запчастей - Сотников
public class PartsSupply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_spare_part", nullable = false)
    private Long id_spare_part;

    @Column(name = "id_client", nullable = false)
    private Long id_client;

    @Column(name = "part_quantity", nullable = false)
    private int part_quantity;

    @Column(name = "critical_parts_left", nullable = false)
    private int critical_parts_left;
}
