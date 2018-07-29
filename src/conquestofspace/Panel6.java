//NIVEL 2 NAVE 1

package conquestofspace;

import java.awt.*;
import javax.swing.*;


public class Panel6 extends JPanel{
    private Font Dangerbot, Dangerbot2;
    private ImageIcon fondo1;
    private JButton boton1;

    public Panel6(){
         this.setSize(800, 500);
        this.setFocusable(true);
        this.setVisible(true);
        
    }
    
        public void objetos(){
           
            boton1 = new JButton(); 
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
      
            fondo1 = new ImageIcon(getClass().getResource("/recursos/Panel6/Imagenes/fondo1.png")); 
            g.drawImage(fondo1.getImage(),0, 0, 800,500, this);
            
    }
}

