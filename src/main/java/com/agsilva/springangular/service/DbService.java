package com.agsilva.springangular.service;

import com.agsilva.springangular.Repository.CategoriaRepository;
import com.agsilva.springangular.Repository.LivroRepository;
import com.agsilva.springangular.domain.Categoria;
import com.agsilva.springangular.domain.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados(){
        Categoria cat1 = new Categoria(null, "Informática","Livros de informática");
        Categoria cat2 = new Categoria(null, "Matemática","Exercícios da 8ª Série");
        Categoria cat3 = new Categoria(null, "Romance","O amor entre as políticas");

        Livro li = new Livro(null, "Clean Code","Robert Martison","Lore ipson",cat1);
        Livro l2 = new Livro(null, "Utilizando uml e padões","Robert Martison","Lore ipson",cat1);
        Livro l3 = new Livro(null, "Análise de projeto","Use a cabeça","Lore ipson",cat1);


        cat1.getLivros().addAll(Arrays.asList(li,l2,l3));

        this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        this.livroRepository.saveAll(Arrays.asList(li, l2,l3));
    }
}
