package POO;

public class Filme {
    String titulo;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    int duracaoMin;

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: "+titulo);
        System.out.println("Ano de Lançamento: "+anoLancamento);
        System.out.println("Avaliação: "+somaDasAvaliacoes);
        System.out.println("Total de avaliações: "+totalAvaliacao);
        System.out.println("Duração: "+duracaoMin+"min");
    };

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao ++;
    }

    double calcMedia(){
      double media =  somaDasAvaliacoes /totalAvaliacao;
        return media;
    };

    int getTotalAvaliacao(){
        return totalAvaliacao;
    }
}
