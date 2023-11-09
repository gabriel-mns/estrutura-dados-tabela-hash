import java.util.Random;

public class RelatorioHash {

    private int tamanhoTabela;

    private int[] qtdesElementosTeste;

    private TabelaHash th;

    private static String caminhoArquivo = "C:\\Users\\marti\\OneDrive\\Documentos\\Estudos\\Faculdade\\4º Período\\Estrutura de dados\\RA3\\hash\\relatorio_hash.csv";

    private static CSVWriter cw = new CSVWriter(caminhoArquivo);

    private static Random random = new Random(1234);

    public RelatorioHash(int tamanhoTabela, int[] qtdeElementosTeste) {

        this.tamanhoTabela = tamanhoTabela;

        this.qtdesElementosTeste = qtdeElementosTeste;
        
        th = new TabelaHash(tamanhoTabela);

    }

    public void testarInsercaoResto(){

        long tempoInicioNano; 
        long tempoFimNano   ; 
        long tempoInicioMili; 
        long tempoFimMili   ; 

        for (int quantidade : qtdesElementosTeste) {

            System.out.printf("\n========= TESTE - tam: %s - elementos: %s =========\n", tamanhoTabela, quantidade);

            //Crônometros de inicio
            tempoInicioMili = System.currentTimeMillis();
            tempoInicioNano = System.nanoTime();
            
            for (int i = 0; i < quantidade; i++) {

                th.insertResto( random.nextInt(Integer.MAX_VALUE));

            }
            
            //Crônometros de fim
            tempoFimMili = System.currentTimeMillis();
            tempoFimNano = System.nanoTime();

            cw.inserirNovoRegistro("Inserção Resto", tamanhoTabela, quantidade, tempoFimMili - tempoInicioMili, tempoFimNano - tempoInicioNano, th.getQtdeColisoes());
            
            System.out.println("");


        }


    }

    public void testarBuscaResto(){

        //Reinicia o random para voltar a gerar os números do início
        random = new Random(1234);

        long tempoInicioNano; 
        long tempoFimNano   ; 
        long tempoInicioMili; 
        long tempoFimMili   ; 

        for (int quantidade : qtdesElementosTeste) {
            
            //Crônometros de inicio
            tempoInicioMili = System.currentTimeMillis();
            tempoInicioNano = System.nanoTime();
            
            for (int i = 0; i < quantidade; i++) {
                
                th.hasResto(random.nextInt(Integer.MAX_VALUE));

            }
            
            //Crônometros de fim
            tempoFimMili = System.currentTimeMillis();
            tempoFimNano = System.nanoTime();

            cw.inserirNovoRegistro("Buscar Resto", tamanhoTabela, quantidade, tempoFimMili - tempoInicioMili, tempoFimNano - tempoInicioNano, th.getQtdeColisoes());

            System.out.println("");

        }
    }
    
    public void testarInsercaoSoma(){

        long tempoInicioNano; 
        long tempoFimNano   ; 
        long tempoInicioMili; 
        long tempoFimMili   ; 

        for (int quantidade : qtdesElementosTeste) {
            
            //Crônometros de inicio
            tempoInicioMili = System.currentTimeMillis();
            tempoInicioNano = System.nanoTime();
            
            for (int i = 0; i < quantidade; i++) {
                
                th.insertSoma(random.nextInt(Integer.MAX_VALUE));

            }
            
            //Crônometros de fim
            tempoFimMili = System.currentTimeMillis();
            tempoFimNano = System.nanoTime();

            System.out.println("");

            cw.inserirNovoRegistro("Inserção Soma", tamanhoTabela, quantidade, tempoFimMili - tempoInicioMili, tempoFimNano - tempoInicioNano, th.getQtdeColisoes());

        }


    }

    public void testarBuscaSoma(){

        //Reinicia o random para voltar a gerar os números do início
        random = new Random(1234);

        long tempoInicioNano; 
        long tempoFimNano   ; 
        long tempoInicioMili; 
        long tempoFimMili   ; 

        for (int quantidade : qtdesElementosTeste) {
            
            //Crônometros de inicio
            tempoInicioMili = System.currentTimeMillis();
            tempoInicioNano = System.nanoTime();
            
            for (int i = 0; i < quantidade; i++) {
                
                th.hasSoma(random.nextInt(Integer.MAX_VALUE));

            }
            
            //Crônometros de fim
            tempoFimMili = System.currentTimeMillis();
            tempoFimNano = System.nanoTime();

            System.out.println("");

            cw.inserirNovoRegistro("Busca Soma", tamanhoTabela, quantidade, tempoFimMili - tempoInicioMili, tempoFimNano - tempoInicioNano, th.getQtdeColisoes());

        }


    }
    
    public void testarInsercaoMultiplicacao(){

        long tempoInicioNano; 
        long tempoFimNano   ; 
        long tempoInicioMili; 
        long tempoFimMili   ; 

        for (int quantidade : qtdesElementosTeste) {
            
            //Crônometros de inicio
            tempoInicioMili = System.currentTimeMillis();
            tempoInicioNano = System.nanoTime();
            
            for (int i = 0; i < quantidade; i++) {
                
                th.insertMultiplicacao(random.nextInt(Integer.MAX_VALUE));

            }
            
            //Crônometros de fim
            tempoFimMili = System.currentTimeMillis();
            tempoFimNano = System.nanoTime();

            System.out.println("");

            cw.inserirNovoRegistro("Inserção Multiplicacao", tamanhoTabela, quantidade, tempoFimMili - tempoInicioMili, tempoFimNano - tempoInicioNano, th.getQtdeColisoes());

        }


    }

    public void testarBuscaMultiplicacao(){

        //Reinicia o random para voltar a gerar os números do início
        random = new Random(1234);

        long tempoInicioNano; 
        long tempoFimNano   ; 
        long tempoInicioMili; 
        long tempoFimMili   ; 

        for (int quantidade : qtdesElementosTeste) {
            
            //Crônometros de inicio
            tempoInicioMili = System.currentTimeMillis();
            tempoInicioNano = System.nanoTime();
            
            for (int i = 0; i < quantidade; i++) {
                
                th.hasMultiplicacao(random.nextInt(Integer.MAX_VALUE));

            }
            
            //Crônometros de fim
            tempoFimMili = System.currentTimeMillis();
            tempoFimNano = System.nanoTime();

            System.out.println("");

            cw.inserirNovoRegistro("Busca Multiplicacao", tamanhoTabela, quantidade, tempoFimMili - tempoInicioMili, tempoFimNano - tempoInicioNano, th.getQtdeColisoes());

        }


    }

}
