import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.model.calculo.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome(" Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMin(180);
        System.out.println("Duração dp filme" + meuFilme.getDuracaoEmMin());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodioPorTemporada(10);
        lost.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMin());


        //System.out.println(meuFilme.somaAvalicao);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme outrofilme = new Filme();
        outrofilme.setNome("Avatar");
        outrofilme.setAnoDeLancamento(2023);
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

        Filme filmeMarcos = new Filme();
        filmeMarcos.setNome("Dogville");
        filmeMarcos.setDuracaoEmMin(200);
        filmeMarcos.setAnoDeLancamento(2003);
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
