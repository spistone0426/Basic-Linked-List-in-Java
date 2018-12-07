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
public class TweetNode {

    public int tweetid;
    public String tweetSentiment;
    public String tweetText;
    public TweetNode next;
   

    public TweetNode() {
        this.tweetid = -1;
        this.tweetSentiment = "";
        this.tweetText = "";
        this.next = null;
        
    }
    public TweetNode(int tweetid, String tweetSentiment, String tweetText) {
        this.tweetid = tweetid;
        this.tweetSentiment = tweetSentiment;
        this.tweetText = tweetText;
        this.next = null;
    }

  
}
