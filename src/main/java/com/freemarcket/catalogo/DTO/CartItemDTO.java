package com.freemarcket.catalogo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long id;
    private ProductDTO product;
    private Integer quantity;
    private CartDTO cart;

}
