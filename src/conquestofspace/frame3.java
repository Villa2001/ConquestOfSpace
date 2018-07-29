

package conquestofspace;

import javax.swing.JFrame;

public class frame3 extends JFrame{
    
    Panel3 pan = new Panel3(); 
    
     public frame3(){
            
            super("CONQUEST OF SPACE"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
              this.setVisible(true);
        }
}
