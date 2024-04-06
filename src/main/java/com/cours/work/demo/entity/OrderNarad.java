package com.cours.work.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workers")
//=  таблица из ER - Закакз наряд - Антошкин
public class OrderNarad {

    @Id
    @Column(name = "id_order", nullable = false)
    private Long id_order;

    @Column(name = "enum_detail", nullable = false)
    private String enum_detail;

    @Column(name = "id_worker_to_ktu_JSON", nullable = false)
    private String id_worker_to_ktu_JSON;

}
