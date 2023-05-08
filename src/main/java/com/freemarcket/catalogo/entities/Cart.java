package com.freemarcket.catalogo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table
public class Cart {

    private Long id;
    private User user;

}
