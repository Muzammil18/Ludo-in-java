/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testopengl;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

/**
 *
 * @author Shami
 */
public class TestOpenGL {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    
    
    static FPSAnimator animator;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities caps = new GLCapabilities(profile);

        GLWindow window = GLWindow.create(caps);
        
        
        window.setSize(1440, 1440);
        window.setResizable(false);
        window.addGLEventListener(new EventListener());
        window.addKeyListener(new EventListener());
        window.setTitle("Open GL");

        
        animator = new FPSAnimator(window, 3);
        animator.start();

        window.setVisible(true);
        
        
        
    }
    
}
