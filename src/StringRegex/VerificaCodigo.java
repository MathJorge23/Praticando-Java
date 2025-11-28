package StringRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaCodigo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o código:");
        String codigo = ler.next();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);

        if (matcher.matches()){
            System.out.println("O código está correto.");
        }
        else {
            System.out.println("O código está invalido");
        }
    }
}
