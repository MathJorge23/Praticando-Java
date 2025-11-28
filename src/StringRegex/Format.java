package StringRegex;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor a ser formatado:");
        double valor = ler.nextDouble();

        String valorFormatado = String.format("R$ %.2f",valor);
        System.out.println("Valor formatado: "+ valorFormatado);
    }
}
