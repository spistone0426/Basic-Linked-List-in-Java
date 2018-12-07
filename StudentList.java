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
public class StudentList {

    Student head;
    Student last;

    public StudentList() {
        this.head = new Student();
        this.last = this.head;
    }

    public void addLast(Student mystu) {
        this.last.next = mystu;
        this.last = mystu;
    }
    public void addFirst (Student mystu){
        mystu.next = head.next;
        this.head.next = mystu;
    }
    public void printList(){
        Student curr = head.next;
        while (curr != null){
            System.out.println(curr.name + ", " + curr.gender + ", " + curr.grade + ", ");
            curr = curr.next;
        }
    }
    public Student get(int index){
        Student curr = head.next;
        int counter = 0;
        while ((curr != null ) && counter < index){
            counter++;
            curr = curr.next;
        }
        return curr;
    }
    
    public void addAt(int index, Student mystu){
        Student index_predecessorStu = this.get (index-1);
        if (index_predecessorStu != null){
            mystu.next = index_predecessorStu.next;
            index_predecessorStu.next = mystu;
        }
    }
    public void remove (int index){
        Student index_predecessorStu = this.get(index-1);
        index_predecessorStu.next = index_predecessorStu.next;
    }
}
