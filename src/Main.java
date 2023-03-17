import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Programação Orientada a Objetos");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Conceitos de POO");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Orange Tech");
        bootcamp.setDescricao("Descrição Bootcamp Orange Tech Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        


        Dev devPedro = new Dev();
        devPedro.setNome("Pedro Tavares");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
        

        

    }
    
}
