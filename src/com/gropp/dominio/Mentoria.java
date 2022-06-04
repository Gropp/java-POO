package com.gropp.dominio;

import java.time.LocalDate;

/*
 *
 * Essa classe fornece informaçoes relacionadas ao objeto mentoria
 * provendo propriedades e metodos para as demais classes
 * @author Fernando Gropp, 2022
 * @see java.time.LocalDate
 */

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    /*
    * construtor vazio
    */
    public Mentoria() {
    }

    /*
    * getters and setters
    */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    /*
    * tratamento do retorno da impressao
    */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
