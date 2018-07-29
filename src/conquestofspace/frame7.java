
package conquestofspace;

import javax.swing.*;


public class frame7 extends JFrame{
    
      Panel7 pan = new Panel7();
    public frame7(){
             super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
             
              this.setVisible(true);
}
}