package br.com.alura.screenmatch.pricipal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.*;

public class PrincipalComLista  {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        Serie lost = new Serie("Lost", 2000);
        Filme outrofilme = new Filme("Avatar", 2023);
        Filme filmeMarcos = new Filme("Dogville", 2003);

        List<Titulo> listaDeAssistidos = new LinkedList<>();
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

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Marcos");
        buscaPorArtista.add("Erick");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaDeAssistidos);
    }

}
