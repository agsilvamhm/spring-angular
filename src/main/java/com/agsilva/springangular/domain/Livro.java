package com.agsilva.springangular.domain;

import java.util.Objects;

public class Livro {

    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;
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

    public String getTitulo() {
        return titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public Categoria getCategoria() {
        return categoria;
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
