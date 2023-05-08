package com.freemarcket.catalogo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {

    private Long id;
    private Product product;
    private Integer quantity;
    private Cart cart;

}
