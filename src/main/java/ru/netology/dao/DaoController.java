package ru.netology.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaoController {
    @Autowired
    DaoRepository repository;

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        System.out.println(name);
        return repository.getProductName(name);
    }
}
