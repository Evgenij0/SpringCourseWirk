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
//=  таблица из ER - Заказ - Антошкин
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_order", nullable = false)
    private Long id_order;

    @Column(name = "id_client", nullable = false)
    private Long id_client;

    @Column(name = "order_discription", nullable = false)
    private String order_discription;

    @Column(name = "costs", nullable = false)
    private int costs;

    @Column(name = "isActive", nullable = false)
    private boolean isActive;



}
