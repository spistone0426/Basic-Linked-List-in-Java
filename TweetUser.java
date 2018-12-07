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
public class TweetUser {
    Tweet_Object head;
    Tweet_Object last;
    
    public TweetUser(){
    this.head = new Tweet_Object();
    this.last = this.head;
}
   public void addLast(Tweet_Object myuser){
        this.last.next = myuser;
        this.last = myuser;
    }
    public void addFirst(Tweet_Object myuser){
        myuser.next = head.next;
        this.head.next = myuser;
    }
    public void printList(){
        Tweet_Object curr = head.next;
        while (curr != null){
            System.out.println(curr.username + ", " + curr.followers + ", " + curr.following + ", ");
            curr = curr.next;
        }
    }
    public Tweet_Object get(int index){
        Tweet_Object curr = head.next;
        int counter = 0;
        while ((curr != null) && (counter < index)){
            counter++;
            curr = curr.next;
        }
        return curr;
    }
    
    public void addAt (int index, Tweet_Object myuser){
        Tweet_Object index_predecessorUser = this.get(index -1);
        if (index_predecessorUser != null){
            myuser.next = index_predecessorUser.next;
            index_predecessorUser.next = myuser;
        }
    }
    public void remove (int index){
        Tweet_Object index_predecessorUser = this.get(index-1);
        index_predecessorUser.next = index_predecessorUser.next;
    }
  
}
