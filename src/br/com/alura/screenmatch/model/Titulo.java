package br.com.alura.screenmatch.model;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;

    @SerializedName("Year")
    private int anoDeLancamento;

    private boolean incluidoNoPlano;

    private double somaAvalicao;

    private int totalAvaliacoes;

    private int duracaoEmMin;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMin = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
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


    @Override
    public int compareTo(Titulo outrotitulo) {
        return this.getNome().compareTo(outrotitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" + "nome= '" + nome + '\'' + ", " +
                "anoDeLancamento= " + anoDeLancamento + "," +
                "Duração em minutos: " + duracaoEmMin + '}';
    }
}
