
public class LinkedList {
    
    public Node first;

    //Construtores
    public LinkedList(){

    }

    public LinkedList(Node first) {
        this.first = first;
    }


    //Métodos da LINKEDLIST
    public Node inserir(int dado){

        Node novoNode = new Node(dado);

        if(first == null) {

            first = novoNode;

            return novoNode;

        }

        Node noAnterior = acharAnteriorInsercao(dado);
        
        //Coloca os apontadores do novo node
        novoNode.setNext(noAnterior.getNext());
        novoNode.setPrev(noAnterior);
        
        //Atualiza os apontadores do node anterior
        noAnterior.setNext(novoNode);
        
        //Atualiza os apontadores do próximo node
        noAnterior.getNext().setPrev(novoNode);

        return novoNode;
        
    }

    //Métodos auxiliares
    /*
     * Acha o node anterior de onde o novo nó será inserido na lista.
     * Exemplo:
     * 
     * list =  [ 1 2 3 4 6 7 ]
     * 
     * acharAnteriorInsercao(5) => vai retornar '4'
     * 
     */
    private Node acharAnteriorInsercao(int dadoInsercao){

        //Pega o primeiro nó
        Node nodeAtual = first;

        if (nodeAtual == null) return null; 

        //Percorre cada um dos nós enquanto tiver próximo
        while (nodeAtual.hasNext()) {
            
            //Pega o próximo nó
            Node proximoNo = nodeAtual.getNext();

            //Se achar o próximo nó para de percorrer (nó atual vai ser retornado)
            if(proximoNo.getDado() > dadoInsercao) break;

            //ELSE passa para o próximo nó
            nodeAtual = proximoNo;

        }

        return nodeAtual;

    }

    public boolean has(int valorProcurado) {

        Node nodeAtual = first;

        boolean achouOValor;

        while (nodeAtual != null) {
            
            achouOValor = nodeAtual.getDado() == valorProcurado;

            if(achouOValor) return true;
            
            nodeAtual = nodeAtual.getNext();

        }

        return false;

    }


    public int sizeOf(){

        Node nodeAtual = first;
        
        int size = 0;

        while (nodeAtual != null) {
            
            size++;

            nodeAtual = nodeAtual.getNext();

        }

        return size;

    }

    //Getters e Setters
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "LinkedList [" + first + "]";
    }

    

}
