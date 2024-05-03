package br.com.bootcamp.grade.mentorias;

import br.com.bootcamp.grade.Atividade;

public class Mentoria extends Atividade {
    private String titulo;
    private String descricao;
    private String horario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Mentoria(String titulo, String descricao, String horario) {
        super(titulo, descricao);
        this.horario = horario;
    }
}
