package com.agsilva.springangular;

import com.agsilva.springangular.Repository.CategoriaRepository;
import com.agsilva.springangular.Repository.LivroRepository;
import com.agsilva.springangular.domain.Categoria;
import com.agsilva.springangular.domain.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringAngularApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática","Livros de informática");
		Livro li = new Livro(null, "Clean Code","Robert Martison","Lore ipson",cat1);

		cat1.getLivros().addAll(Arrays.asList(li));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(li));
	}
}