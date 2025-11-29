package StringRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = ler.next();

        String regex ="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        if (senha.matches(regex)){
            System.out.println("Senha valida");
        }else {
            System.out.println("Senha invalida");
        }
    }
}
