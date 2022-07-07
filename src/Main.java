import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Aline: " + devAline.getConteudosInscritos());
        devAline.progredir();
        System.out.println("Conteudos Inscritos de Aline: " + devAline.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Aline: " + devAline.getConteudosConcluidos());
        System.out.println("XP: " + devAline.calcularTotalXp());

        System.out.println("----------------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Gustavo: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        System.out.println("Conteudos Inscritos de Gustavo: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());

    }
}
