package POO;

public class Aluno {

    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void definirNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            return;
        }
        this.nota = nota;
    }

    public boolean aprovado() {
        return nota >= 7;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Aprovado: " + (aprovado() ? "Sim" : "Não"));
    }
}

