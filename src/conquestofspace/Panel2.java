

package conquestofspace;

import java.awt.*;
import javax.swing.*;
import java.applet.AudioClip;
import java.awt.event.*;

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
     public JLabel Titulo, nave2, nave1,nave2Selected,nave1Selected; 
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
          boton1.setBounds(10,10,86,58);
          this.add(boton1);
          boton1.addActionListener(this);
          
          //-----------------BOTON2----------------------------------
        
        /*  boton2  = new JButton( new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/boton2.jpg"))); 
          boton2.setFont(DangerBot2);
          boton2.setForeground(blanco);
          boton2.setBounds(300,320,152,116);
          this.add(boton2);
          boton2.addActionListener(new ActionListener(){

              public void actionPerformed(ActionEvent ae) {
                  inicio(); 
              }
          });
          */
           //---------------------------------------NAVE 1---------------
      
      nave1 = new JLabel(new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/nave1.png"))); 
      nave1.setBounds ( 200,200, 99,75);
      this.add(nave1);
       nave1.addMouseListener(new MouseListener(){

              public void mouseClicked(MouseEvent me) {}

              public void mousePressed(MouseEvent me) {
                  objetosML2(); 
                 
              }

              public void mouseReleased(MouseEvent me) {}

              public void mouseEntered(MouseEvent me) { }

              public void mouseExited(MouseEvent me) {}
 });
      
       //---------------------------------------NAVE 2---------------
      
      nave2 = new JLabel( new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/nave2.png"))); 
      nave2.setBounds ( 500,200, 99,75);
      this.add(nave2);
      nave2.addMouseListener(new MouseListener(){

              public void mouseClicked(MouseEvent me) {}

              public void mousePressed(MouseEvent me) {
                  objetosML1(); 

              }

              public void mouseReleased(MouseEvent me) {}

              public void mouseEntered(MouseEvent me) { }

              public void mouseExited(MouseEvent me) {}
 });
      
      //-------------------------------------------------------------------
                 
      }

    
    private void objetosML1(){
        nave2Selected = new JLabel(new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/nave2select.png"))); 
        nave2Selected.setBounds ( 500,200, 99,75);
        this.add(nave2Selected);
        nave2Selected.setVisible(true);
        nave2.setVisible(false); 
        nave1.setVisible(true);
        inicio1();   
    }
    
     private void objetosML2(){
        nave1Selected = new JLabel(new ImageIcon(getClass().getResource("/recursos/Panel2/Imagenes/nave1select.png"))); 
        nave1Selected.setBounds ( 200,200, 99,75);
        this.add(nave1Selected);
        nave1Selected.setVisible(true);
        nave1.setVisible(false);
         nave2.setVisible(true);
         inicio2(); 
           
    }
     
     public void inicio1(){
                   frame4 fr = new frame4(); 
                  JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
                 cont.dispose();
     }
     
     public void inicio2(){
                   frame3 fr = new frame3(); 
                  JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
                 cont.dispose();
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
    
    private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 10);
        fipps = new Font("fipps", Font.PLAIN, 30);

        }
    
    private void Color(){
        
        blanco = new Color (255 , 255 , 255);
        black = new Color(0,0,0); 
        }
}
