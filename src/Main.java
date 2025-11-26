public class Main {
    public static void main(String[] args) {

        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Atribuindo valores
        meuCarro.marca = "Honda";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2020;

        // Usando métodos
        meuCarro.ligar();

        // Saída
        System.out.println(meuCarro.marca);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.ano);
    }
}
