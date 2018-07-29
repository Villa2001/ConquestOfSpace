//PERDIÓ

package conquestofspace;

import java.awt.*;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
;
import javax.swing.*;


public class Panel5 extends JPanel{
    
      private ImageIcon fondo1;
      private Font DangerBot, DangerBot2;
      private Color blanco,black;
      private JButton boton1;
      private JLabel puntuacion;
      public  int sumpunt = (Panel3.planetapt +(10000* Panel3.min) + ( 1000* Panel3.seg) + (100 * Panel3.cs));
    
      public Panel5(){
     
            
        this.setSize(800, 500);
        this.setFocusable(true);
        this.setVisible(true);
       objetos();
        }
      
        public void paintComponent(Graphics g){
        
        super.paintComponent(g);
      
            fondo1 = new ImageIcon(getClass().getResource("/recursos/Panel5/Imagenes/fondo1.png")); 
            g.drawImage(fondo1.getImage(),0, 0, 800,500, this);
            
            
    }
        
     public void objetos(){
         
         Font();
         Color();
         
         this.setLayout(null);
         
         boton1 = new JButton(new ImageIcon(getClass().getResource("/recursos/Panel5/Imagenes/boton1.png")));
         boton1.setBounds(300, 280, 200, 131);
         boton1.addActionListener(new ActionListener(){

             
             public void actionPerformed(ActionEvent ae) {
              salida(); 
                 
             }

         });
         this.add(boton1);
         
          puntuacion = new JLabel("Tu puntuación es: " +sumpunt);    
          puntuacion.setBounds(200,180,500,131);
          puntuacion.setFont(DangerBot2);
          puntuacion.setForeground(blanco);
          
          this.add(puntuacion);
         
     }   
     
      private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 30);
  
    }
    
    private void Color(){
        
        blanco = new Color (255 , 255 , 255);
        black = new Color(0,0,0); 
    }
    
    private void salida(){
       frame2 fr = new frame2(); 
       JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
       cont.dispose();
       Panel3.min = 0;
       Panel3.seg=0;
       Panel3.cs=0; 
       sumpunt = 0; 
       
    }
}
