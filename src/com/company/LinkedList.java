package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Троицкий Дмитрий on 04.04.2017.
 */
public class LinkedList<L> implements List<L> {

    private Node<L> prev;
    private Node<L> next;
    private Node<L> first;

    private int size = 0;

    public LinkedList() {
        this.first = new Node<>();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i <size(); i++){
            if (get(i).equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<L> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        for (int i = 0; i < size(); i++) {
            array[i]= getByindex(i).getData();
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(L l) {
        Node<L> node = new Node<>(l);
        if (first == null) {
            first = node;
        }else {
            prev = first;
        }
        if( size() == 1 ) {
            first.setNext(node);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<L> node = first;
        for (int i=0; i<size(); i++) {
            node.getPrev().setNext(node.getNext());
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends L> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends L> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private Node<L> getByindex(int index) {
        Node<L> node = null;
        if (!isEmpty()&&(index >= 0 && index < size())) {
            node = first;
            for (int i = 1; i<=index; i++) {
                node = node.getNext();
            }
        }
        return node;
    }
    @Override
    public L get(int index) {
        L element;
        if (index >=0 && index < size()) {
            element = getByindex(index).getData();
        }else throw new IndexOutOfBoundsException();
        return element;
    }

    @Override
    public L set(int index, L element) {
        return null;
    }

    @Override
    public void add(int index, L element) {

    }

    @Override
    public L remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<L> listIterator() {
        return null;
    }

    @Override
    public ListIterator<L> listIterator(int index) {
        return null;
    }

    @Override
    public List<L> subList(int fromIndex, int toIndex) {
        return null;
    }
}
