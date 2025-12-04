package POO;

import POO.projeto_filmes.Filme;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.anoLancamento = 2025;
        meuFilme.titulo = "Moana 2";

       meuFilme.exibirFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(7);
       meuFilme.avalia(8.5);

        meuFilme.calcMedia();
        Pessoa p = new Pessoa("Matheus", 22);
        p.dizerOla();

        Calculadora calc = new Calculadora();
        System.out.println("Dobro de 5: " + calc.dobrar(5));

        Musica m = new Musica("Imagine", "John Lennon", 1971);
        m.avaliar(10);
        m.avaliar(8);
        m.exibirFichaTecnica();

        Carro c = new Carro("Civic", 2018, "Preto");
        c.exibirFichaTecnica();
        c.mudarCor("Branco");

        Aluno a = new Aluno("Matheus Jorge", 22);
        a.definirNota(9.5);
        a.exibirInformacoes();

    }
}
