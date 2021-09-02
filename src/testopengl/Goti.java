/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testopengl;

import com.jogamp.opengl.GL2;

/**
 *
 * @author Muzammil
 */

public class Goti {
    Shapes shape=new Shapes();
    void player_1_1_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1,0,1);
        shape.string(gl, x-.75f, y-1.5f, "1", 0, 0, 0); 
    }
    void player_1_2_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1,0,1);
        shape.string(gl, x-.75f, y-1.5f, "2", 0, 0, 0);   
    }
    void player_1_3_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1,0,1);
        shape.string(gl, x-.75f, y-1.5f, "3", 0, 0, 0);   
    }
    void player_1_4_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1,0,1);
        shape.string(gl, x-.75f, y-1.5f, "4", 0, 0, 0);   
    }
    void player_2_1_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2, 0, 0, 1);
        shape.string(gl, x-.75f, y-1.5f, "1", 0, 0, 0); 
    }
     void player_2_2_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2, 0, 0, 1);
        shape.string(gl, x-.75f, y-1.5f, "2", 0, 0, 0); 
    }
      void player_2_3_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2, 0, 0, 1);
        shape.string(gl, x-.75f, y-1.5f, "3", 0, 0, 0); 
    }
       void player_2_4_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2, 0, 0, 1);
        shape.string(gl, x-.75f, y-1.5f, "4", 0, 0, 0); 
    }
    void player_3_1_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1, 0, 0);
        shape.string(gl, x-.75f, y-1.5f, "1", 0, 0, 0); 
    }
     void player_3_2_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1, 0, 0);
        shape.string(gl, x-.75f, y-1.5f, "2", 0, 0, 0); 
    }
      void player_3_3_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1, 0, 0);
        shape.string(gl, x-.75f, y-1.5f, "3", 0, 0, 0); 
    }
       void player_3_4_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,1, 0, 0);
        shape.string(gl, x-.75f, y-1.5f, "4", 0, 0, 0); 
    }
    void player_4_1_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,0, 1, 0);
        shape.string(gl, x-.75f, y-1.5f, "1", 0, 0, 0);     
    }
     void player_4_2_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,0, 1, 0);
        shape.string(gl, x-.75f, y-1.5f, "2", 0, 0, 0);     
    }
      void player_4_3_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,0, 1, 0);
        shape.string(gl, x-.75f, y-1.5f, "3", 0, 0, 0);     
    }
       void player_4_4_Goti(GL2 gl , float x,float y)
    {
        shape.circle(gl,x,y,3,0,0,0);
        shape.circle(gl,x,y,2,0, 1, 0);
        shape.string(gl, x-.75f, y-1.5f, "4", 0, 0, 0);     
    }
    
    
}
