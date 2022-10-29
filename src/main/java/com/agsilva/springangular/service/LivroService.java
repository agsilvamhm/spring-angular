package com.agsilva.springangular.service;

import com.agsilva.springangular.Repository.LivroRepository;
import com.agsilva.springangular.domain.Livro;
import com.agsilva.springangular.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", Tipo: " + Livro.class.getName()));
    }
}
