package com.gropp.dominio;

/*
*
* Essa classe fornece informaçoes relacionadas ao objeto curso
* provendo propriedades e metodos para as demais classes
* @author Fernando Gropp, 2022
*
*/

public class Curso {
    //é uma boa pratica usar modificadores de acesso nas classes e propriedades
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    /*
    * metodo construtor vazio
    */
    public Curso() {
    }

    /*
    * para acessar os atributos private criamos os getters and setters
    * getters ans setters
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /*
    * tratamento da informacao para impressao dos retornos
    * toString
    */

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}