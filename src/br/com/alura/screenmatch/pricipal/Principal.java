package br.com.alura.screenmatch.pricipal;

import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMin(180);
        System.out.println("Duração dp filme" + meuFilme.getDuracaoEmMin());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodioPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMin());


        //System.out.println(meuFilme.somaAvalicao);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme outrofilme = new Filme("Avatar", 2023);
        outrofilme.setDuracaoEmMin(200);


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outrofilme);
        calculadoraDeTempo.getTempoTotal();
        calculadoraDeTempo.inclui(lost);


        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra((meuFilme));

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalAvaliacoes(300);
        filtro.filtra(episodio);

        Filme filmeMarcos = new Filme("Dogville", 2003);
        filmeMarcos.setDuracaoEmMin(200);
        filmeMarcos.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeMarcos);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outrofilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);





    }
}
