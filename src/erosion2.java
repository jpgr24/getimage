
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class erosion2 extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public erosion2(String nombre,int x, int y) {
    	
    	imageName=nombre;
    	
    	BufferedImage image2;
    	String aux;
    	
    	
    	
    	
    	//int ancho=image.getWidth();
    	
    	//BufferedImage image = ImageIO.read( new File( imageName ) );
    	try
    	{
    	image = ImageIO.read( new File(imageName));
    	}
    	catch ( IOException e )
    	{
    	System.out.println( "image missing" );
    	}
    	
    
    	int k;
    	int a;
    	int b;
    	int i;
    	int j;
        	
        	int rojo;
        	int verde;
        	int azul;
        	
        	int promedio;
        	try{
        		int ancho, alto;
        		alto=image.getHeight();
        		ancho=image.getWidth();
            	for(i=0;i<ancho;i++){
            		for(j=0;j<alto;j++){
            			k=image.getRGB(i, j);
            			k=0xFFFFFF+k;
            			
            			 rojo=k/0x10000;
            			
            			 k=k%0x10000;
            			  verde=k/0x100;
            			 
            			 k=k%0x100;
            			  azul=k;
            			  
            			  
            			    if(rojo<0)
            				rojo=255+rojo;
            			    if(verde<0)
            				verde=255+verde;
            			    if(azul<0)
            				azul=255+azul;
            				 
            			promedio=azul+verde+rojo;
            			 promedio=promedio/3;
            			 /*if(promedio<0)
            				 promedio=promedio+128;*/
            			 
            			rojo=promedio;
            			 verde=promedio;
            			 azul=promedio;
            			 
            			 
            			 promedio=promedio|0;
            			 if(j==y){
            			 if(i==x-1){
            				 
            					 promedio=promedio|255;
            					 
            				
            			 }
            			 
            			 if(i==x){
            				
            					 promedio=promedio|255;
            					 
            				
            			 }
            			 
            			 if(i==x+1){
            				
            					 promedio=promedio|255;
            					 
            				 
            			 }}
            			 //printf("")
            			 k=promedio+promedio*0x100+promedio*0x10000;
            			 
            			 
            			
            			this.image.setRGB(i,j,k);
            	
            		}	
            	}
        	}
        	catch(Exception e){
        		System.out.printf("n");
        	
        	}
    		
    	/*else if(l==4)
    		posterizacion();*/
        	
    	
        
    
        
    	
    	

  	 //Toolkit tool = Toolkit.getDefaultToolkit();
    	//image = tool.getImage(imageName);	      	    
    	    	    
    	    	  
    		             
    		             

    		            //dialogo.setLocationRelativeTo(f);  

    		            

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
    	 String n;
    	 int c[]=new int[9];
    	
    	  n="C:\\BORLANDC\\BIN\\CIMG1098.jpg";
    	  
    	  
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new erosion2(n,500,400),BorderLayout.CENTER );
    	    
    	   
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