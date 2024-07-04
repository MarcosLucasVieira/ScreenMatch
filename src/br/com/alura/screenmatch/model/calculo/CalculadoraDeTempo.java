package br.com.alura.screenmatch.model.calculo;
import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

   public void inclui (Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMin();
   }

}
