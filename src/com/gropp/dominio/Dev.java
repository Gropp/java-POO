package com.gropp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/*
 *
 * classe DEV
 * sua funcao é fornecer dadps sobre os Devs
 * @author Fernando Gropp, 2022
 *
 */

public class Dev {
    private String nome;
    /*
    * variaveis do tipo conteudo - um conjunto (SET)
    * instanciando um metodo para organizar em ordem esses cursos
    * @see LinkedHashSet
    */
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /*
    * metodos do objeto DEV
    *
    */
    public void inscreverBootcamp(Bootcamp bootcamp){}
    public void progredir(){}
    public void calcularXp(){}

    /*
    * criacao de getters e setter
    * para acessar as propriedades do objeto
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /*
    * criacao de equals e hashcode pois usamos HASH para fazer
    * a ordenacao dos conjuntos/colecoes
    * equals
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    /*
    * hashcode
    */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
