package POO;

public class Musica {

    private String titulo;
    private String artista;
    private int anoLancamento;
    private double somaAvaliacoes;
    private int numAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Avaliação média: " + calcularMedia());
        System.out.println("Total de avaliações: " + numAvaliacoes);
    }

    public void avaliar(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Use de 0 a 10.");
            return;
        }

        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    public double calcularMedia() {
        if (numAvaliacoes == 0) return 0;
        return somaAvaliacoes / numAvaliacoes;
    }
}

