package StringRegex;

public class LastIndexOf {
    public static void main(String[] args) {
        String arquivo = "pessoa.wrd";

        int posicao = arquivo.lastIndexOf(".");

        if (posicao != -1){
            String nome = arquivo.substring(0,posicao);
            System.out.println(nome);
        } else {
            System.out.println("O arquivo nao possui extensão");
        }
    }
}
