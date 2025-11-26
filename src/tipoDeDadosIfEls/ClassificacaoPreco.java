package tipoDeDadosIfEls;

public class ClassificacaoPreco {
    public static void main(String[] args) {
        double preco = 150.00;

        String categoria;

        if (preco < 50){
            System.out.println("A categoria do produto: economico");
        } else if (preco >50.01 && preco <200) {
            System.out.println("A categoria do produto: moderado");
        } else if (preco >200.01) {
            System.out.println("A categoria do produto: Premium");
        }


    }
}
