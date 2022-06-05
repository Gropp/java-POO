package com.gropp.dominio;

/**
* Essa classe fornece informaçoes relacionadas ao objeto curso
* provendo propriedades e metodos para as demais classes
* Curso herda propriedades e metodos da classe Conteudo
* @author Fernando Gropp, 2022
*/

public class Curso extends Conteudo{
    //é uma boa pratica usar modificadores de acesso nas classes e propriedades
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /*
     * implementando o metodo da classe pai
     * @Override sobrescreve o metodo pai
     * @see com.gropp.dominio.Conteudo
     */

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    /*
    * tratamento da informacao para impressao dos retornos
    * toString
    */

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}