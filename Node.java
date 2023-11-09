public class Node {
    
    private int dado;
    private Node next;
    private Node prev;

    //Construtores
    public Node(){

    }

    public Node(int dado, Node next, Node prev) {

        this.dado = dado;
        this.next = next;
        this.prev = prev;

    }

    public Node(int dado, Node prev) {

        this.dado = dado;
        this.prev = prev;

    }

    public Node(int dado){

        this.dado = dado;

    }


    //Getters e Setters
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


    //Métodos auxiliares
    public boolean hasNext(){

        return next != null;

    }

    @Override
    public String toString() {
        
        return dado + "<=>" + next; 

    }

    
}
