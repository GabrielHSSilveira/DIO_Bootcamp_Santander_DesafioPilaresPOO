package br.com.bootcamp;

import br.com.bootcamp.grade.cursos.Curso;
import br.com.bootcamp.grade.mentorias.Mentoria;
import br.com.bootcamp.participantes.Dev;
import java.util.List;
import java.util.ArrayList;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Dev> devs;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }
}
