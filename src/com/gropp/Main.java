package com.gropp;

import com.gropp.dominio.Bootcamp;
import com.gropp.dominio.Curso;
import com.gropp.dominio.Dev;
import com.gropp.dominio.Mentoria;
import java.time.LocalDate;

/**
* Programa para modelar o ambiente do BootCamp
* @author Fernando Gropp, 2022
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
        * Criamos o bootcamp
        * adicionamos os cursos
        * adicionomas as mentorias
        */
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Programação Java Orientado a Objeto");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(curso3);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(mentoria2);
        bootcampJava.getConteudos().add(mentoria3);

        /*
        *
        * Vamos incluir os devs
        * passando somente os nomes, pois os cursos e mentorias ja estao inclusos no bootcamp
        * quando os devs se inscreverem nos bootcamps ja receberam eles
        *
        */

        Dev dev1 = new Dev();
        dev1.setNome("Fernando");
        //inscricao do dev1 no bootcamp Java
        dev1.inscreverBootcamp(bootcampJava);
        //progressao no bootcamp
        //retira o primeiro objeto do conjunto conteudos inscritos
        //coloca o objeto no conjunto de conteudos concluidos
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        //inscricao do dev2 no bootcamp Java
        dev2.inscreverBootcamp(bootcampJava);
        //progressao no bootcamp
        //retira o primeiro objeto do conjunto conteudo inscritos
        //coloca o objeto no conjunto de conteudos concluidos
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        /*
        *
        * impressao dos objetos
        *
        */

        System.out.println("Conteudos Inscritos:\n"+dev1.getNome()+": "+dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:\n"+dev1.getNome()+": "+dev1.getConteudosConcluidos());
        System.out.println("XP's conquistados:\n"+dev1.getNome()+": "+dev1.calcularTotalXp());
        System.out.println("--------------------------------------------------------");
        System.out.println("Conteudos Inscritos:\n"+dev2.getNome()+": "+dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:\n"+dev2.getNome()+": "+dev2.getConteudosConcluidos());
        System.out.println("XP's conquistados:\n"+dev2.getNome()+": "+dev2.calcularTotalXp());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(mentoria3);*/
    }
}
