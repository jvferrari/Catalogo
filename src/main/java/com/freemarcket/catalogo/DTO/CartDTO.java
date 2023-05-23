package com.freemarcket.catalogo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CartDTO {

    private Long id;
    private UserDTO user;

}
