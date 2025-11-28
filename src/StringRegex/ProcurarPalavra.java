package StringRegex;

public class ProcurarPalavra {
    public static void main(String[] args) {

        String texto = "O gato caça o rato";

        String palavra = "meu";

        if (texto.contains(palavra)){
            System.out.println("O texto possui a palavra");
        }else {
            System.out.println("O texto não possui a palavra");
        }
    }
}
