package br.com.alura.screenmatch.model;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvalicao;
    private int totalAvaliacoes;
    private int duracaoEmMin;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do br.com.alura.screenmatch.model.Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia (double nota){
        somaAvalicao += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvalicao/totalAvaliacoes;
    }



}
