
package conquestofspace;

import javax.swing.JFrame;


public class frame5 extends JFrame{

         Panel5 pan = new Panel5(); 
    
     public frame5(){
            
            super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
              this.setVisible(true);
        }
}
