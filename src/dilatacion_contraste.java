
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class dilatacion_contraste extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public dilatacion_contraste(){
    	int i;
    	int j;
        	
        	int rojo;
        	int verde;
        	int azul;
        	
        	int k;
        	try{
        		
            	for(i=0;i<image.getWidth();i++){
            		for(j=0;j<image.getHeight();j++){
            			k=image.getRGB(i, j);
            			 rojo=k/0x10000;
            			
            			 k=k%0x10000;
            			  verde=k/0x100;
            			 
            			 k=k%0x100;
            			  azul=k;
            			 
            			  
            				    
            				   
            			 //printf("")
            			 k= azul+verde*0x100+rojo*0x10000;
            			 
            			 
            			
            			this.image.setRGB(i, j, k);
            	
            		}	
            	}
        	}
        	catch(Exception e){
        		System.out.printf("n");
        	
        	}
    }
    
    
 



    public void paint(Graphics g) {

       
    	
 
       
        //image=tool.getImage(imageName);
       int h=image.getHeight(this)/2;
       int w=image.getWidth(this)/2;
        g.drawImage(image, 150, 100,this);
      //  g.drawImage(this.image2, 150+w+30, 100,w,h,this);
        //g.drawString(imageName, 170, 50);
        


        
    }
    
    

    public static void main(String args[]) throws Exception {
    	JFrame ventana = new JFrame( "Image" );
    	//int k=5;
    	 String n[]=new String[2];
    	 int c[]=new int[7];
    	
    	 c[0]=20;
    	 c[1]=9;
    	 c[2]=12;
    	 c[3]=16;
    	 c[4]=24;
    	 c[5]=50;
    	 c[6]=70;
    	  n[0]="C:\\BORLANDC\\BIN\\CIMG1104.jpg";
    	  n[1]="2";
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new dilatacion_contraste(c,n),BorderLayout.CENTER );
    	    
    	   
    	    ventana.setSize( 1000,1000 );
    	    
    	    
    	    ventana.setVisible( true );
    	    
    	    
        
      /*  ventana.addWindowListener( new WindowAdapter() {
          public void windowClosing( WindowEvent evt ){
    	System.exit( 0 );
          }
        } );
        ventana.getContentPane().add( new GetImage(),BorderLayout.CENTER );
        ventana.setSize( 500,500 );
        
        ventana.setVisible( true );
    	
    	/*
    	GetImage image = new GetImage();
        image.setSize(400, 340);
        image.setVisible(true);
        image.setLocation(200, 100);*/
    }
        
    } 	
