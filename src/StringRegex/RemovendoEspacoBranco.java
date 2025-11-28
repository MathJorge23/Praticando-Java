package StringRegex;


public class RemovendoEspacoBranco {
    public static void main(String[] args) {
        String texto = "Olá estou testando o programa";

        String semEspaco = texto.replace(" ","");

        System.out.println(semEspaco);


    }
}
