package com.bridgelabz.hashtables;

public interface INode<K extends Comparable> {
    K getKey();
    void setKey();

    INode getNext();
    void setNext(INode<K> tempNode);
}