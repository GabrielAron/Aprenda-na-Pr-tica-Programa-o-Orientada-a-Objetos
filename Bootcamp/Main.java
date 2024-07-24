package Bootcamp;


public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Aprenda Java do zero ao avançado");
        Curso curso1 = new Curso("Introdução ao Java", 40);
        Mentoria mentoria1 = new Mentoria("Mentoria de Carreira", "João Silva");

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarMentoria(mentoria1);

        Dev dev1 = new Dev("Maria");
        dev1.concluirCurso(curso1);

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Curso: " + curso1.getTitulo());
        System.out.println("Mentoria: " + mentoria1.getTitulo());
        System.out.println("Dev: " + dev1.getNome());
    }
}