package com.freemarcket.catalogo.resources;

import com.freemarcket.catalogo.DTO.CategoryDTO;
import com.freemarcket.catalogo.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll() {
        List<CategoryDTO> list = new ArrayList<>();
        list.add(new CategoryDTO(1L, "Books"));
        list.add(new CategoryDTO(2L, "Eletronics"));
        return ResponseEntity.ok().body(list);

    }
}
