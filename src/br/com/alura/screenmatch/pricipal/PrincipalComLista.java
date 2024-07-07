package br.com.alura.screenmatch.pricipal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        Serie lost = new Serie("Lost", 2000);
        Filme outrofilme = new Filme("Avatar", 2023);
        Filme filmeMarcos = new Filme("Dogville", 2003);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeMarcos);
        filmeMarcos.avalia(10);
        listaDeAssistidos.add(meuFilme);
        meuFilme.avalia(9);
        listaDeAssistidos.add(outrofilme);
        outrofilme.avalia(6);
        listaDeAssistidos.add(lost);
        for (Titulo item: listaDeAssistidos){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


    }
}
