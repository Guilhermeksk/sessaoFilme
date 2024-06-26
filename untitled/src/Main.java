import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "divertidamente 2";
        meuFilme.anoDeLancamento =2024;
        meuFilme.exibirInformacoes();
        meuFilme.avalicao(8);
        meuFilme.avalicao(9);
        meuFilme.avalicao(5);
        System.out.println(meuFilme.nota);
        System.out.println(meuFilme.totalAvalicao);
        System.out.println(meuFilme.obterMedia());
    }
}