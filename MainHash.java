import java.util.Arrays;

public class MainHash { 
    
    public static void main(String[] args) {

        // int[] tamanhos = {50, 500, 1000, 5000, 10000};
        int[] tamanhos = {10, 10, 10, 100,100,100,1000,1000,1000, 10000, 10000, 10000, 100000, 100000, 100000};
        int[] tamanhoConjunto = {20_000, 100_000};
        

        for (int tamanho : tamanhos) {
    
            
            RelatorioHash relatorioResto         = new RelatorioHash(tamanho, tamanhoConjunto);
            RelatorioHash relatorioSoma          = new RelatorioHash(tamanho, tamanhoConjunto);
            RelatorioHash relatorioMultiplicacao = new RelatorioHash(tamanho, tamanhoConjunto);
    
            relatorioResto.testarInsercaoResto();
            relatorioResto.testarBuscaResto();

            relatorioSoma.testarInsercaoSoma();
            relatorioSoma.testarBuscaSoma();

            relatorioMultiplicacao.testarInsercaoMultiplicacao();
            relatorioMultiplicacao.testarBuscaMultiplicacao();

        }

    }

}
