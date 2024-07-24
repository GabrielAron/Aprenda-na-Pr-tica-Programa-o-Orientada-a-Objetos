package Bootcamp;

class Dev {
    private String nome;
    private List<Curso> cursosConcluidos = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void concluirCurso(Curso curso) {
        cursosConcluidos.add(curso);
    }

    // Getters e Setters
}