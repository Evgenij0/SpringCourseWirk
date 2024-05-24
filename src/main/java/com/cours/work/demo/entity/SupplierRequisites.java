package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SupplierRequisites")
//=  таблица из ER - поставщик (реквизиты) (3 таблица из ER) - Сотников
public class SupplierRequisites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client", nullable = false)
    private Long id_client;

    @Column(name = "INN", nullable = false)
    private int INN;

    @Column(name = "CPP", nullable = false)
    private int CPP;

    @Column(name = "BIK", nullable = false)
    private int BIK;

    @Column(name = "KORR", nullable = false)
    private Long KORR;
}
