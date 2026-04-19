package com.lanchonete.repository;

import com.lanchonete.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, String>{
    // public Produto findByProduto(String produto);
}
