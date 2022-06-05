package com.gropp.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * classe DEV
 * sua funcao é fornecer dadps sobre os Devs
 * @author Fernando Gropp, 2022
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
    public void inscreverBootcamp(Bootcamp bootcamp){
        // coloca no Set(conjunto) e addiciona todo o conteudo do bootcamp no conjunto
        // coloca o dev no conjunto de inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        // no conjunto de inscritos, irao ser colocados em ordem os elementos
        // por isso o stream e o findfirst
        // como esses metodos podem retornar nulls a clausula
        // Optional é exigida pelo java
        // esse metodo tira o conteudo do conjunto dos inscritos e passa para
        // o conteudo dos concluidos
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não esta matriculado em nenhum conteudo!");
        }
    }

    // calcula o incremento de XP do Dev durante o Bootcamp
    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream() //navega no conjunto
                .mapToDouble(Conteudo::calcularXp) //mapeia todas as variaveis calculaxp
                .sum(); //soma
    }

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
