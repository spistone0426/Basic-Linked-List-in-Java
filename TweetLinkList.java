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
public class TweetLinkList {

    TweetNode head;
    TweetNode last;

    public TweetLinkList() {
        this.head = new TweetNode(); // Takes new Data 
        this.last = this.head; // moves the object down to the next
    }

    public void addLast(TweetNode mynode) {
        this.last.next = mynode; //link new node to the end of the list
        this.last = mynode; // update the last reference
    }

    public void addFirst(TweetNode mynode) {
        mynode.next = head.next;
        this.head.next = mynode;
    }

    public void printList() {
        TweetNode curr = head.next;
        while (curr != null) {
            System.out.println(curr.tweetid + ","); //Print the id of the current tweet
            curr = curr.next; // update current so it now refernces
        }
        //At this point we have reached the end of the link-list
    }

    public TweetNode get(int index) {
        TweetNode curr = head.next; //initialize curr to referece the beginning of the list
        int counter = 0;
        while ((curr != null) && (counter < index)) {
            counter++;
            curr = curr.next;
        }
        return curr;
    }

    public void addAt(int index, TweetNode mynode) {
        TweetNode index_predecessorNode = this.get(index - 1);
        if (index_predecessorNode != null) {
        mynode.next = index_predecessorNode.next;
        index_predecessorNode.next = mynode;
        }
    }
    public void remove(int index){
        TweetNode index_predecessorNode = this.get(index-1);
        index_predecessorNode.next = index_predecessorNode.next;
        
    }
}
