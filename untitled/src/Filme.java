public class Filme {
    String nome;
    int anoDeLancamento;
    double nota;
    int totalAvalicao;
    int tempoDuracao;

    void exibirInformacoes(){
        System.out.println("nome do filme é: " +nome);
        System.out.println("foi lançado em: " +anoDeLancamento);
    }
    void avalicao(double avaliar){
        nota += avaliar;
        totalAvalicao++;
    }

    double obterMedia(){
        return nota /totalAvalicao;
    }
}
