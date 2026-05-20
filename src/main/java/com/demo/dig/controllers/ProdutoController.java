package com.demo.dig.controllers;

import com.demo.dig.models.ProdutoModel;
import com.demo.dig.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @PostMapping
    public ProdutoModel addProduto(ProdutoModel produtoModel) {
        return produtoService.addProduto(produtoModel);
    }
}
