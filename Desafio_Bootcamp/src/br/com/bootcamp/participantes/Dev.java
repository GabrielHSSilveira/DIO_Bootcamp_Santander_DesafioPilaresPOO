package br.com.bootcamp.participantes;

import br.com.bootcamp.participantes.ocupacao.estadoatual.StatusNoMomento;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private int idade;
    private String nivel;
    private List<String> tarefas;
    private StatusNoMomento estado;

    public Dev(String nome, int idade, String nivel) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = nivel;
        this.tarefas = new ArrayList<>();
        this.estado = new StatusNoMomento(false,
                false,
                false,
                "O dev não está trabalhando em nada no momento",
                "O dev não está estudando nada no momento.");
        // Definimos o estado inicial do dev como não ocupado, sem estar trabalhando ou estudando em nenhum projeto.
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println(nome + " adicionou a tarefa: " + tarefa);
    }

    public void listarTarefas() {
        System.out.println("Lista de tarefas de " + nome + ":");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }
    }


    public void mudarEstado(StatusNoMomento novoEstado) {
        this.estado = novoEstado;
    }


    public String getNome() {
        return nome;
    }

    public List<String> getTarefas() {
        return tarefas;
    }

    public void setEstado(StatusNoMomento novoEstado) {
        this.estado = novoEstado;
    }
}

