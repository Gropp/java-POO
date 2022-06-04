package com.gropp;

import com.gropp.dominio.Curso;
import com.gropp.dominio.Mentoria;
import java.time.LocalDate;

/*
*
* Programa para modelar o ambiente do BootCamp
* @author Fernando Gropp, 2022
*
*/

public class Main {

    public static void main(String[] args) {
        //instancia aqui a classe curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Introdução ao Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java OO");
        curso2.setDescricao("Introdução a Orientação a Objetos em Java");
        curso2.setCargaHoraria(16);

        /*
        * exemplo de polimorfismo
        * como Conteudo é pai de curso eu posso instanciar um curso
        * instanciando a classe Conteudo
        * Conteudo curso3 = new Curso(); - Deu erro em SetCargaHoraria
        */
        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de Exceptions Java");
        curso3.setDescricao("Introdução ao Tratamento de Exceções em Java");
        curso3.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Curso Java");
        mentoria1.setDescricao("Ajuda e reforço com conceitos e codigos");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Curso Java OO");
        mentoria2.setDescricao("Ajuda e reforço comm Orientacao a objetos");
        mentoria2.setData(LocalDate.now());

        /*
         * exemplo de polimorfismo
         * como Conteudo é pai de mentoria eu posso instanciar uma mentoria
         * instanciando a classe Conteudo
         * Conteudo mentoria3 = new Mentoria();
         * Deu erro na propriedade SetData
         */
        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria Tratamento de Exceções");
        mentoria3.setDescricao("Ajuda e reforço com rotirnas de tratamento de exceções");
        mentoria3.setData(LocalDate.now());

        /*
        *
        * impressao dos objetos
        *
        */

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(mentoria3);
    }
}
