package com.agsilva.springangular.Repository;

import com.agsilva.springangular.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
