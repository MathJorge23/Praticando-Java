package POO.projeto_filmes;

public class Serie extends  Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemp;
    private int minutosPorEpis;

    public int getEpisodiosPorTemp() {
        return episodiosPorTemp;
    }

    public void setEpisodiosPorTemp(int episodiosPorTemp) {
        this.episodiosPorTemp = episodiosPorTemp;
    }

    public int getMinutosPorEpis() {
        return minutosPorEpis;
    }

    public void setMinutosPorEpis(int minutosPorEpis) {
        this.minutosPorEpis = minutosPorEpis;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemp * minutosPorEpis ;
    }
}
