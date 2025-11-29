package POO;

import java.time.LocalDate;

public class Carro {

    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + calcularIdade() + " anos");
    }

    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
    }
}

