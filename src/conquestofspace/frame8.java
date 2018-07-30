
package conquestofspace;

import javax.swing.*;


public class frame8 extends JFrame{
        Panel8 pan = new Panel8();
            
        
        public frame8(){
             super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
             
              this.setVisible(true);
}
}
