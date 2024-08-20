import ga.barru.bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        Modulo modulo1 = new Modulo();
        modulo1.setCargaHoraria(2);
        modulo1.setTitulo("Fundamentos em programacao");
        modulo1.setDescricao("Base para o desenvolvimento de programação");

        Modulo modulo2 = new Modulo();
        modulo2.setCargaHoraria(1);
        modulo2.setTitulo("Programação Orientada a Objetos");
        modulo2.setDescricao("Conceitos de POO");

        Modulo modulo3 = new Modulo();
        modulo3.setCargaHoraria(5);
        modulo3.setTitulo("Programação Java com Spring Boot");
        modulo3.setDescricao("Desenvolvimento de aplicativos web");

        Modulo modulo4 = new Modulo();
        modulo4.setCargaHoraria(1);
        modulo4.setTitulo("Ecmascript 6 + Dominando node.js");
        modulo4.setDescricao("Conceitos e implementação do Javascript e uso de node.js em projetos restAPI");

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.getModulos().add(modulo1);
        curso1.getModulos().add(modulo2);
        curso1.getModulos().add(modulo3);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(7);
        curso2.getModulos().add(modulo1);
        curso1.getModulos().add(modulo2);
        curso1.getModulos().add(modulo4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        mentoria.getModulos().add(modulo1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);
        bootcamp.getCursos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(builder.append("Conteúdos Inscritos ")
                                  .append(devCamila.getNome())
                                  .append(":")
                                  .append(devCamila.getConteudosInscritos()));
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        builder.setLength(0);
        System.out.println(builder.append("Conteúdos Inscritos ")
                                  .append(devCamila.getNome())
                                  .append(":")
                                  .append(devCamila.getConteudosInscritos()));
        builder.setLength(0);
        System.out.println(builder.append("Conteúdos Concluídos ")
                                  .append(devCamila.getNome())
                                  .append(":")
                                  .append(devCamila.getConteudosConcluidos()));
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        builder.setLength(0);
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(builder.append("Conteúdos Inscritos ")
                                  .append(devJoao.getNome())
                                  .append(":")
                                  .append( devJoao.getConteudosInscritos()));
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devCamila.progredir();
        System.out.println("-");
        builder.setLength(0);
        System.out.println(builder.append("Conteúdos Inscritos ")
                                  .append(devJoao.getNome())
                                  .append(":")
                                  .append(devJoao.getConteudosInscritos()));
        builder.setLength(0);
        System.out.println(builder.append("Conteúdos Concluídos ")
                                  .append(devJoao.getNome())
                                  .append(":")
                                  .append(devJoao.getConteudosConcluidos()));
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");

        builder.setLength(0);
        Dev barruga = new Dev();
        barruga.setNome("Luiz");
        barruga.inscreverBootcamp(bootcamp);
        System.out.println(builder.append("Conteúdos Inscritos ")
                                  .append(barruga.getNome())
                                  .append(":")
                                  .append(barruga.getConteudosInscritos()));
        barruga.progredir();
        barruga.progredir();
        barruga.progredir();
        barruga.progredir();
        barruga.progredir();
        barruga.progredir();
        System.out.println("-");
        builder.setLength(0);
        System.out.println(builder.append("Conteúdos Inscritos ")
                                  .append(barruga.getNome())
                                  .append(":")
                                  .append(barruga.getConteudosInscritos()));
        builder.setLength(0);
        System.out.println(builder.append("Conteúdos Concluídos ")
                                  .append(barruga.getNome())
                                  .append(":")
                                  .append(barruga.getConteudosConcluidos()));
        System.out.println("XP:" + barruga.calcularTotalXp());
    }

}