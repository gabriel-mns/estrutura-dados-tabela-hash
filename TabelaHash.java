public class TabelaHash{

    private int tamanho;

    private int qtdeColisoes = 0;

    //private LinkedList[] chaves;
    private LinkedList[] valores;

    public TabelaHash(){ }

    public TabelaHash(int tamanho){

        this.tamanho = tamanho;
        //this.chaves  = new LinkedList[tamanho];
        this.valores = new LinkedList[tamanho];

    }

    public void insertResto(int novoValor){

        int hashNovoValor = hashResto(novoValor);
        LinkedList listaValores = valores[hashNovoValor];

        if(listaValores != null){

            qtdeColisoes++;
            listaValores.inserir(novoValor);
            return;

        } else {

            LinkedList novaLista = new LinkedList();
            novaLista.inserir(novoValor);

            valores[hashNovoValor] = novaLista;

        }


    }

    public boolean hasResto(int valorProcurado){

       int hashValor = hashResto(valorProcurado);

       LinkedList listaValores = getValuesAtHash(hashValor);

       if(listaValores == null) return false;

        return listaValores.has(valorProcurado);

    }

    public void insertSoma(int novoValor){

        int hashNovoValor = hashSoma(novoValor);
        LinkedList listaValores = valores[hashNovoValor];

        if(listaValores != null){

            listaValores.inserir(novoValor);
            return;

        } else {

            LinkedList novaLista = new LinkedList();
            novaLista.inserir(novoValor);

            valores[hashNovoValor] = novaLista;

        }


    }

    public boolean hasSoma(int valorProcurado){

       int hashValor = hashSoma(valorProcurado);

       LinkedList listaValores = getValuesAtHash(hashValor);

        return listaValores.has(valorProcurado);

    }

    public void insertMultiplicacao(int novoValor){

        int hashNovoValor = hashMultiplicacao(novoValor);
        LinkedList listaValores = valores[hashNovoValor];

        if(listaValores != null){

            listaValores.inserir(novoValor);
            return;

        } else {

            LinkedList novaLista = new LinkedList();
            novaLista.inserir(novoValor);

            valores[hashNovoValor] = novaLista;

        }


    }

    public boolean hasMultiplicacao(int valorProcurado){

       int hashValor = hashMultiplicacao(valorProcurado);

       LinkedList listaValores = getValuesAtHash(hashValor);

        return listaValores.has(valorProcurado);

    }

    public LinkedList getValuesAtHash(int hash){

        return valores[hash];

    }

    public int hashResto(int novoValor){

        return novoValor % (tamanho);

    }

    public int hashSoma(int novoValor){

        return somarAlgarismos(novoValor) % (tamanho);

    }

    public int hashMultiplicacao(int novoValor){

        return multiplicarAlgarimos(novoValor) % (tamanho);

    }

    private int somarAlgarismos(int valor){

        int soma = 0;

        while (valor > 0) {

            int digito = valor % 10;

            soma += digito;

            valor /= 10;

        }

        return soma;    

    }

    private int multiplicarAlgarimos(int valor){

        int soma = 1;

        while (valor > 0) {

            int digito = valor % 10;

            soma *= digito;

            valor /= 10;

        }

        return soma;    

    }

    @Override
    public String toString() {
        
        String apresentacao = """
                Linkedlist
                    - tamanho : 20.000
                    - valores:
                """;

        for (int i = 0; i < tamanho; i++) {
            
            LinkedList linkedList = valores[i];

            if(linkedList != null){
                
                apresentacao += "{" + i + "} " + linkedList + "\n";

            }

        }

        return apresentacao;
    }

    public int getQtdeColisoes() {
        return qtdeColisoes;
    }

}