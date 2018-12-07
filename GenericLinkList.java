/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list_lab;

/**
 *
 * @author spist222
 */
public class GenericLinkList<T> {

    Node<T> head;
    Node<T> last;
    
    public GenericLinkList(){
        Node <T> x = new Node<T> (null, null);
        this.head = x;
        this.last = x;
    }
        
    public void addLast(Node<T> mynode) {
        this.last.next = mynode;
        this.last = mynode;
    }

    public void addLast(T object) {
        Node<T> mynode = new Node<T>(object, null);
        this.last.next = mynode;
        this.last = mynode;
    }

    public void addFirst(Node<T> mynode) {
        this.last.next = mynode;
        mynode.next = head.next;
    }

    public void addFirst(T object) {
        Node<T> mynode = new Node<T>(object, null);
        mynode.next = head.next;
        this.head.next = mynode;
    }

    public void printList() {
        Node<T> curr = head.next;
        while (curr != null) {
            System.out.println(curr.info + "");
            curr = curr.next;
        }
    }

    public Node<T> get(int index) {
        Node<T> curr = head.next;
        int counter = 0;
        while ((curr != null) && counter < index) {
            counter++;
            curr = curr.next;
        }
        return curr;
    }

    public T getObject(int index) {
        Node<T> curr = head.next;
        int counter = 0;
        while ((curr != null) && counter < index) {
            counter++;
            curr = curr.next;
        }
        return curr.info;
    }

    public void addAt(int index, Node<T> mynode) {
        Node<T> index_predecessorNode = this.get(index - 1);
        if (index_predecessorNode != null) {
            mynode.next = index_predecessorNode.next;
            index_predecessorNode.next = mynode;
        }
    }
    
    public void addAt (int index, T object){
        Node <T> mynode = new Node<T> (object,null);
        Node<T> index_predecessorNode = this.get(index -1);
        if(index_predecessorNode != null){
            mynode.next = index_predecessorNode.next;
            index_predecessorNode.next = mynode;
        }
    }

    public void remove(int index) {
        Node<T> index_predecessorNode = this.get(index - 1);
        index_predecessorNode.next = index_predecessorNode.next.next;
    }
}
