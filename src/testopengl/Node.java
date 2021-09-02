/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testopengl;

/**
 *
 * @author Muzammil
 */
public class Node {
    float x;
    float y;
    Node next = null;
    public Node(float x) {
             this.x=x;
    }    
    public Node(float x, float y) {
        this.x = x;
        this.y = y;
    }    
}
