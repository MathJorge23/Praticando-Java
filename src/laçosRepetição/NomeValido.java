package laçosRepetição;

import java.util.Scanner;

public class NomeValido {public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome;
    do {
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        if (nome.length() < 3){
            System.out.println("Nome inv´lido. Digite novamente");
        }
    }while (nome.length() < 3);

    System.out.println("Nome: "+ nome +" cadastrado com sucesso.");
}
}
