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
public class List {
    Node head = null;
    Node tail = null;
    void Insert(float x , float y)		//there creat Insert method.
    {
	Node obj =new Node(x, y);
	if(head == null)
	{
            head = tail = obj;
	}
	else
	{
            tail.next = obj;
	    tail = obj;
        }
    }
    void Insert_viner(int x )		//there creat Insert method.
    {
        Node obj =new Node(x);
        if(head == null)
        {
	    head = tail = obj;
        }
        else
        {
            tail.next = obj;
            tail = obj;
        }
    }
}