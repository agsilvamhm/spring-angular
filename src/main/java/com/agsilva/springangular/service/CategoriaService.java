package com.agsilva.springangular.service;

import com.agsilva.springangular.Repository.CategoriaRepository;
import com.agsilva.springangular.domain.Categoria;
import com.agsilva.springangular.dtos.CategoriaDTO;
import com.agsilva.springangular.exceptions.DataIntegrityVioletionException;
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

    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }

    public Categoria create(Integer id, CategoriaDTO objDTO){
        Categoria obj = findById(id);
        obj.setNome(objDTO.getNome());
        obj.setDescricao(objDTO.getDescricao());
        return repository.save(obj);
    }

    public void delete(Integer id){
        findById(id);
        try {
          repository.deleteById(id);
        }catch (DataIntegrityVioletionException e){
            throw new DataIntegrityVioletionException("Categoria não pode ser deletado!, possui livros associados.");
        }
    }
}