package com.gropp.dominio;

import java.time.LocalDate;

/*
 *
 * Essa classe fornece informaçoes relacionadas ao objeto mentoria
 * provendo propriedades e metodos para as demais classes
 * classe herda a classe conteudo com propriedades comuns
 * e a classe pai obriga as classes filhas a implementar o metodo cacularXp
 * @author Fernando Gropp, 2022
 * @see java.time.LocalDate
 */

public class Mentoria extends Conteudo {
    private LocalDate data;

    /*
    * construtor vazio
    */
    public Mentoria() {
    }

    /*
    * getters and setters
    */

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    /*
    * implementando o metodo da classe pai
    * @Override sobrescreve o metodo pai
    * @see com.gropp.dominio.Conteudo
    */

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    /*
    * tratamento do retorno da impressao
    */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
