package br.com.bootcamp.grade;

public abstract class Atividade {
    private String titulo;
    private String descricao;

    public Atividade(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void iniciar() {
        System.out.println("Iniciando " + titulo);
    }

    public void finalizar() {
        System.out.println("Finalizando " + titulo);
    }
}
