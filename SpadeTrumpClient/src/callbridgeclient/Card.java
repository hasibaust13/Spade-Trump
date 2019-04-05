/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package callbridgeclient;

/**
 *
 * @author Sanim
 */
public class Card implements Comparable<Card> {

    int a, b;

    Card(int _a, int _b) {
        a = _a;
        b = _b;
    }

    public int compareTo(Card com) {
        
        if(com.a != this.a) return this.a - com.a;
        return this.b - com.b;

    }
}
