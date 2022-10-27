package com.agsilva.springangular.service;

import com.agsilva.springangular.Repository.CategoriaRepository;
import com.agsilva.springangular.domain.Categoria;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService{

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! id:" + id + "",  "Tipo:" + Categoria.class.getName()));
    }

    public List<Categoria> findAll(){
        return repository.findAll();
    }
}