package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculo.Classificavel;

public  class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "filme: " + this.getNome() + " (" + this.getAnoDeLancamento() +")";
    }
}
