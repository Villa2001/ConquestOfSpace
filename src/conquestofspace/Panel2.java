

package conquestofspace;

import java.awt.*;
import javax.swing.*;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2 extends JPanel implements ActionListener{
    
     public Panel2(){
            
        this.setSize(800, 500);
        this.setFocusable(true);
        this.setVisible(true);
         objetos(); 
              
        }
     
     //---------------------ZONA DE VARIABLES -------------
     private  ImageIcon fondo2; 
     public int WIDTH = 800, HEIGHT = 500;
     private Color blanco,black; 
     private Font DangerBot,DangerBot2,fipps; 
     private JLabel Titulo; 
     private JButton boton1, boton2; 
       
     //----------------------------------------------------------------
     
      private void objetos(){
          this.setLayout(null);
          //--------------------- LABEL1 -------------------------------
          Color(); 
          Font(); 
          Titulo = new JLabel("Elige tu nave");
          Titulo.setFont(DangerBot);
          Titulo.setForeground(blanco);
          Titulo.setBounds(150,50,600,100);
          this.add(Titulo);
          
          //--------------------BOTON 1-------------------------------
          boton1 = new JButton( new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/boton1.png"))); 
          boton1.setFont(DangerBot2);
          boton1.setForeground(blanco);
          boton1.setBounds(10,10,100,30);
          this.add(boton1);
          boton1.addActionListener(this);
          
          //-----------------BOTON2----------------------------------
          boton2  = new JButton(new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/boton2,jpg"))); 
                                                //new ImageIcon(getClass().getResource("/recursos/Panel1/Imagenes/boton2.jpg")
          boton2.setFont(DangerBot2);
          boton2.setForeground(blanco);
          boton2.setBounds(250,400,300,50);
          this.add(boton2);
      }
     
      private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 10);
        fipps = new Font("fipps", Font.PLAIN, 30);

        }
    
    private void Color(){
        
        blanco = new Color (255 , 255 , 255);
        black = new Color(0,0,0); 
        }
    
     public void paintComponent(Graphics g){
         
         super.paintComponent(g);
         
         fondo2 = new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/fondo1.jpg")); 
         g.drawImage(fondo2.getImage(), 0 , 0, WIDTH, HEIGHT, this);
        }
     
    public void actionPerformed(ActionEvent ae) { 
        
        frame fr = new frame(); 
        JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
        cont.dispose();
    }
}
