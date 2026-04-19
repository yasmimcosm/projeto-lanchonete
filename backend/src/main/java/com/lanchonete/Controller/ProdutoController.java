package com.lanchonete.Controller;

import com.lanchonete.model.Produto;
import com.lanchonete.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    // Retorna todos os produtos do cardápio
    @GetMapping
    public List<Produto> listarTodos() {
        return (List<Produto>) repository.findAll();
    }

    // Salva um novo produto (útil para o futuro painel administrativo)
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repository.save(produto);
    }
}