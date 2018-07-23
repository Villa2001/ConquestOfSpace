

package conquestofspace;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Panel3 extends JPanel implements KeyListener{
    
    private ImageIcon fondo1, nave1, meteoro1,meteoro2 ,meteoro3 , meteoro4,meteoro5,meteoro6;
    private ImageIcon meteoro7, meteoro8, meteoro9, meteoro10, meteoro11;
    private int x1 = 350, y1 = 300; 
    private int[] meteorTime = new int[11];
    private int[] csx = new int[11];
    private int[] csy = new int[11];
    private int[] px = new int[11];      
    private int[] py = new int[11];
    // csx = COORDENADA DE SELECCION 1, csy = COORDENADA DE SELECCION 1, px = POSICION EN X, py = POSICION EN Y.
    private Timer tiempo;
    private int min, seg=0 ,cs=0 ; 
    private JLabel labeltiempo,advertencia,advertencia2; 
    private JButton btinicio; 
     private Font DangerBot ,DangerBot2 ,fipps; 

    public Panel3(){
            
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
        4 = meteoro 5
        5 = meteoro 6
        6 = meteoro 7
        7 = meteoro 8
        8 = meteoro 9
        9 = meteoro 10
        10 = meteoro 11
        11= meteoro 12
        */
    x1 = 350;
    y1 = 300; 
    
    px[0] = 0;
    px[1] = 0;
    px[2] = 0;
    px[3] = 0;
    px[4] = 0;
    px[5] = 0;
    px[6] = 0;
    px[7] = 0;
    px[8] = 0;
    px[9] = 0;
    px[10] = 0;
    
     py[0] = 0;
    py[1] = 0;
    py[2] = 0;
    py[3] = 0;
    py[4] = 0;
    py[5] = 0;
    py[6] = 0;
    py[7] = 0;
    py[8] = 0;
    py[9] = 0;
    py[10] = 0;
    
    
    csx[0] = 300; 
    csx[1] = 100; 
    csx[2] = 400; 
    csx[3] = 200; 
    csx[4] = 700; 
    csx[5] = 700; 
    csx[6] = 455; 
    csx[7] = 600; 
    csx[8] = 100; 
    csx[9] = 200; 
    csx[10] = 10; 
    
    csy[0] = 200; 
    csy[1] = 100; 
    csy[2] = 100; 
    csy[3] = 250; 
    csy[4] = 200; 
    csy[5] = 40; 
    csy[6] = 10; 
    csy[7] = 250; 
    csy[8] = 200; 
    csy[9] = 100; 
    csy[10] = 10; 
     
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
                 meteor5.start();
                 meteor6.start(); 
                 meteor7.start();
                 meteor8.start(); 
                 meteor9.start();
                 meteor10.start(); 
                 meteor11.start(); 
                 choque();
                advertencia.setVisible(false);
                advertencia2.setVisible(false);
            }

            public void mouseReleased(MouseEvent me) { }

            public void mouseEntered(MouseEvent me) {  }

            public void mouseExited(MouseEvent me) { }
       
  });
    }
    
     private Timer movimiento = new Timer(100, new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
        }
     });
     private Timer meteor1 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[0]++; 
            // 505 * 84
            if(meteorTime[0] > 0 && meteorTime[0] < 5){
                px[0] = px[0] + 101;
            }
            if(meteorTime[0] == 5){
                    px[0] = 0; 
                    meteorTime[0] = 0; 
            }
            
            repaint(); 
        }
        });
     
     private Timer meteor2 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[1]++; 
            //505*84
            if(meteorTime[1] > 0 && meteorTime[1] < 5){
                px[1] = px[1] + 101;
            }
            if(meteorTime[1] == 5){
                    px[1] = 0; 
                    meteorTime[1] = 0; 
            }
            repaint(); 
        }
        });
     
     private Timer meteor3 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[2]++; 
            // 90 * 19
            if(meteorTime[2] > 0 && meteorTime[2] < 5){
                px[2] = px[2] + 18;
            }
            if(meteorTime[2] == 5){
                    px[2] = 0; 
                    meteorTime[2] = 0; 
            }
            repaint(); 
        }
        });
     
     private Timer meteor4 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[3]++; 
            //449 * 85
            if(meteorTime[3] > 0 && meteorTime[3] < 5){
                px[3] = px[3] + 90;
            }
            if(meteorTime[3] == 5){
                    px[3] = 0; 
                    meteorTime[3] = 0; 
            }
            repaint(); 
        }
        });
       private Timer meteor5 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[4]++; 
            //490 * 98
            if(meteorTime[4] > 0 && meteorTime[4] < 5){
                px[4] = px[4] + 98;
            }
            if(meteorTime[4] == 5){
                    px[4] = 0; 
                    meteorTime[4] = 0; 
            }
            repaint(); 
        }
        });
    
        private Timer meteor6 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[5]++; 
            //215 *43
            if(meteorTime[5] > 0 && meteorTime[5] < 5){
                px[5] = px[5] + 43;
            }
            if(meteorTime[5] == 5){
                    px[5] = 0; 
                    meteorTime[5] = 0; 
            }
            repaint(); 
        }
        });
        
         private Timer meteor7 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[6]++; 
            //505 * 101
            if(meteorTime[6] > 0 && meteorTime[6] < 5){
                px[6] = px[6] + 101;
            }
            if(meteorTime[6] == 5){
                    px[6] = 0; 
                    meteorTime[6] = 0; 
            }
            repaint(); 
        }
        });
         
          private Timer meteor8 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[7]++; 
            //600 * 120
            if(meteorTime[7] > 0 && meteorTime[7] < 5){
                px[7] = px[7] + 120;
            }
            if(meteorTime[7] == 5){
                    px[7] = 0; 
                    meteorTime[7] = 0; 
            }
            repaint(); 
        }
        });
          
           private Timer meteor9 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[8]++; 
            //445 * 89
            if(meteorTime[8] > 0 && meteorTime[8] < 5){
                px[8] = px[8] + 89;
            }
            if(meteorTime[8] == 5){
                    px[8] = 0; 
                    meteorTime[8] = 0; 
            }
            repaint(); 
        }
        });
           
            private Timer meteor10 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[9]++; 
            //490 * 98
            if(meteorTime[9] > 0 && meteorTime[9] < 5){
                px[9] = px[9] + 98;
            }
            if(meteorTime[9] == 5){
                    px[9] = 0; 
                    meteorTime[9] = 0; 
            }
            repaint(); 
        }
        });
            
             private Timer meteor11 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[10]++; 
            //140 * 28
            if(meteorTime[10] > 0 && meteorTime[10] < 5){
                px[10] = px[10] + 28;
            }
            if(meteorTime[10] == 5){
                    px[10] = 0; 
                    meteorTime[10] = 0; 
            }
            repaint(); 
        }
        });
    
    public void paintComponent(Graphics g){
            
        fondo1 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/fondo1.jpg")); 
        g.drawImage(fondo1.getImage(), WIDTH, HEIGHT, this);
        //----------------------NAVE1-----------------------------------
        nave1 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/nave1.png")); 
        g.drawImage(nave1.getImage(), x1, y1,99, 75,  this);
        //------------------------------------------------------------------
        meteoro1 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro1.png")); 
        g.drawImage(meteoro1.getImage(), csx[0], csy[0], csx[0] + 101 , csy[0] +101, px[0], py[0], 101 + px[0] , 101, this);
      
      // g.drawImage(meteoro1.getImage(), Inicio x, Inicio y, limite en x, Limite y, posicion, posicion, tamaño en x ,Tamaño y, this);
        
        //------------------------------------------------------------------
        
         meteoro2 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro2.png")); 
        g.drawImage(meteoro2.getImage(), csx[1], csy[1], csx[1] + 101 , csy[1] + 101, px[1], py[1], 101 + px[1] , 101, this);
        //------------------------------------------------------------------
        
         meteoro3 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro3.png")); 
        g.drawImage(meteoro3.getImage(), csx[2], csy[2], csx[2] + 19 , csy[2] +19, px[2], py[2], 19 + px[2] , 19, this);
        //------------------------------------------------------------------
        
         meteoro4 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro4.png")); 
        g.drawImage(meteoro4.getImage(), csx[3], csy[3], csx[3] + 90 , csy[3] +85, px[3], py[3], 90 + px[3] , 85, this);
        //------------------------------------------------------------------
        
        meteoro5 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro5.png")); 
        g.drawImage(meteoro5.getImage(), csx[4], csy[4], csx[4] + 98 , csy[4] +98, px[4], py[4], 98 + px[4] , 98, this);
        //------------------------------------------------------------------
        
        meteoro6 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro6.png")); 
        g.drawImage(meteoro6.getImage(), csx[5], csy[5], csx[5] + 43 , csy[5] + 43, px[5], py[5], 43 + px[5] , 43, this);
                
        //------------------------------------------------------------------
        
        meteoro7 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro7.png")); 
        g.drawImage(meteoro7.getImage(), csx[6], csy[6], csx[6] + 101 , csy[6] +101 , px[6], py[6], 101 + px[6] , 101, this);
        
        //------------------------------------------------------------------
        
        meteoro8 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro8.png")); 
        g.drawImage(meteoro8.getImage(), csx[7], csy[7], csx[7] + 120 , csy[7] +120, px[7], py[7], 120 + px[7] , 120, this);
        //------------------------------------------------------------------
        
        meteoro9 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro9.png")); 
        g.drawImage(meteoro9.getImage(), csx[8], csy[8], csx[8] + 89 , csy[8] +89, px[8], py[6], 89 + px[8] , 89, this);
        //------------------------------------------------------------------
        
        meteoro10 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro10.png")); 
        g.drawImage(meteoro10.getImage(), csx[9], csy[9], csx[9] + 98 , csy[9] +98, px[9], py[9], 98 + px[9] , 98, this);
        //------------------------------------------------------------------
        
        meteoro11 = new ImageIcon(getClass().getResource("/recursos/Panel3/Imagenes/meteoro11.png")); 
        g.drawImage(meteoro11.getImage(), csx[10], csy[10], csx[10] + 28 , csy[10] +28, px[10], py[10], 28 + px[10] , 28, this);
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
    
    public void choque(){
        
         //METEORO1
        if((x1 + 92  >= csx[0])  && (x1 <= csx[0] + 101)  && (y1 + 73  >= csy[0]) && (y1 <= csy[0] + 75 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
        
        
        //METEORO2
         if((x1 + 92  >= csx[1])  && (x1 <= csx[1] + 101)  && (y1 + 70  >= csy[1]) && (y1 <= csy[1] + 75 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
        
         
        //METEORO3
         if((x1 + 92  >= csx[2])  && (x1 <= csx[2] + 18)  && (y1 + 71  >= csy[2]) && (y1 <= csy[2] + 19 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }

        //METEORO4
         if((x1 + 92  >= csx[3])  && (x1 <= csx[3] + 80)  && (y1 + 73  >= csy[3]) && (y1 <= csy[3] + 80 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
        
        //METEORO5
         if((x1 + 92  >= csx[4])  && (x1 <= csx[4] + 95)  && (y1 + 73  >= csy[4]) && (y1 <= csy[4] + 98 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
        
        //METEORO6
         if((x1 + 92  >= csx[5])  && (x1 <= csx[5] + 40)  && (y1 + 73  >= csy[5]) && (y1 <= csy[5] + 40 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
       
        
        //METEORO7
         if((x1 + 92  >= csx[6])  && (x1 <= csx[6] + 98)  && (y1 + 73  >= csy[6]) && (y1 <= csy[6] + 98 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
       
        //METEORO8
         if((x1 + 92  >= csx[7])  && (x1 <= csx[7] + 96)  && (y1 + 73  >= csy[7]) && (y1 <= csy[7] + 115 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
        
        //METEORO9
         if((x1 + 92  >= csx[8])  && (x1 <= csx[8] + 85)  && (y1 + 70  >= csy[8]) && (y1 <= csy[8] + 85  ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
         
        //METEORO10
         if((x1 + 92  >= csx[9])  && (x1 <= csx[9] + 95)  && (y1 + 73  >= csy[9]) && (y1 <= csy[9] + 95 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
       
        //METEORO11
         if((x1 + 92  >= csx[10])  && (x1 <= csx[10] + 25)  && (y1 + 73  >= csy[10]) && (y1 <= csy[10] + 25 ) ){
        
        JOptionPane.showMessageDialog(this, "SDLkfaslkdjf","Perdiste",JOptionPane.ERROR_MESSAGE);
        x1 = 350;
        y1 = 300; 
        }
          
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
        
        choque();
        repaint(); 
    }

    public void keyReleased(KeyEvent ke) {}
    
      private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 30);
        fipps = new Font("fipps", Font.PLAIN, 30);

        }
      

   
}


    