

package conquestofspace;

import javax.swing.*;


public class win extends JFrame{
    
     Panelwin pan = new Panelwin(); 
    
     public win(){
            
            super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
              this.setVisible(true);
        }
}
