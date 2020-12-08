/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Pane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JavaApplication2  extends JFrame {

    
    int yyy;
    
    int t;
    int s1;
    int s2;
    int t2;
    int sizmorp;
    
            ArrayList<Integer> xx = new ArrayList<Integer>(); 


    public void JavaApplication(){
    setTitle("java Graphics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       setSize(s1,s2);
      setLocation(200, 150);

        setVisible(true);
        
    
    }
    
Color b[]={Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.CYAN,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.CYAN,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED,Color.BLACK,
    Color.BLUE,Color.DARK_GRAY,Color.GREEN,Color.RED};
         
    public void paint ( Graphics g){
        
        
        
         int n=yyy;     
          int s=sizmorp/n;
          int time=t;







//////////////////////////////////////////////////////////////
int f1=(int) s/5;
int f3=(int) s/4;
int f2= (int)s/10;
int c=0;



        int m[][]=new int[80][80];

int t11[]=new int[80];
int t22[]=new int[80];
int ttt=0;
for(int i=1;i<=n;i++){
    
for(int j=1;j<=n;j++){
    
g.drawRect(i*s+s,j*s+s, s,s);
t11[ttt]=i;
t22[ttt]=j;
ttt++;
}
 
}



/////////////////////////////////////////////////////////////
      int aa[]=new int[25];

    //ArrayList<Integer> xx=new ArrayList<Integer>();
////////////////////////////////////////////////////////
 Random r=new Random();

 
int c1[]=new int[20];
ArrayList<Integer> ar = new ArrayList<Integer>();
ArrayList<Integer> ar2 = new ArrayList<Integer>();

 int j=0;
 int i=0;
 int t=0;
for(int i1=1;i1<1000;i1++){
    
    
    
    
   
   i=r.nextInt(n+1);
          if(i==0){i=1;}
          
          
         j=r.nextInt(n+1);
          
          if(j==0){j=1;}
          
        m[i][j]=1;

      
                       
             if(i1!=1 ){

 
              
                 
                 
                 
                 
                 
                 
                 
         if( ((c1[0]-1==i)&&(c1[1]-1==j))
              ||((c1[0]==i)&&(c1[1]-1==j))
              ||((c1[0]+1==i)&&(c1[1]-1==j))             
              ||((c1[0]+1==i)&&(c1[1]==j))
              ||((c1[0]+1==i)&&(c1[1]+1==j))
              ||((c1[0]==i)&&(c1[1]+1==j))
              ||((c1[0]-1==i)&&(c1[1]+1==j))
              ||((c1[0]-1==i)&&(c1[1]==j))
                    )
   {
       
       

       
       
   
           
       
 c1[0]=i;
 c1[1]=j;
    
            
                     
              
//c++;
             
        
              
              //2.3.5.
              
g.setColor(b[c]);
g.fillRect(i*s+s,j*s+s, s,s);
g.setColor(Color.WHITE);

//g.setColor(b[c+1]);

g.drawOval(i*s+s+f2+s/f2-f2,j*s+s, s/2,s-f2);
//i*s+s+f2
g.drawOval(i*s+s+f2+s/f2,j*s+s+2*f2, s/2-s*f2/f3,s-s*f2/f3);
g.drawOval(i*s+s+f2+s/f2+2*f2,j*s+s+2*f2, s/2-s*f2/f3,s-s*f2/f3);


g.drawLine(i*s+s+f2+s/f2+5*f2/3,j*s+s,i*s+s+f2+s/f2+5*f2/3,(s-s*f2/f3)+(j*s+s+s/4+f2-f3/6));


g.drawOval(i*s+s+f2+s/f2+f2/3,j*s+s+f2/2, s/2-s*f2/f3+f2/f3,s/2-s*f2/f3);
g.drawOval(i*s+s+f2+s/f2+2*f2+f2/3,j*s+s+f2/2, s/2-s*f2/f3,s/2-s*f2/f3);

g.drawLine(i*s+s+f2+s/f2-2*f2,j*s+s+(s/2)-f2, i*s+s+f2+s/f2-f2/2,j*s+s+f1);


g.drawLine(i*s+s+f2+s/f2-2*f2,j*s+s+s/2+f1+f2/2,i*s+s+f2+s/f2-f2,j*s+s+s/2+f2);  


g.drawLine(i*s+s+f2+s/f2-2*f2+s/2+f2/2,j*s+s+f1-f2/2,i*s+s+f2+s/f2-2*f2+s/2+2*f2,j*s+s+s/2-f2);
g.drawLine(i*s+s+f2+s/f2-2*f2+s/2+f2,j*s+s+s/2+f2,i*s+s+f2+s/f2-2*f2+s/2+2*f2,j*s+s+s/2+2*f1-f2);

 try {
                  Thread.sleep(time);
              } catch (InterruptedException ex) {
                  Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
              }          

   g.setColor(b[c]);
             
  g.fillRect(i*s+s,j*s+s, s,s);
   g.setColor(b[0]);

  g.drawRect(i*s+s,j*s+s, s,s);

   c++;
if(c==b.length-1){
c=0;

}
    
   /*
         
         int y7=0;
         for(int i5=0;i5<=n*n;i5++){
         y7= y7+m[t11[i5]][t22[i5]];
         }
         if(y7==n*n){
         
g.drawString("اكتمل", 50, 50);
break;
         }*/
   
   }

            
 /////////////////////////////////////////////////////////////////////////////////////////////             
if(i1==1){
 
 c1[0]=i;
 c1[1]=j;
 
   
c++;
             
        
              
              //2.3.5.
              
g.setColor(b[c]);
g.fillRect(i*s+s,j*s+s, s,s);
g.setColor(b[c]);
g.setColor(Color.WHITE);

//g.setColor(b[c+1]);

g.drawOval(i*s+s+f2+s/f2-f2,j*s+s, s/2,s-f2);
//i*s+s+f2
g.drawOval(i*s+s+f2+s/f2,j*s+s+2*f2, s/2-s*f2/f3,s-s*f2/f3);
g.drawOval(i*s+s+f2+s/f2+2*f2,j*s+s+2*f2, s/2-s*f2/f3,s-s*f2/f3);


g.drawLine(i*s+s+f2+s/f2+5*f2/3,j*s+s,i*s+s+f2+s/f2+5*f2/3,(s-s*f2/f3)+(j*s+s+s/4+f2-f3/6));


g.drawOval(i*s+s+f2+s/f2+f2/3,j*s+s+f2/2, s/2-s*f2/f3+f2/f3,s/2-s*f2/f3);
g.drawOval(i*s+s+f2+s/f2+2*f2+f2/3,j*s+s+f2/2, s/2-s*f2/f3,s/2-s*f2/f3);

g.drawLine(i*s+s+f2+s/f2-2*f2,j*s+s+(s/2)-f2, i*s+s+f2+s/f2-f2/2,j*s+s+f1);


g.drawLine(i*s+s+f2+s/f2-2*f2,j*s+s+s/2+f1+f2/2,i*s+s+f2+s/f2-f2,j*s+s+s/2+f2);  


g.drawLine(i*s+s+f2+s/f2-2*f2+s/2+f2/2,j*s+s+f1-f2/2,i*s+s+f2+s/f2-2*f2+s/2+2*f2,j*s+s+s/2-f2);
g.drawLine(i*s+s+f2+s/f2-2*f2+s/2+f2,j*s+s+s/2+f2,i*s+s+f2+s/f2-2*f2+s/2+2*f2,j*s+s+s/2+2*f1-f2);

 try {
                  Thread.sleep(1000);
              } catch (InterruptedException ex) {
                  Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
              }          

   g.setColor(b[c]);
             
  g.fillRect(i*s+s,j*s+s, s,s);
   g.setColor(b[0]);

   g.drawRect(i*s+s,j*s+s, s,s);

   c++;
if(c==b.length-1){
c=0;

}}
             
      }
    
    }}
    
            
   //     }
    
    //////////////////////////////////////////////////////////////////////////////////////////


    
    
    
    
    
    
    
              
    
    
    
    public static void main(String[] args) {

        
        
        
        
        
        
        
        
     
 JFrame f = new JFrame("The Twilight Zone");
   f.setSize(600, 300);
   f.setLocation(100, 150);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //f.setDefaultLookAndFeelDecorated(true);
   
   JLabel labelM = new JLabel(" Number of jump boxes ");
   labelM.setBounds(200, 50, 200, 30);
   JTextField motto1 = new JTextField();
   motto1.setBounds(150, 50, 50, 30);
   motto1.setText("2");
    JLabel label2 = new JLabel("speed  step  milliseconds");
   label2.setBounds(200, 100, 200, 30);
   JTextField motto2 = new JTextField();
   motto2.setText("100");
   motto2.setBounds(150, 100, 50, 30);
 ///////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
JLabel labelM2 = new JLabel("Frame size ");
   labelM2.setBounds(450, 50, 200, 30);
   JTextField motto12 = new JTextField();
   motto12.setBounds(550, 50, 30, 30);
    JTextField motto123 = new JTextField();
   motto123.setBounds(510, 50, 30, 30);
   
      motto123.setText("1000");

   motto12.setText("800");
    JLabel label22 = new JLabel("Duration of the introduction ");
   label22.setBounds(400, 100, 200, 30);
   JTextField motto22 = new JTextField();
   motto22.setText("100");
   motto22.setBounds(550, 100, 30, 30);
   
   
    JLabel s = new JLabel("area  squares /it number ");
   s.setBounds(430, 140, 200, 30);
   JTextField s2 = new JTextField();
   s2.setText("400");
   s2.setBounds(400, 140, 30, 30);
   
   s2.setVisible(false);
   s.setVisible(false);
   labelM2.setVisible(false);
   motto12.setVisible(false);
   label22.setVisible(false);
   motto22.setVisible(false);

    motto123.setVisible(false);

 //////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

   f.add(s);
      f.add(s2);

   f.add(labelM);
      f.add(motto123);

   f.add(motto1);
  
   
    f.add(label2);
   f.add(motto2);
              f.add(labelM2);
   f.add(motto12);
   
   f.add(motto22);
      f.add(label22);
     
   f.setLayout(null);
   f.setVisible(true);
JButton b = new JButton("start");
b.setBounds(150, 150, 100, 30);

JButton b2 = new JButton("Advanced settings");
b2.setBounds(470, 10, 100, 30);

JButton b3 = new JButton("hide");
b3.setBounds(470, 180, 100, 30);
f.add(b);
f.add(b2);
f.add(b3);
b3.setVisible(false);
 b2.addActionListener( new ActionListener() 
              
    {
        //حدث زر الاعدادات المتقدم\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
        public void actionPerformed(ActionEvent e)
            {  
      
    labelM2.setVisible(true);
   motto12.setVisible(true);
   label22.setVisible(true);
   motto22.setVisible(true);
   motto123.setVisible(true);
s.setVisible(true);
   s2.setVisible(true);
b3.setVisible(true);

                
            }
    });
 
 
 
 b3.addActionListener( new ActionListener() 
              
    {
        //حدث زر الاعدادات المتقدم\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
        public void actionPerformed(ActionEvent e)
            {  
  labelM2.setVisible(false);
   motto12.setVisible(false);
   label22.setVisible(false);
   motto22.setVisible(false);
   motto123.setVisible(false);
s.setVisible(false);
   s2.setVisible(false);
b3.setVisible(false);

                
            }
    });
//////////////////////////حدث زر ابدا
   b.addActionListener( new ActionListener() 
              
    {
        
        
        
        
        
        
        
        
        
        
        public void actionPerformed(ActionEvent e)
            {          
           
int h=Integer.parseInt(motto1.getText());
int tt=Integer.parseInt(motto2.getText());
int h1=Integer.parseInt(motto123.getText());
int h2=Integer.parseInt(motto12.getText());
int t2=Integer.parseInt(motto22.getText());
int smo=Integer.parseInt(s2.getText());

  JavaApplication2 i =  new JavaApplication2();

  //if(motto1.getText()==null){motto1.setText("1");}
  i.s1=h1;
  i.s2=h2;
  i.t=t2;
  i.yyy=h;
  i.sizmorp=smo;
 i.t=tt;
 
 
                         f.setVisible(false);

             i.JavaApplication();
                

            }
    });
            }

    
    

    
    
    
}

  

    



