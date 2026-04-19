package com.lanchonete.Config;

import com.lanchonete.model.Produto;
import com.lanchonete.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DataSeeder {
    public DataSeeder(){

    }
    @Bean
    CommandLineRunner initDatabase(ProdutoRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                System.out.println("🥗 Populando banco de dados inicial...");

                Produto p1 = new Produto(null, "X-Salada", "Hambúrguer, alface, tomate e queijo", new BigDecimal("25.50"));
                Produto p2 = new Produto(null, "Batata Frita", "Porção individual crocante", new BigDecimal("12.00"));
                Produto p3 = new Produto(null, "Refrigerante", "Lata 350ml", new BigDecimal("6.00"));

                repository.saveAll(List.of(p1, p2, p3));

                System.out.println("✅ Cardápio inicial cadastrado com sucesso!");
            } else {
                System.out.println("✨ Banco de dados já possui produtos. Pulando semeadura.");
            }
        };
    }
}