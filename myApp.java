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
public class myApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        // TODO code application logic here
        TweetLinkList myList = new TweetLinkList();
        TweetNode myNode1 = new TweetNode(100, "pos", "hello");
        TweetNode myNode2 = new TweetNode(200, "pos", "hello");
        TweetNode myNode3 = new TweetNode(300, "pos", "hello");
        TweetNode myNode4 = new TweetNode(5000, "pos", "hello");

        myList.addLast(myNode1);
        myList.addLast(myNode2);
        myList.addLast(myNode3);
        myList.printList();

        myList.addAt(2, myNode4);
        myList.printList();

        myList.remove(1);
        myList.printList();
        
        System.out.println();// I placed these to properly space out my code

        TweetUser myUsers = new TweetUser();
        Tweet_Object myUser1 = new Tweet_Object("Name1", 1000, 200);
        Tweet_Object myUser2 = new Tweet_Object("Name2", 950, 800);
        Tweet_Object myUser3 = new Tweet_Object("Name3", 625, 950);
        Tweet_Object myUser4 = new Tweet_Object("Name4", 15, 2000);

        myUsers.addLast(myUser1);
        myUsers.addLast(myUser2);
        myUsers.addLast(myUser3);
        myUsers.printList();

        myUsers.addAt(2, myUser4);
        myUsers.printList();

        myUsers.remove(1);
        myUsers.printList();
        
        
        System.out.println();

        StudentList myStudents = new StudentList();
        Student myStudents1 = new Student("Bob", "Male", 5);
        Student myStudents2 = new Student("Mary", "female", 10);
        Student myStudents3 = new Student("Carl", "Male", 1);
        Student myStudents4 = new Student("Liz", "Female", 12);

        myStudents.addLast(myStudents1);
        myStudents.addLast(myStudents2);
        myStudents.addLast(myStudents3);
        myStudents.printList();
        
        myStudents.addAt(3, myStudents4);
        myStudents.printList(); 
        
        myStudents.remove(1);
        myStudents.printList();

    } 

}
