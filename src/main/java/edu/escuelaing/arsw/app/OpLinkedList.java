package edu.escuelaing.arsw.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OpLinkedList<T> implements List {

    private Node head;
    private Node tail;
    private int len = 0;

    /**
     * Constructor de la clase OpLinkedList.
     */
    public OpLinkedList() {
    }

    /**
     * Retorna la longitud de la lista enlazada.
     */
    @Override
    public int size() {
        return len;
    }

    /**
     * Adiciona un nodo a la lista enlazada.
     */
    @Override
    public boolean add(Object e) {
        len += 1;
        Node<T> node = new Node(e, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        return true;
    }

    /**
     * Permite recorrer la lista enlazada.
     */
    @Override
    public Iterator iterator() {
        Iterator<Object> iterator = new Iterator<Object>() {
            private Node node;

            @Override
            public Object next() {
                if (node == null) {
                    node = head;
                } else {
                    node = node.getNext();
                }
                return node.getValue();
            }

            @Override
            public boolean hasNext() {
                if (node != null) {
                    return node.getNext() != null;
                } else {
                    return true;
                }
            }

        };
        return iterator;
    }

    /**
     * Verifica si la lista enlazada se encuentra vacia.
     */
    @Override
    public boolean isEmpty() {
        return head.getValue() == null;
    }

    @Override
    public boolean contains(Object o) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public Object[] toArray() {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public boolean remove(Object o) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        // Funcionalidad en desarrollo
        return false;
    }

    @Override
    public void clear() {
        // Funcionalidad en desarrollo
    }

    @Override
    public Object get(int index) {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public void add(int index, Object element) {
        // Funcionalidad en desarrollo
    }

    @Override
    public Object remove(int index) {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public int indexOf(Object o) {
        // Funcionalidad en desarrollo
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // Funcionalidad en desarrollo
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // Funcionalidad en desarrollo
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // Funcionalidad en desarrollo
        return null;
    }

}
