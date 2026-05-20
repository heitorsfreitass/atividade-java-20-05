package com.demo.dig.services;

import com.demo.dig.models.ProdutoModel;
import com.demo.dig.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel addProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }
}
