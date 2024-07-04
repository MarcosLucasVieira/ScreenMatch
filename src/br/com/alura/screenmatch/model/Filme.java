package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.model.calculo.Classificavel;

public  class Filme extends Titulo implements Classificavel {
    private String Diretor;

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

}
