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
public class Tweet_Object {

    public String username;
    public int followers;
    public int following;
    public Tweet_Object next;

    public Tweet_Object() {
        this.username = "";
        this.followers = 0;
        this.following = 0;
        this.next = null;
    }

    public Tweet_Object(String username, int followers, int following) {
        this.username = username;
        this.followers = followers;
        this.following = following;
        this.next = null;
    }

}
