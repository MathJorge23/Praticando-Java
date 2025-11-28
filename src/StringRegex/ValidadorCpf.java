package StringRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCpf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o cpf:");

        String cpf = ler.next();
        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()){
            System.out.println("CPF valido");
        }else{
            System.out.println("CPF invalido");
        }
    }
}
