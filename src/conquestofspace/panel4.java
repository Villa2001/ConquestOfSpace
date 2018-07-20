

package conquestofspace;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class panel4 extends JPanel implements KeyListener{
        
    private ImageIcon fondo1, nave1, meteoro1,meteoro2 ,meteoro3 , meteoro4; 
    private int x1 = 350, y1 = 300; 
    private int  meteorTime = 0;
    private int[] csx = new int[10];
    private int[] csy = new int[10];
    private int[] px = new int[10];      
    private int[] py = new int[10];
    // csx1 = COORDENADA DE SELECCION 1, csy1 = COORDENADA DE SELECCION 1, px = POSICION EN X, py = POSICION EN Y.
    private Timer tiempo;
    private int min, seg=0 ,cs=0 ; 
    private JLabel labeltiempo,advertencia,advertencia2; 
    private JButton btinicio; 
     private Font DangerBot ,DangerBot2 ,fipps; 
    
    
    public panel4(){
            
       this.setSize(800, 500);
        this.setFocusable(true);
        this.setVisible(true);
        this.addKeyListener(this);
        tiempo = new Timer(10, acciones); 
        
        arreglos(); 
        objetos(); 
        }
    
    public void arreglos(){
        
     /*
        0 = meteoro 1
        1 = meteoro 2
        2 = meteoro 3
        3 = meteoro 4
        */
        
    px[0] = 100;
    px[1] = 200;
    px[2] = 300;
    px[3] = 400;
    
    csx[0] = 100; 
    csx[1] = 200; 
    csx[2] = 10; 
    csx[3] = 300; 
    
    csy[0] = 200; 
    csy[1] = 100; 
    csy[2] = 10; 
    csy[3] = 250; 
    }
    
    public void objetos(){
        this.setLayout(null);
        
        Font();
        
       labeltiempo = new JLabel(); 
       labeltiempo.setBounds(5 , 5,400,30);
       labeltiempo.setFont(DangerBot2);
       labeltiempo.setForeground(Color.white);
       this.add(labeltiempo);
       
       advertencia2 = new JLabel("Presiona Tu Nave Para Iniciar"); 
       advertencia2.setBounds(x1- 200 , y1 - 200, 600,200);
       advertencia2.setFont(DangerBot2);
       advertencia2.setForeground(Color.white);
       this.add(advertencia2);
       
       advertencia = new JLabel(); 
       advertencia.setBounds(x1 , y1, 99 ,75 );
       advertencia.setFont(DangerBot2);
       advertencia.setForeground(Color.white);
       this.add(advertencia);
       advertencia.addMouseListener(new MouseListener(){

            public void mouseClicked(MouseEvent me) { }

            public void mousePressed(MouseEvent me) {
                tiempo.start();
                 meteor1.start();
                 meteor2.start(); 
                 meteor3.start();
                 meteor4.start(); 
                advertencia.setVisible(false);
                advertencia2.setVisible(false);
            }

            public void mouseReleased(MouseEvent me) { }

            public void mouseEntered(MouseEvent me) {  }

            public void mouseExited(MouseEvent me) { }
       
  });
    }
    
     private Timer meteor1 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime++; 
            
            if(meteorTime > 0 && meteorTime < 5){
                px[0] = px[0] + 101;
            }
            if(meteorTime == 5){
                    px[0] = 0; 
                    meteorTime = 0; 
            }
            
            repaint(); 
        }
        });
     
     private Timer meteor2 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime++; 
            
            if(meteorTime > 0 && meteorTime < 5){
                px[1] = px[1] + 101;
            }
            if(meteorTime == 5){
                    px[1] = 0; 
                    meteorTime = 0; 
            }
            repaint(); 
        }
        });
     
     private Timer meteor3 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime++; 
            
            if(meteorTime > 0 && meteorTime < 5){
                px[2] = px[2] + 101;
            }
            if(meteorTime == 5){
                    px[2] = 0; 
                    meteorTime = 0; 
            }
            repaint(); 
        }
        });
     
     private Timer meteor4 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime++; 
            
            if(meteorTime > 0 && meteorTime < 5){
                px[3] = px[3] + 101;
            }
            if(meteorTime == 5){
                    px[3] = 0; 
                    meteorTime = 0; 
            }
            repaint(); 
        }
        });
    
    public void paintComponent(Graphics g){
            
        fondo1 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/fondo1.jpg")); 
        g.drawImage(fondo1.getImage(), WIDTH, HEIGHT, this);
        //----------------------NAVE1-----------------------------------
        nave1 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/nave2.png")); 
        g.drawImage(nave1.getImage(), x1, y1,99, 75,  this);
        //------------------------------------------------------------------
        meteoro1 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteor1.png")); 
        g.drawImage(meteoro1.getImage(), csx[0], csy[0], csx[0] + 101 , csy[0] +84, px[0], py[0], 101 + px[0] , 84, this);
        //------------------------------------------------------------------
         meteoro2 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro2.png")); 
        g.drawImage(meteoro2.getImage(), csx[1], csy[1], csx[1] + 101 , csy[1] +84, px[1], py[1], 101 + px[1] , 84, this);
        //------------------------------------------------------------------
         meteoro3 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro3.png")); 
        g.drawImage(meteoro3.getImage(), csx[2], csy[2], csx[2] + 101 , csy[2] +84, px[2], py[2], 101 + px[2] , 84, this);
        //------------------------------------------------------------------
         meteoro4 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro4.png")); 
        g.drawImage(meteoro4.getImage(), csx[2], csy[2], csx[2] + 101 , csy[2] +84, px[2], py[2], 101 + px[2] , 84, this);
        //------------------------------------------------------------------
    }
    
    private ActionListener acciones = new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            cs++; 
            if(cs == 100){
                cs = 0; 
                seg++; 
            }
            if(seg == 60){
                seg = 0; 
                min++; 
            }
            if (min == 60){
                min = 0; 
                
            }
            
            labeltiempo(); 
        }
    };
    
    public void labeltiempo(){
      String tiempo2 = (min <= 9?"0" : " ") + min + ":" + (seg <= 9?"0" : " ") + seg + ":" + (cs<= 9? "0": " ") + cs;
      labeltiempo.setText(tiempo2);
    }

    public void keyTyped(KeyEvent ke) {}

    public void keyPressed(KeyEvent ke) {
        
        switch(ke.getKeyCode()){
        
            case KeyEvent.VK_A:

               x1 = x1 -  5; 
               break; 
               
           case KeyEvent.VK_D:
               
               x1 = x1 + 5; 
               break; 
               
           case KeyEvent.VK_W:
               
               y1 = y1 - 5; 
               break; 
           
           case KeyEvent.VK_S:
               y1 = y1 + 5; 
               break; 
        }
        
        repaint(); 
    }

    public void keyReleased(KeyEvent ke) {}
    
      private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 30);
        fipps = new Font("fipps", Font.PLAIN, 30);

        }
}
