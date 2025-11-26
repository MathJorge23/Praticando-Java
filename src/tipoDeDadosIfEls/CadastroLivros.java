package tipoDeDadosIfEls;

public class CadastroLivros {
    public static void main(String[] args) {
        String titulo = "O Pequeno Principe";
        String autor = "Antoine de Saint- Exupéry";
        int paginas = 96;
        double preco =39.90;
        char categoria = 'M';

        String categoriaDescricao;

        if (categoria =='F'){
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "não Ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        }else if (categoria == 'H') {
            categoriaDescricao = "Historia";
        }else if (categoria == 'M') {
            categoriaDescricao = "Misterio";
        }else {
            categoriaDescricao = "Invalida";
        }

        System.out.println("A categoria é :" + categoriaDescricao);

    }
}
