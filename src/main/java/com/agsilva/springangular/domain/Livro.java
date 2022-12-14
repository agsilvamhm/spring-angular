package com.agsilva.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String titulo;
    @NotNull
    private String nome_autor;
    @NotNull
    private String texto;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

    public Livro() {
        super();
    }

    public Livro(Integer id, String titulo, String nome_autor, String texto, Categoria categoria) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    @NotEmpty(message = "Campo TITULO é requerido!")
    @Length(min = 3, max = 50, message = "O campo TITULO deve ter entre 3 a 50 caracteres")
    public String getTitulo() {
        return titulo;
    }
    @NotEmpty(message = "Campo NOME DO AUTOR é requerido!")
    @Length(min = 3, max = 50, message = "O campo NOME DO AUTOR deve ter entre 3 a 50 caracteres")
    public String getNome_autor() {
        return nome_autor;
    }

    @NotEmpty(message = "Campo TEXTO DO AUTOR é requerido!")
    @Length(min = 10, max = 2000000, message = "O campo TEXTO deve ter entre 10 a 2.000.000 caracteres")
    public String getTexto() {
        return texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(getId(), livro.getId()) && Objects.equals(getTitulo(), livro.getTitulo()) && Objects.equals(getNome_autor(), livro.getNome_autor()) && Objects.equals(getTexto(), livro.getTexto()) && Objects.equals(getCategoria(), livro.getCategoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), getNome_autor(), getTexto(), getCategoria());
    }
}