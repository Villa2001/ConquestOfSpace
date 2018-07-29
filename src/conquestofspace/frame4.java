

package conquestofspace;

import javax.swing.*;


public class frame4 extends JFrame{
    
     panel4 pan = new panel4(); 
    
     public frame4(){
            
             super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
              this.setVisible(true);
}
}
    

