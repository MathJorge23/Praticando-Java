package StringRegex;

public class Substituir {
    public static void main(String[] args) {
        String texto = "O gato caça o rato";

        String texto1 = texto.replace("gato","cachorro");
        String texto2 = texto1.replace("rato","gato");

        System.out.println(texto2);
    }
}
