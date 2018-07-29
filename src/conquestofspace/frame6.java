package conquestofspace;

import javax.swing.JFrame;


public class frame6 extends JFrame{
    
    Panel6 pan = new Panel6();
    public frame6(){
             super("CONQUEST OF REQUEST"); 
              this.setSize(800, 500);
              this.setLocationRelativeTo(null);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setResizable(false);
              
              this.add(pan);
              
              this.setVisible(true);
    }
}
