package lab7.LinkedSet;

import lab6.ЛегковыеАвтомобили;

public class Node {
    private Node next;
    private Node prexious;
    private ЛегковыеАвтомобили data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrexious() {
        return prexious;
    }

    public void setPrexious(Node prexious) {
        this.prexious = prexious;
    }
}
