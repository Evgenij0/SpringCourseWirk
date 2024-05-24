package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Parts_Price")
//=  таблица из ER - Запчасть (цены) - Сулимов
public class PartsPrice {

    @Column(name = "id_part", nullable = false)
    private String id_part;

    @Column(name = "supplier_price", nullable = false)
    private String supplier_price;

    @Column(name = "selling_price", nullable = false)
    private String selling_price;

    @Column(name = "replacement_cost", nullable = false)
    private String replacement_cost;
}
