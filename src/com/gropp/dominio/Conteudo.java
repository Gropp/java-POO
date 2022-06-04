package com.gropp.dominio;
/*
*
* classe abstrata, nao pode ser instanciada
* sua funcao é fornecer a classes filhas propriedades e metodos comuns
* somente atraves de heranca que esse objeto podera ser acessado
*
* @author Fernando Gropp, 2022
*
*/

public abstract class Conteudo {
    protected static final double XP_PADRAO = 100;

    private String titulo;
    private String descricao;

    /*
    * referncia ao metodo calcularXp
    * esse metodo será obrigatorio se implementada nos filhos dessa classe
    */
    public abstract double calcularXp();

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
}
