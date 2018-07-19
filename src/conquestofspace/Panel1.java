
//PANTALLA DE INICIO
package conquestofspace;

import java.applet.AudioClip;
import java.awt.*; //Imagenes
import javax.swing.*; //Complementos
import java.awt.event.*; //Eventos 

public class Panel1 extends JPanel implements ActionListener{
    
    //------------------ZONA DE VARIABLES--------------------
    
    private AudioClip sonido1;
    
    public int WIDTH = 800, HEIGHT = 500;
    private Font DangerBot, DangerBot2;
    private Color blanco,black; 
    public  ImageIcon fondo1,fondo2;
    
     private JLabel Titulo, Titulo2; 
     private  JButton boton1,boton2,boton3; 
    //-------------------------------------------------------------------
     
    public Panel1(){
        
        this.setSize(WIDTH, HEIGHT);
       this.setFocusable(true);
       objetos(); 
       
    }
    
    public void objetos(){
    
      this.setLayout(null);
      
     //--------------------------------------BOTON 1---------------------------------------------------
     boton1 = new JButton( new ImageIcon(getClass().getResource("/recursos/Panel1/Imagenes/boton1.jpg"))); //ASI SE INGRESA CUALQUIER IMAGEN
     boton1.setBounds(10,10,43,57);
     boton1.setForeground(black);
     this.add(boton1); 
     boton1.addActionListener( new ActionListener(){
       
          public void actionPerformed(ActionEvent ae) {
              sonidoON(); 
              boton1.setVisible(false);
              boton3.setVisible(true); 
  }
     });
    
     //---------------------------------------BOTON 2 ------------------------------------------------------
     boton2 = new JButton( new ImageIcon(getClass().getResource("/recursos/Panel1/Imagenes/boton2.jpg"))); //ASI SE INGRESA CUALQUIER IMAGEN
     boton2.setBounds(300,300,148,126);
     boton2.setForeground(black);
     this.add(boton2); 
    
     boton2.addActionListener(this);
   //---------------------------------BOTON 3----------------------------------------------
     
     boton3 = new JButton( new ImageIcon(getClass().getResource("/recursos/Panel1/Imagenes/boton3.png"))); //ASI SE INGRESA CUALQUIER IMAGEN
     boton3.setBounds(10,10,43,56);
     boton3.setForeground(black);
     this.add(boton3); 
     boton3.addActionListener( new ActionListener(){
     
          public void actionPerformed(ActionEvent ae) {
              sonidoOFF(); 
              boton3.setVisible(false);
              boton1.setVisible(true);
  } 
     });
     //---------------------------------------------------------------------------------------------
    }
    
    private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 30);
  
    }
    
    private void Color(){
        
        blanco = new Color (255 , 255 , 255);
        black = new Color(0,0,0); 
    }
    
    public void sonidoON(){
         
         sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/recursos/Panel1/Sonidos/sonido1.wav")); 
         sonido1.play();
     
     }
    
   public void sonidoOFF(){
       sonido1.stop();
   } 
    
     public void actionPerformed(ActionEvent ae) {
                 
              frame2  fr = new frame2(); 
              JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
              cont.dispose();
          }
   
    public void paintComponent(Graphics g){
        
            super.paintComponent(g);
      
            fondo1 = new ImageIcon(getClass().getResource("/recursos/Panel1/Imagenes/fondo1.jpg")); 
            g.drawImage(fondo1.getImage(),0, 0, WIDTH,HEIGHT, this);
            
            fondo2 = new ImageIcon(getClass().getResource("/recursos/Panel1/Imagenes/space2.png")); 
            g.drawImage(fondo2.getImage(),130, 10, 500, 250, this);
         
    }
 
}
