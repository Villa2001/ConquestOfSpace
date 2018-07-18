

package conquestofspace;

import java.applet.AudioClip;
import java.awt.*;
import javax.swing.*;

public class frame extends JFrame{
 
   Panel1 pan1 = new Panel1(); 

    public frame(){
        
        super("CONQUEST OF SPACE "); 
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(pan1);
        
        this.setVisible(true);
        
    }
     }
    

