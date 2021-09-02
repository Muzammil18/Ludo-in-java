package testopengl;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import static java.awt.SystemColor.window;


/*
 *			__________________________________________________________________________________________
 *  		        |    HANGMAN GAME														   	   _  |=|  X |
 * 		        |________________________________________________________________________________________|
 * 			||																						||
 * 			||					y = +100					||
 * 			||                                          | 						||
*  			||                                          | 						||
*   			||                                          | 						||
*    			||                                          | 						||
*     			||                                          | 						||
*      			||                                          | 						||
*        		||                                          | 						||
*         		||                                          | 						||
 *          		||                                          | 						||
 *           		||                                          | 						||
 *            		||                                          | 						||
 * 			|| x = -100_________________________________|_________________________________ x = +100 ||
 *  			||                                          |(0,0) 					||
 *   			||                                          | 						||
 *    			||                                          | 						||
 *     			||                                          | 						||
 *      		||                                          | 						||
 *       		||                                          | 						||
 *        		||                                          | 						||
 *         		||                                          | 						||
 *          		||                                          | 						||
 *           		||                                          | 						||
 *            		||                                          | 						||
 * 			||					y = -100 					||
 *			||______________________________________________________________________________________||
 *                      |________________________________________________________________________________________|
 *                  
 *                  
 *                  
 *                  
 * */


public class EventListener implements GLEventListener, KeyListener {
        Shapes shape=new Shapes();
        Path way = new Path();
        keys key = new keys();
        Goti Goties = new Goti();
	int x=0;
	public void display(GLAutoDrawable drawable) {
		
		GL2 gl = drawable.getGL().getGL2();
		
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
                way.display(gl);
              // key. runway();
              // key.rrrr(gl);
                key.runkey(gl);
                 
                
                 
        }

	public void dispose(GLAutoDrawable drawable) {}
	
	public void init(GLAutoDrawable drawable) {
            
		
		GL2 gl = drawable.getGL().getGL2();
		gl.glClearColor(1, 1 , 1, 1);
	}
	
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}
	
    public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
                    TestOpenGL.animator.stop();
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    TestOpenGL.animator.resume();
                    Event_start.select_player++;
                }
                 if(e.getKeyCode() == KeyEvent.VK_1){
                    TestOpenGL.animator.resume();
                    Event_start.select_goti=1;
                }
                  if(e.getKeyCode() == KeyEvent.VK_2){
                    TestOpenGL.animator.resume();
                    Event_start.select_goti=2;
                }
                   if(e.getKeyCode() == KeyEvent.VK_3){
                    TestOpenGL.animator.resume();
                    Event_start.select_goti=3;
                }
                    if(e.getKeyCode() == KeyEvent.VK_4){
                    TestOpenGL.animator.resume();
                    Event_start.select_goti=4;
                }
                    
	}

    public void keyReleased(KeyEvent e) {
}

    public void keyTyped(KeyEvent e) {}
    

    void keyReleased(short VK_ENTER) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void keyPressed(com.sun.glass.events.KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
class Event_start
{
    public static int select_player=0;
    public static long select_goti=0;
    public Event_start(int select_player) {
        this.select_player = select_player;
    }
    public Event_start(long select_goti)
    {
        this.select_goti=select_goti;
    }
}
