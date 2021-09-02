/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testopengl;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;



/**
 *
 * @author Muzammil
 */
public class Path {

   
   Shapes shape=new Shapes();
   public void display( GL2 gl) {
        shape.rectangle(gl, -100,-100 , 100, 100, 1, 1, 0);
        shape.rectangle(gl, -100,-60 , 40, 80,0, 1, 1);
        shape.rectangle(gl,42, -80,98,98, 0, 1, 1);
        shape.rectangle(gl,42, 80,98,98);
        shape.rectangle(gl,42, -80,98,98);
        shape.string(gl, 60, 90, "play Game......", 0, 0, 0);
        shape.string(gl, -50, 90, "WELCOME TO KFUEIT LUDO", 0, 0, 0);
        shape.string(gl, -70, -80, "PREPARED BY :       MUZAMMIL HUSSAIN ZAHID", 0, 0, 0);
		// First house
        shape.rectangle(gl, 40,35 , -5, 80, 1, 0, 1);
        shape.rectangle(gl, 38,37 , -3, 78, 0, 0, 0);
        shape.rectangle(gl, 36,39 , -1, 76, 1, 0, 1);
        shape.circle(gl, 17.5f, 57.5f,15, 1, 1, 1);
        shape.string(gl, 13, 56, "Player 1", 0, 0, 0);
        shape.circle(gl, 25.5f, 65.5f,3, 1, 0, 1);
        shape.circle(gl, 25.5f, 49.5f,3, 1, 0, 1);
        shape.circle(gl, 9.5f, 65.5f,3, 1, 0, 1);
        shape.circle(gl, 9.5f, 49.5f,3, 1, 0, 1);
        shape.triangle(gl, -55, 35, -30, 10, -5, 35, 1, 0, 1);
                // Second house
        shape.rectangle(gl, 40,-15 , -5, -60, 0, 0, 1);
        shape.rectangle(gl, 38,-17 , -3, -58, 0, 0, 0);
        shape.rectangle(gl, 36,-19 , -1, -56, 0, 0, 1);
        shape.circle(gl, 17.5f, -37.5f,15, 1, 1, 1);
        shape.string(gl, 13, -38, "Player 2", 0, 0, 0);
        shape.circle(gl, 25.5f, -29.5f,3, 0, 0, 1);
        shape.circle(gl, 25.5f, -45.5f,3, 0, 0, 1);
        shape.circle(gl, 9.5f, -29.5f,3, 0, 0, 1);
        shape.circle(gl, 9.5f, -45.5f,3, 0, 0, 1);
        shape.triangle(gl,-5, -15, -30, 10, -5, 35, 0, 0, 1);
                // Third house
        shape.rectangle(gl, -100,-15 , -55, -60, 1, 0, 0);
        shape.rectangle(gl, -98,-17 , -57, -58, 0, 0, 0);
        shape.rectangle(gl, -96,-19 , -59, -56, 1, 0, 0);
        shape.circle(gl, -77.5f, -37.5f,15, 1, 1, 1);
        shape.string(gl, -82, -38, "Player 3", 0, 0, 0);
        shape.circle(gl, -69.5f, -29.5f,3, 1, 0, 0);
        shape.circle(gl, -69.5f, -45.5f,3, 1, 0, 0);
        shape.circle(gl, -85.5f, -29.5f,3, 1, 0, 0);
        shape.circle(gl, -85.5f, -45.5f,3, 1, 0, 0);
        shape.triangle(gl, -55, -15, -30, 10, -5, -15, 1, 0, 0);
                // Fourth house
        shape.rectangle(gl, -100,35 , -55, 80, 0, 1, 0);
        shape.rectangle(gl, -98,37 , -57, 78, 0, 0, 0);
        shape.rectangle(gl, -96,39 , -59, 76, 0, 1, 0);
        shape.circle(gl, -77.5f, 57.5f,15, 1, 1, 1);
        shape.string(gl, -82, 56, "Player 4", 0, 0, 0);
        shape.circle(gl, -69.5f, 65.5f,3, 0, 1, 0);
        shape.circle(gl, -69.5f, 49.5f,3, 0, 1, 0);
        shape.circle(gl, -85.5f, 65.5f,3, 0, 1, 0);
        shape.circle(gl, -85.5f, 49.5f,3, 0, 1, 0);
        shape.triangle(gl, -55, -15, -30, 10, -55, 35, 0, 1, 0);  
        shape.rectangle(gl, -55,35 , -5, -15);
        shape.rectangle(gl, -100, 80.1f, 40.1f, -60.1f);
        double i = 35.0;
        while(i<80)
        {
                    if(i==72.5f)
                    {
                         shape.rectangle(gl, -55, (float) i,(float) -38.33, (float) (i+7.51));
                         shape.rectangle(gl, (float) -38.33, (float) i,(float) -21.666, (float) (i+7.51));
                         shape.rectangle(gl, (float) -21.666, (float) i,-5, (float) (i+7.51));
                         
                         // i=i+ 7.5;
                    }
                    else
                    {
                    if(i == 57.5)
                    {
                         shape.rectangle(gl, -55, (float) i,(float) -38.33, (float) (i+7.5));
                        shape.rectangle(gl, -55, (float) i,(float) -38.33, (float) (i+7.5), 1, 0, 1);
                        shape.rectangle(gl, (float)-38.33, (float) i,(float) -21.666, (float) (i+7.5), 1 , 0, 1);
                         shape.rectangle(gl, (float) -38.33, (float) i,(float) -21.666, (float) (i+7.5));
                         shape.rectangle(gl, (float) -21.666, (float) i,-5, (float) (i+7.5));
                    }
                    else if(i==65)
                    {
                         shape.rectangle(gl, -55, (float) i,(float) -38.33, (float) (i+7.5));
                         shape.rectangle(gl, (float) -21.666, (float) i,-5, (float) (i+7.5), 1, 0, 1); 
                      shape.rectangle(gl, (float) -21.666, (float) i,-5, (float) (i+7.5)); 
                      shape.rectangle(gl, (float)-38.33, (float) i,(float) -21.666, (float) (i+7.5), 1, 0, 1);
                      shape.rectangle(gl, (float)-38.33, (float) i,(float) -21.666, (float) (i+7.5));
                    }
                    else
                    {
                        shape.rectangle(gl, (float) -38.33, (float) i,(float) -21.666, (float) (i+7.5), 1, 0, 1);
                        shape.rectangle(gl, (float) -38.33, (float) i,(float) -21.666, (float) (i+7.5));
                  shape.rectangle(gl, -55, (float) i,(float) -38.33, (float) (i+7.5));
                    shape.rectangle(gl, (float) -21.666, (float) i,-5, (float) (i+7.5));
                    }
                  
                    
                }
                    i=i+ 7.5;
                }
                
                 
  
                i = -5.0;
                while(i<40)
                {
                    if(i==32.5)
                    {
                         shape.rectangle(gl, (float) i, 35, (float) (i+7.51),(float) 18.33);
                         shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.51),(float) 1.663);
                        shape.rectangle(gl,  (float) i,(float) 1.663, (float) (i+7.51),-15);
                    }
                    else
                    {
                     if(i==17.5)
                    {
                      shape.rectangle(gl, (float) i, 35, (float) (i+7.5),(float) 18.33);  
                        shape.rectangle(gl, (float) i, (float) 34.80, (float) (i+7.5),(float) 18.33 , 0, 0, 1);  
                      shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.5),(float) 1.663,  0, 0, 1);
                     shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.5),(float) 1.663);
                      shape.rectangle(gl,  (float) i,(float) 1.663, (float) (i+7.5),-15);    
                    }
                     else if(i==25)
                    {
                        shape.rectangle(gl, (float) i, 35, (float) (i+7.5),(float) 18.33);
                         shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.5),(float) 1.663, 0, 0, 1);
                        shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.5),(float) 1.663);
                      shape.rectangle(gl,  (float) i,(float) 1.663, (float) (i+7.5),-15 ,  0, 0, 1);
                        shape.rectangle(gl,  (float) i,(float) 1.663, (float) (i+7.5),-15);
                      
                    }
                    else
                    {
                  shape.rectangle(gl, (float) i, 35, (float) (i+7.5),(float) 18.33);
                  shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.5),(float) 1.663, 0, 0, 1);
                  shape.rectangle(gl, (float) i, (float) 18.33,  (float) (i+7.5),(float) 1.663);
                  shape.rectangle(gl,  (float) i,(float) 1.663, (float) (i+7.5),-15);    
                    }
                    }
                  i=i+ 7.5;    
                }
                 
                 
                 
                 
                 double j = -15;
                while(j>-60)
                {
                    if (j == -52.5)
                    {
                         shape.rectangle(gl, -5, (float) j,(float) -21.666, (float) (j-7.51));
                         shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.51));
                         shape.rectangle(gl, (float) -38.33, (float) j,-55, (float) (j-7.51));  
                    }
                    else
                    {
                    if(j == -37.5)
                    {
               shape.rectangle(gl, -5, (float) j,(float) -21.666, (float) (j-7.5), 1, 0, 0);
               shape.rectangle(gl, -5, (float) j,(float) -21.666, (float) (j-7.5));
                shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.5), 1, 0, 0);
              shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.5));
                shape.rectangle(gl, (float) -38.33, (float) j,-55, (float) (j-7.5));  
                    }
                    else  if(j==-45)
                    {
                        shape.rectangle(gl, -5, (float) j,(float) -21.666, (float) (j-7.5));
                        
                        shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.5), 1, 0, 0);
                      shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.5));
                        shape.rectangle(gl, (float) -38.33, (float) j,-55, (float) (j-7.5), 1, 0, 0);
                      shape.rectangle(gl, (float) -38.33, (float) j,-55, (float) (j-7.5));
                    }
                    
                    else
                    {
                  shape.rectangle(gl, -5, (float) j,(float) -21.666, (float) (j-7.5));
                  shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.5), 1, 0, 0);
                  shape.rectangle(gl, (float) -21.666, (float) j,(float) -38.33, (float) (j-7.5));
                  shape.rectangle(gl, (float) -38.33, (float) j,-55, (float) (j-7.5)); 
                    }
                }
                  j=j- 7.5;
                    
                }             
                j = -55.0;
                while(j> - 100)
                {
                    if(j==-92.5)
                    {
                        shape.rectangle(gl, (float) j, 35, (float) (j-7.51),(float) 18.33 );
                        shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.51),(float) 1.663);
                        shape.rectangle(gl,  (float) j,(float) 1.663, (float) (j-7.51),-15);  
                        
                    }
                    else
                    {
                     if(j==-85)
                    {
                      shape.rectangle(gl, (float) j, 35, (float) (j-7.5),(float) 18.33 , 0, 1, 0); 
                      shape.rectangle(gl, (float) j, 35, (float) (j-7.5),(float) 18.33 ); 
                       shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.5),(float) 1.663, 0, 1, 0);
                         shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.5),(float) 1.663);
                       shape.rectangle(gl,  (float) j,(float) 1.663, (float) (j-7.5),-15);
                    }
                     else  if(j==-77.5)
                    {
                        shape.rectangle(gl, (float) j, 35, (float) (j-7.5),(float) 18.33 );
                        shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.5),(float) 1.663, 0, 1, 0);
                       shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.5),(float) 1.663);
                        shape.rectangle(gl,  (float) j,(float) 1.663, (float) (j-7.5),-15, 0, 1, 0);
                         shape.rectangle(gl,  (float) j,(float) 1.663, (float) (j-7.5),-15);      
                    }
                    else
                    {
                  shape.rectangle(gl, (float) j, 35, (float) (j-7.5),(float) 18.33 );  
                   shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.5),(float) 1.663, 0, 1, 0);
                   shape.rectangle(gl, (float) j, (float) 18.33,  (float) (j-7.5),(float) 1.663);
                   shape.rectangle(gl,  (float) j,(float) 1.663, (float) (j-7.5),-15);
                   
                    }
                }
                  j=j- 7.5;    
                }                 
        }
}
