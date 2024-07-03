import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.calculo.CalculadoraDeTempo;

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

        System.out.println(calculadoraDeTempo.getTempoTotal());


    }
}
