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
public class Student {
    String name;
    String gender;
    int grade;
    Student next;
    
    public Student(){
        this.name = "";
        this.gender = "";
        this.grade = 0;
        this.next = null;
    }

    public Student(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.next = null;
    }
    
    
}
