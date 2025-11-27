package laçosRepetição;

import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite sua senha:");
            String senha = ler.next();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Senha correta! Acesso concedido.");
                break; // <-- PARA O LOOP
            } else {
                if (tentativas - 1 > 0) {
                    System.out.println("Senha incorreta! Você possui mais " + (tentativas - 1) + " tentativas.");
                } else {
                    System.out.println("Conta bloqueada!");
                }
            }
        }
        ler.close();
    }
}
