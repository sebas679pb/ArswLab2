package edu.escuelaing.arsw.app;

public class Node<T> {

    private T value;
    private Node next;

    /**
     * Constructor de la clase Node.
     * @param value
     * @param next
     */
    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Retorna el valor del nodo.
     * @return valor.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Cambia el valor del nodo.
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Retorna el siguiente nodo.
     * @return nodo.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Modifica el siguiente nodo.
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

}
