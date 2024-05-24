package com.cours.work.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Supplier_contacts")
//=  таблица из ER - контактное лицо поставщика (4 таблица из ER) - Сулимов
public class SupplierContacts {

    @Column(name = "supplier_id", nullable = false)
    private String supplier_id;

    @Column(name = "supplier_second_name", nullable = false)
    private String supplier_second_name;

    @Column(name = "supplier_name", nullable = false)
    private String supplier_name;

    @Column(name = "supplier_patronymic", nullable = false)
    private String supplier_patronymic;

    @Column(name = "supplier_phone_number", nullable = false)
    private String supplier_phone_number;

    @Column(name = "supplier_email", nullable = false)
    private String supplier_email;
}
