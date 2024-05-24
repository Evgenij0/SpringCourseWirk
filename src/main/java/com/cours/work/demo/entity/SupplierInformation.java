package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SupplierInformation")
//=  таблица из ER - поставщик (данные) (2 таблица из ER) - Сотников
public class SupplierInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client", nullable = false)
    private Long id_client;

    @Column(name = "firm_name", nullable = false)
    private Long firm_name;

    @Column(name = "juridical_address", nullable = false)
    private String juridical_address;

    @Column(name = "physical_address", nullable = false)
    private int physical_address;
}
