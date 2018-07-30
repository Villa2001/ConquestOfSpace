

package conquestofspace;

import javax.swing.*;


public class frame9 extends JFrame{
    
            Panel9 pan = new Panel9();
            
        
        public frame9(){
             super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              this.add(pan);
              
              this.setVisible(true);
}
}
