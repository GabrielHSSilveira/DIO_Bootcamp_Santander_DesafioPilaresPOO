package br.com.bootcamp.grade.cursos;

import br.com.bootcamp.grade.Atividade;

public class Curso extends Atividade {
    private String nome;
    private String descricao;
    private int duracaoHoras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public Curso(String titulo, String descricao, int duracaoHoras) {
        super(titulo, descricao);
        this.duracaoHoras = duracaoHoras;
    }

    public void iniciar() {
        System.out.println("Curso " + nome + " iniciado!");
    }

    public void finalizar() {
        System.out.println("Curso " + nome + " finalizado!");
    }
}
