package br.com.alura.screenmatch.model;

public class Serie extends Filme {
    private int temporadas;
    private boolean ativa;
    private int epsodioPorTemporada;
    private int minutosPorEpsodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodioPorTemporada() {
        return epsodioPorTemporada;
    }

    public void setEpsodioPorTemporada(int epsodioPorTemporada) {
        this.epsodioPorTemporada = epsodioPorTemporada;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMin() {
        return temporadas * epsodioPorTemporada * minutosPorEpsodio;
    }
}
