package br.com.bootcamp.participantes.ocupacao.estadoatual;


public class StatusNoMomento {
    private boolean ocupado;
    private boolean trabalhando;
    private boolean estudando;
    private String projetoTrabalho;
    private String temaEstudo;

    public StatusNoMomento(boolean ocupado, boolean trabalhando, boolean estudando, String projetoTrabalho, String temaEstudo) {
        this.ocupado = ocupado;
        this.trabalhando = trabalhando;
        this.estudando = estudando;
        this.projetoTrabalho = projetoTrabalho;
        this.temaEstudo = temaEstudo;
    }

    public void exibirStatus() {
        System.out.println(
                ocupado ? "O dev está ocupado." :
                        trabalhando ? "O dev está trabalhando no projeto: " + projetoTrabalho :
                                estudando ? "O dev está estudando o tema: " + temaEstudo :
                                        "O dev não está fazendo nada no momento."
        );
    }


}
