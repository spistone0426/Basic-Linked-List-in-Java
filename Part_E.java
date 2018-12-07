/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list_lab;
import java.util.ArrayList;
/**
 *
 * @author spist222
 */
public class Part_E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        GenericLinkList <String> myList = new GenericLinkList<>();
        myList.addLast("Example 1");
        myList.addFirst("Example 2");
        myList.printList();
        
        System.out.println();
        
        myList.addAt(2, "Example 3");       
        myList.printList();
        
        System.out.println();
        
        myList.remove(1);
        
        myList.printList();
        
        System.out.println();
        
       GenericLinkList<Integer> numList = new GenericLinkList<>();
       
       numList.addFirst( 12);
       numList.addAt(1, 4);
       numList.printList(); 
       
        System.out.println();
        
       GenericLinkList<Generic_Object> objList = new GenericLinkList<>();
       objList.addLast(new Generic_Object("End "));
        objList.addFirst(new Generic_Object("Beginning"));
         objList.addAt(1, new Generic_Object("Middle"));
         objList.printList();
       
    }
    
}
