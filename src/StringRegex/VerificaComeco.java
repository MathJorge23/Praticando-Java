package StringRegex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaComeco {
    public static void main(String[] args) {
        String texto = "Olá #mundo! Estou aprendendo #Java e #programação.";

        Pattern pattern =Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>();

        while(matcher.find()){
            hashtags.add(matcher.group());
        }
        if (hashtags.isEmpty()){
            System.out.println("Não encontrado");
        }else{
            System.out.println(hashtags);
        }
    }
}
