
package conquestofspace;

import javax.swing.JFrame;

public class frame2 extends JFrame{
        
         Panel2 pan = new Panel2(); 
        
        public frame2(){
            
            super("CONQUEST OF REQUEST"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
              this.setVisible(true);
        }
}
