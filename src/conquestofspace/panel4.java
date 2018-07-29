//NIVEL 1 NAVE 2

package conquestofspace;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class panel4 extends JPanel implements KeyListener{
        
       
    private ImageIcon fondo1, nave1, meteoro1,meteoro2 ,meteoro3 , meteoro4,meteoro5,meteoro6;
    private ImageIcon meteoro7, meteoro8, meteoro9, meteoro10, meteoro11,meteoro12, meteoro13, meteoro14, meteoro15, meteoro16;
    private ImageIcon meteoro17, meteoro18, meteoro19, meteoro20, meteoro21,meteoro22,planeta1;
    private int x1 = 350, y1 = 300; 
    private int t = 0, t1=0, t2 = 0,tp= 0; 
    private int[] meteorTime = new int[23];
    private int[] csx = new int[23];
    private int[] csy = new int[23];
    private int[] px = new int[23];      
    private int[] py = new int[23];
    
    // csx = COORDENADA DE SELECCION 1, csy = COORDENADA DE SELECCION 1, px = POSICION EN X, py = POSICION EN Y.
    private Timer tiempo;
    public static int min = 0, seg=0 ,cs=0; 
    private JLabel labeltiempo,advertencia,advertencia2; 
    private JButton btinicio; 
     private Font DangerBot ,DangerBot2 ,fipps; 
     public static int planetapt =0;

    public panel4(){
         this.setSize(800, 500);
        this.setFocusable(true);
        this.setVisible(true);
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
    px[11] = 0;
    px[12] = 0;
    px[13] = 0;
    px[14] = 0;
    px[15] = 0;
    px[16] = 0;
    px[17] = 0;
    px[18] = 0;
    px[19] = 0;
    px[20] = 0;
    px[21] = 0;
    px[22] = 0; 
    
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
    py[11] = 0;
    py[12] = 0;
    py[13] = 0;
    py[14] = 0;
    py[15] = 0;
    py[16] = 0;
    py[17] = 0;
    py[18] = 0;
    py[19] = 0;
    py[20] = 0;
    py[21] = 0;
    py[22] = 0; 
    
    
    csx[0] = 600; 
    csx[1] = 100; 
    csx[2] = 100; //PRMER NIVEL
    csx[3] = 200; 
    csx[4] = 300; //PRIMER NIVEL
    csx[5] = 130; //PRIMER NIVEL
    csx[6] = 455; 
    csx[7] = 680; //PRIMER NIVEL
    csx[8] = 700;  //PRIMER NIVEL
    csx[9] = 520; //PRIMER NIVEL
    csx[10] = 650; 
    csx[11] = 100; 
    csx[12] = 700; 
    csx[13] = 500; //PRIMER NIVEL 
    csx[14] = 700; 
    csx[15] = 700; 
    csx[16] = 800; //PRIMER NIVEL
    csx[17] = 600; 
    csx[18] = 100; //PRIMER NIVEL
    csx[19] = 200; 
    csx[20] = 300; //PRIMER NIVEL
    csx[21] = 200; //PRIMER NIVEL 
    csx[22] = 330;
    
    csy[0] = -120; 
    csy[1] = -130; 
    csy[2] = -140; 
    csy[3] = -150; 
    csy[4] = -160; 
    csy[5] = -120; 
    csy[6] = -140;
    csy[7] = -150; 
    csy[8] = -140; 
    csy[9] = -120; 
    csy[10] =- 130; 
    csy[11] = -120; 
    csy[12] = -110; 
    csy[13] = -140; 
    csy[14] = -150; 
    csy[15] = -140;  
    csy[16] = -120; 
    csy[17] = -130; 
    csy[18] = -110; 
    csy[19] = -150; 
    csy[20] =- 120; 
     csy[21] = -140; 
     csy[22] = -400;
    
     
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
               
                  inicioTimers(); 
                 choque();
                 key();
                advertencia.setVisible(false);
                advertencia2.setVisible(false);
            }

            public void mouseReleased(MouseEvent me) { }

            public void mouseEntered(MouseEvent me) {  }

            public void mouseExited(MouseEvent me) { }
       
  });
    }
    
     private void key(){
        this.addKeyListener(this);
    }
    
     private Timer movimiento1 = new Timer(100, new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
              //MOVIMIENTO METEOROS
                t++;
                
                if(t >=0 ){
                 //   csy[0] = csy[0]+5; 
                  //  csy[1] = csy[1]+5; 
                    csy[4] = csy[4]+5; 
                }
                
                 if(t >=6 ){
             //   csy[0] = csy[0]+5; 
             //  csy[1] = csy[1]+5; 
               csy[4] = csy[4]+5; 
                 
                }
               
               if(t >=11 ){
              // csy[6] = csy[6]+5; 
               csy[7] = csy[7]+5; 
               csy[9] = csy[9]+5; 
               }
               
               if(t >=16){
             //  csy[11] = csy[11]+5; 
              // csy[12] = csy[12]+5; 
               csy[18] = csy[18]+5;
               }
               
               if(t >=21){
             //  csy[15] = csy[15]+5; 
             //  csy[17] = csy[17]+5;
             
                  csy[20] = csy[20]+5; 
               
               
               }
               
               
               
               
               if(t == 140){
                  
               t=0; 
               csy[0] = -100; 
               csy[1] = -100; 
               csy[4] = -100; 
               csy[6] = -100; 
               csy[7] = -100; 
               csy[9] = -100; 
               csy[11] = -100; 
               csy[12] = -100; 
               csy[18] = -100; 
               csy[15] = -100; 
               csy[17] = -100; 
               csy[20] = -100; 
               }
               
                choque(); 

                
        }
     });
     
      private Timer movimiento3 = new Timer(60, new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
              //MOVIMIENTO METEOROS
            
            t2++;
            if(t2 >=0 ){
              //  csy[3] = csy[3]+5; 
                csy[5] = csy[5]+5; 
                
                }
                
                 if(t2 >=6 ){
               //  csy[8] = csy[8]+5; 
                csy[10] = csy[10]+5; 
                 
                }
               
               if(t2 >=11 ){
             //  csy[14] = csy[14]+5; 
                csy[16] = csy[16]+5;
               }
               
               if(t2 >=16 ){
               csy[21] = csy[21]+5; 
               }
               
               if(t2 >=21){
               csy[21] = csy[21]+5; 
               
             
               }
              
                if(t2 == 130){
                  
                    t2=0; 
                    csy[3] = -100; 
                    csy[5] = -100; 
                    csy[8] = -100; 
                    csy[10] = -100; 
                    csy[14] = -100; 
                    csy[16] = -100; 
                    csy[21] = -100; 
               }
                
                
                
                 choque(); 
        }
     });
      
       private Timer movimiento2 = new Timer(30, new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
              //MOVIMIENTO METEOROS
            t1++; 
            
            if(t1 >=0){
             //   csy[2] = csy[2]+5; 
                }
                
                 if(t1 >=6){
              // csy[13] = csy[13]+5; 
                 
                }
               
               if(t1 >=11){
               csy[2] = csy[2]+5; 
               }
               
               if(t1 >=16 ){
               csy[13] = csy[13]+5; 
               }
               
               if(t1 >=21 ){
              csy[2] = csy[2]+5; 
               
               
               }
               
                if(t == 40){
               t1=0; 
               csy[2] = -100; 
                csy[13] = -100; 
               }
               
                choque(); 

        }
     });
       
       private Timer movimiento4 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            
                tp++;
                if(tp >= 230 ){
                   csy[22] = csy[22] +5;
                  
               }
               
               if(tp >= 330){
                   csy[22] = csy[22] -5;
                   csy[4] = -100; 
               }
                
        }
      
      
      }); 
       
      private Timer planetat1 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            //planetaTimer++;
            //Esto no es un sprite aun 
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
             
             private Timer meteor12 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[11]++; 
            // 505 * 84
            if(meteorTime[0] > 0 && meteorTime[11] < 5){
                px[11] = px[11] + 101;
            }
            if(meteorTime[11] == 5){
                    px[1] = 0; 
                    meteorTime[11] = 0; 
            }
            
            repaint(); 
        }
        });
     
     private Timer meteor13 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[12]++; 
            //505*84
            if(meteorTime[1] > 0 && meteorTime[12] < 5){
                px[12] = px[12] + 101;
            }
            if(meteorTime[1] == 5){
                    px[12] = 0; 
                    meteorTime[12] = 0; 
            }
            repaint(); 
        }
        });
     
     private Timer meteor14 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[13]++; 
            // 90 * 19
            if(meteorTime[13] > 0 && meteorTime[13] < 5){
                px[13] = px[13] + 18;
            }
            if(meteorTime[13] == 5){
                    px[13] = 0; 
                    meteorTime[13] = 0; 
            }
            repaint(); 
        }
        });
     
     private Timer meteor15 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[14]++; 
            //449 * 85
            if(meteorTime[14] > 0 && meteorTime[14] < 5){
                px[14] = px[14] + 90;
            }
            if(meteorTime[14] == 5){
                    px[14] = 0; 
                    meteorTime[14] = 0; 
            }
            repaint(); 
        }
        });
       private Timer meteor16 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[15]++; 
            //490 * 98
            if(meteorTime[15] > 0 && meteorTime[15] < 5){
                px[15] = px[15] + 98;
            }
            if(meteorTime[4] == 5){
                    px[4] = 0; 
                    meteorTime[4] = 0; 
            }
            repaint(); 
        }
        });
    
        private Timer meteor17 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[16]++; 
            //215 *43
            if(meteorTime[16] > 0 && meteorTime[16] < 5){
                px[16] = px[16] + 43;
            }
            if(meteorTime[16] == 5){
                    px[16] = 0; 
                    meteorTime[16] = 0; 
            }
            repaint(); 
        }
        });
        
         private Timer meteor18 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[17]++; 
            //505 * 101
            if(meteorTime[17] > 0 && meteorTime[17] < 5){
                px[17] = px[17] + 101;
            }
            if(meteorTime[17] == 5){
                    px[17] = 0; 
                    meteorTime[17] = 0; 
            }
            repaint(); 
        }
        });
         
          private Timer meteor19 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[18]++; 
            //600 * 120
            if(meteorTime[18] > 0 && meteorTime[18] < 5){
                px[18] = px[18] + 120;
            }
            if(meteorTime[18] == 5){
                    px[18] = 0; 
                    meteorTime[18] = 0; 
            }
            repaint(); 
        }
        });
          
           private Timer meteor20 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[19]++; 
            //445 * 89
            if(meteorTime[19] > 0 && meteorTime[19] < 5){
                px[19] = px[19] + 89;
            }
            if(meteorTime[19] == 5){
                    px[19] = 0; 
                    meteorTime[19] = 0; 
            }
            repaint(); 
        }
        });
           
            private Timer meteor21 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[20]++; 
            //490 * 98
            if(meteorTime[20] > 0 && meteorTime[20] < 5){
                px[20] = px[20] + 98;
            }
            if(meteorTime[20] == 5){
                    px[20] = 0; 
                    meteorTime[20] = 0; 
            }
            repaint(); 
        }
        });
            
             private Timer meteor22 = new Timer(100,new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            meteorTime[21]++; 
            //140 * 28
            if(meteorTime[21] > 0 && meteorTime[21] < 5){
                px[21] = px[21] + 28;
            }
            if(meteorTime[21] == 5){
                    px[21] = 0; 
                    meteorTime[21] = 0; 
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
        meteoro1 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro1.png")); 
        g.drawImage(meteoro1.getImage(), csx[0], csy[0], csx[0] + 101 , csy[0] +101, px[0], py[0], 101 + px[0] , 101, this);
      
      // g.drawImage(meteoro1.getImage(), Inicio x, Inicio y, limite en x, Limite y, posicion, posicion, tamaño en x ,Tamaño y, this);
        
        //------------------------------------------------------------------
        
         meteoro2 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro2.png")); 
        g.drawImage(meteoro2.getImage(), csx[1], csy[1], csx[1] + 101 , csy[1] + 101, px[1], py[1], 101 + px[1] , 101, this);
        //------------------------------------------------------------------
        
         meteoro3 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro3.png")); 
        g.drawImage(meteoro3.getImage(), csx[2], csy[2], csx[2] + 19 , csy[2] +19, px[2], py[2], 19 + px[2] , 19, this);
        //------------------------------------------------------------------
        
         meteoro4 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro4.png")); 
        g.drawImage(meteoro4.getImage(), csx[3], csy[3], csx[3] + 90 , csy[3] +85, px[3], py[3], 90 + px[3] , 85, this);
        //------------------------------------------------------------------
        
        meteoro5 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro5.png")); 
        g.drawImage(meteoro5.getImage(), csx[4], csy[4], csx[4] + 98 , csy[4] +98, px[4], py[4], 98 + px[4] , 98, this);
        //------------------------------------------------------------------
        
        meteoro6 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro6.png")); 
        g.drawImage(meteoro6.getImage(), csx[5], csy[5], csx[5] + 43 , csy[5] + 43, px[5], py[5], 43 + px[5] , 43, this);
                
        //------------------------------------------------------------------
        
        meteoro7 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro7.png")); 
        g.drawImage(meteoro7.getImage(), csx[6], csy[6], csx[6] + 101 , csy[6] +101 , px[6], py[6], 101 + px[6] , 101, this);
        
        //------------------------------------------------------------------
        
        meteoro8 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro8.png")); 
        g.drawImage(meteoro8.getImage(), csx[7], csy[7], csx[7] + 120 , csy[7] +120, px[7], py[7], 120 + px[7] , 120, this);
        //------------------------------------------------------------------
        
        meteoro9 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro9.png")); 
        g.drawImage(meteoro9.getImage(), csx[8], csy[8], csx[8] + 89 , csy[8] +89, px[8], py[6], 89 + px[8] , 89, this);
        //------------------------------------------------------------------
        
        meteoro10 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro10.png")); 
        g.drawImage(meteoro10.getImage(), csx[9], csy[9], csx[9] + 98 , csy[9] +98, px[9], py[9], 98 + px[9] , 98, this);
        //------------------------------------------------------------------
        
        meteoro11 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro11.png")); 
        g.drawImage(meteoro11.getImage(), csx[10], csy[10], csx[10] + 28 , csy[10] +28, px[10], py[10], 28 + px[10] , 28, this);
        //------------------------------------------------------------------
        
          meteoro12 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro1.png")); 
        g.drawImage(meteoro12.getImage(), csx[11], csy[11], csx[11] + 101 , csy[11] +101, px[11], py[11], 101 + px[11] , 101, this);
      
      // g.drawImage(meteoro1.getImage(), Inicio x, Inicio y, limite en x, Limite y, posicion, posicion, tamaño en x ,Tamaño y, this);
        
        //------------------------------------------------------------------
        
         meteoro13 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro2.png")); 
        g.drawImage(meteoro13.getImage(), csx[12], csy[12], csx[12] + 101 , csy[12] + 101, px[12], py[12], 101 + px[12] , 101, this);
        //------------------------------------------------------------------
        
         meteoro14 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro3.png")); 
        g.drawImage(meteoro14.getImage(), csx[13], csy[13], csx[13] + 19 , csy[13] +19, px[13], py[13], 19 + px[13] , 19, this);
        //------------------------------------------------------------------
        
         meteoro15 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro4.png")); 
        g.drawImage(meteoro15.getImage(), csx[14], csy[14], csx[14] + 90 , csy[14] +85, px[14], py[14], 90 + px[14] , 85, this);
        //------------------------------------------------------------------
        
        meteoro16 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro5.png")); 
        g.drawImage(meteoro16.getImage(), csx[15], csy[15], csx[15] + 98 , csy[15] +98, px[15], py[15], 98 + px[15] , 98, this);
        //------------------------------------------------------------------
        
        meteoro17 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro6.png")); 
        g.drawImage(meteoro17.getImage(), csx[16], csy[16], csx[16] + 43 , csy[16] + 43, px[16], py[16], 43 + px[16] , 43, this);
                
        //------------------------------------------------------------------
        
        meteoro18 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro7.png")); 
        g.drawImage(meteoro18.getImage(), csx[17], csy[17], csx[17] + 101 , csy[17] +101 , px[17], py[17], 101 + px[17] , 101, this);
        
        //------------------------------------------------------------------
        
        meteoro19 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro8.png")); 
        g.drawImage(meteoro19.getImage(), csx[18], csy[18], csx[18] + 120 , csy[18] +120, px[18], py[18], 120 + px[18] , 120, this);
        //------------------------------------------------------------------
        
        meteoro20 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro9.png")); 
        g.drawImage(meteoro20.getImage(), csx[19], csy[19], csx[19] + 89 , csy[19] +89, px[19], py[19], 89 + px[19] , 89, this);
        //------------------------------------------------------------------
        
        meteoro21 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro10.png")); 
        g.drawImage(meteoro21.getImage(), csx[20], csy[20], csx[20] + 98 , csy[20] +98, px[20], py[20], 98 + px[20] , 98, this);
        //------------------------------------------------------------------
        
        meteoro22 = new ImageIcon(getClass().getResource("/recursos/Panel4/Imagenes/meteoro11.png")); 
        g.drawImage(meteoro22.getImage(), csx[21], csy[21], csx[21] + 28 , csy[21] +28, px[21], py[21], 28 + px[21] , 28, this);
        //------------------------------------------------------------------
        planeta1 = new ImageIcon(getClass().getResource("/recursos/Panel4/imagenes/planeta1.png")); 
        g.drawImage(planeta1.getImage(),csx[22],csy[22], csx[22] + 226, csy[22] + 223, px[22],py[22],226 + px[22] , 223 , this);
        
        
     
    }
    
public  ActionListener acciones = new ActionListener(){

        public void actionPerformed(ActionEvent ae) {
            Panel3.cs++; 
            if(Panel3.cs == 100){
                Panel3.cs = 0; 
                Panel3.seg++; 
                
         
                        
            }
            if(Panel3.seg == 60){
                Panel3.seg = 0; 
                Panel3.min++; 
            }
            if (Panel3.min == 60){
                Panel3.min = 0; 
                
            }
            labeltiempo(); 
            
        }
    };
    
    public void labeltiempo(){
      String tiempo2 = (Panel3.min <= 9?"0" : " ") + Panel3.min + ":" + (Panel3.seg <= 9?"0" : " ") + Panel3.seg + ":" + (Panel3.cs<= 9? "0": " ") + Panel3.cs;
      labeltiempo.setText(tiempo2);
     
      
    }
    
    public void choque(){
        
         //METEORO1
        if((x1 + 85  >= csx[0])  && (x1 <= csx[0] + 101)  && (y1 + 67  >= csy[0]) && (y1 <= csy[0] + 75 ) ){
         MeteoroOFF(); 
         arreglos();
          frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }
        
        
        //METEORO2
         if((x1 + 92  >= csx[1])  && (x1 <= csx[1] + 101)  && (y1 + 70  >= csy[1]) && (y1 <= csy[1] + 75 ) ){
         MeteoroOFF(); 
         arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();
      
        

        }
        
         
        //METEORO3
         if((x1 + 92  >= csx[2])  && (x1 <= csx[2] + 18)  && (y1 + 71  >= csy[2]) && (y1 <= csy[2] + 19 ) ){
         MeteoroOFF(); 
          arreglos();
          frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }

        //METEORO4
         if((x1 + 92  >= csx[3])  && (x1 <= csx[3] + 80)  && (y1 + 73  >= csy[3]) && (y1 <= csy[3] + 80 ) ){
                          MeteoroOFF(); 
                          arreglos();
          frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }
        
        //METEORO5
         if((x1 + 92  >= csx[4])  && (x1 <= csx[4] + 95)  && (y1 + 73  >= csy[4]) && (y1 <= csy[4] + 98 ) ){
                          MeteoroOFF(); 

         arreglos(); 
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
        
        //METEORO6
         if((x1 + 92  >= csx[5])  && (x1 <= csx[5] + 40)  && (y1 + 73  >= csy[5]) && (y1 <= csy[5] + 40 ) ){
                          MeteoroOFF(); 

  
             arreglos();
        frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }
       
        
        //METEORO7
         if((x1 + 92  >= csx[6])  && (x1 <= csx[6] + 98)  && (y1 + 73  >= csy[6]) && (y1 <= csy[6] + 98 ) ){
                          MeteoroOFF(); 

         arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }
       
        //METEORO8
         if((x1 + 92  >= csx[7])  && (x1 <= csx[7] + 96)  && (y1 + 73  >= csy[7]) && (y1 <= csy[7] + 115 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }
        
        //METEORO9
         if((x1 + 92  >= csx[8])  && (x1 <= csx[8] + 85)  && (y1 + 70  >= csy[8]) && (y1 <= csy[8] + 85  ) ){
                          MeteoroOFF(); 

             
             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

   
        }
         
        //METEORO10
         if((x1 + 92  >= csx[9])  && (x1 <= csx[9] + 95)  && (y1 + 73  >= csy[9]) && (y1 <= csy[9] + 95 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();


        }
       
        //METEORO11
         if((x1 + 92  >= csx[10])  && (x1 <= csx[10] + 25)  && (y1 + 73  >= csy[10]) && (y1 <= csy[10] + 25 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();


        }
         
        //METEORO12
        if((x1 + 92  >= csx[11])  && (x1 <= csx[11] + 101)  && (y1 + 73  >= csy[11]) && (y1 <= csy[11] + 75 ) ){
                         MeteoroOFF(); 

            arreglos();
        frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }
        
        
        //METEORO13
         if((x1 + 92  >= csx[12])  && (x1 <= csx[12] + 101)  && (y1 + 70  >= csy[12]) && (y1 <= csy[12] + 75 ) ){
                          MeteoroOFF(); 

             arreglos();
        frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

       

        }
        
         
        //METEORO14
         if((x1 + 92  >= csx[13])  && (x1 <= csx[13] + 18)  && (y1 + 71  >= csy[13]) && (y1 <= csy[13] + 19 ) ){
                          MeteoroOFF(); 

             arreglos();
        frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        }

        //METEORO15
         if((x1 + 92  >= csx[14])  && (x1 <= csx[14] + 80)  && (y1 + 73  >= csy[14]) && (y1 <= csy[14] + 80 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
        
        //METEORO16
         if((x1 + 92  >= csx[15])  && (x1 <= csx[15] + 95)  && (y1 + 73  >= csy[15]) && (y1 <= csy[15] + 98 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
        
        //METEORO17
         if((x1 + 92  >= csx[16])  && (x1 <= csx[16] + 40)  && (y1 + 73  >= csy[16]) && (y1 <= csy[16] + 40 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

       
        }
       
        
        //METEORO18
         if((x1 + 92  >= csx[17])  && (x1 <= csx[17] + 98)  && (y1 + 73  >= csy[17]) && (y1 <= csy[17] + 98 ) ){
                          MeteoroOFF(); 

             arreglos();
        frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
       
        //METEORO19
         if((x1 + 92  >= csx[18])  && (x1 <= csx[18] + 96)  && (y1 + 73  >= csy[18]) && (y1 <= csy[18] + 115 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
        
        //METEORO20
         if((x1 + 92  >= csx[19])  && (x1 <= csx[19] + 85)  && (y1 + 70  >= csy[19]) && (y1 <= csy[19] + 85  ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
         
        //METEORO21
         if((x1 + 92  >= csx[20])  && (x1 <= csx[20] + 95)  && (y1 + 73  >= csy[20]) && (y1 <= csy[20] + 95 ) ){
                          MeteoroOFF(); 

             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

        
        }
       
        //METEORO22
         if((x1 + 92  >= csx[21])  && (x1 <= csx[21] + 25)  && (y1 + 73  >= csy[21]) && (y1 <= csy[21] + 25 ) ){
             MeteoroOFF(); 
             arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();

       
        }
         
         if((x1 + 92  >= csx[22])  && (x1 <= csx[22] + 215)  && (y1 + 73  >= csy[22]) && (y1 <= csy[22] + 210 ) ){
         MeteoroOFF(); 
         arreglos();
         frame5 fr = new frame5(); 
         JFrame cont = (JFrame) SwingUtilities.getWindowAncestor(this);
          cont.dispose();
         planetapt = 100000;
       
        } 
          
    }

    public void keyTyped(KeyEvent ke) {}

    public void keyPressed(KeyEvent ke) {
        
       if(x1>= 0 && x1 <= 800 && y1 >= 0 && y1 <= 500){
        
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
        
        if(x1< 0 || x1 + 99 > 800 || y1 < 0 || y1 + 100 > 501){
                 
           
            switch(ke.getKeyCode()){
         
            case KeyEvent.VK_A:

               x1 = x1 +5; 
               break; 
               
           case KeyEvent.VK_D:
               
               x1 = x1-5; 
               break; 
               
           case KeyEvent.VK_W:
               
               y1 = y1+5; 
               break; 
           
           case KeyEvent.VK_S:
               y1 = y1-5; 
               break; 
        }
                }
        
        //choque();
        repaint(); 
        }
       
    }
    
    public void inicioTimers(){
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
                 meteor12.start(); 
                 meteor13.start();
                 meteor14.start(); 
                 meteor15.start();
                 meteor16.start(); 
                 meteor17.start();
                 meteor18.start(); 
                 meteor19.start();
                 meteor20.start(); 
                 meteor21.start(); 
                 meteor22.start();
                 movimiento1.start();
                 movimiento2.start();
                 movimiento3.start();
                 movimiento4.start(); 
    }

    public void keyReleased(KeyEvent ke) {}
    
      private void Font(){
        
        DangerBot = new Font("DangerBot", Font.PLAIN, 60);
        DangerBot2 = new Font("DangerBot", Font.PLAIN, 30);
        fipps = new Font("fipps", Font.PLAIN, 30);

        }
      
      public void MeteoroOFF(){
      tiempo.stop();
      meteor1.stop();
      meteor2.stop();
      meteor3.stop();
      meteor4.stop();
      meteor5.stop();
      meteor6.stop();
      meteor7.stop();
      meteor8.stop();
      meteor9.stop();
      meteor10.stop();
      meteor11.stop();
      meteor12.stop();
      meteor13.stop();
      meteor14.stop();
      meteor15.stop();
      meteor16.stop();
      meteor17.stop();
      meteor18.stop();
      meteor19.stop();
      meteor20.stop();
      meteor21.stop();
      meteor22.stop();
      movimiento1.stop();
      movimiento2.stop();
      movimiento3.stop();
      movimiento4.stop(); 
      
      }
      
}
