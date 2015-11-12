
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class puntos extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	  int marcadorir[]=new int[1000];
	  int marcadoriv[]=new int[1000];
	  int marcadoria[]=new int[1000];
	  int marcadorjr[]=new int[1000];
	  int marcadorjv[]=new int[1000];
	  int marcadorja[]=new int[1000];
	  
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	 int h,v; 


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public puntos(String nombre) {
    	
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
    	
    	
    	
    	
    	
    	
    	//imageName=nombre[1];
    	/*try
    	{
    	this.image2 = ImageIO.read( new File(imageName));
    	}
    	catch ( IOException e )
    	{
    	System.out.println( "image missing" );
    	}*/
    
    	int k;
    	int a;
    	int b;
    	int i;
    	int j;
        int l;	
        	int rojo;
        	int verde;
        	int azul;
        	
        	int rojo2;
        	int verde2;
        	int azul2;
        	
        	
        	
        	int promedio;
        	try{
        		int ancho, alto;
        		alto=image.getHeight();
        		ancho=image.getWidth();
            	for(i=0;i<ancho;i++){
            		for(j=0;j<alto;j++){
            			
            			l=this.image.getRGB(i,j);
            			l=0xFFFFFF+l;
            			 rojo=l/0x10000;
            			
            			 l=l%0x10000;
            			  verde=l/0x100;
            			 
            			 l=l%0x100;
            			  azul=l;
            			  
            			  
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
            			
            			 
            			 //Variables del móvil. Del objeto que se mueve.   
            			 rojo=promedio;
            			 verde=promedio;
            			 azul=promedio;
            			
            			 
            			 if(rojo<2)
               				 rojo=0;
               			 else rojo=255;
               			 if(verde<2)
               				 verde=0;
               			 else verde=255;
               			 if(azul<2)
               				 azul=0;
               			 else azul=255;	
               			 
               			
               			 
               			 
               			 
               			 
               			 
               			rojo2=0xFF;
              			
            			 //k=k%0x10000;
            			  verde2=0xFF;
            			 
            			 //k=k%0x100;
            			  azul2=0xFF;
            			  
            			  rojo=rojo&rojo2;
            			  verde=verde&verde2;
            			  azul=azul&azul2;
               			 
               			 
            			 //printf("")
            			 k=azul+verde*0x100+rojo*0x10000;
            			 
            			 
            			
            			this.image.setRGB(i,j,k);
            	
            		}	
            	}
            	//this.image.setRGB(10,10,0x000000);
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
    
    
 
   public void cambiar_imagen(String nombre[]){
	   imageName=nombre[0];
   	
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
   	imageName=nombre[1];
   	try
   	{
   	this.image2 = ImageIO.read( new File(imageName));
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
       int l;	
       	int rojo;
       	int verde;
       	int azul;
       	
       	int rojo2;
       	int verde2;
       	int azul2;
       	
       	
       	
       	int promedio;
       	try{
       		int ancho, alto;
       		alto=image.getHeight();
       		ancho=image.getWidth();
           	for(i=0;i<ancho;i++){
           		for(j=0;j<alto;j++){
           			k=image.getRGB(i, j);
           			k=0xFFFFFF+k;
           			l=this.image2.getRGB(i,j);
           			l=0xFFFFFF+l;
           			 rojo=l/0x10000;
           			
           			 l=l%0x10000;
           			  verde=l/0x100;
           			 
           			 l=l%0x100;
           			  azul=l;
           			  
           			  
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
           		//Variables del móvil. Del objeto que se mueve.   
           			 rojo=promedio;
           			 verde=promedio;
           			 azul=promedio;
           			
           			 
           			 if(rojo<2)
              				 rojo=0;
              			 else rojo=255;
              			 if(verde<2)
              				 verde=0;
              			 else verde=255;
              			 if(azul<2)
              				 azul=0;
              			 else azul=255;	
              			 
              			//Aquí haces el esqueleto. 
              			 
              			 
              			rojo2=k/0x10000;
             			
           			 k=k%0x10000;
           			  verde2=k/0x100;
           			 
           			 k=k%0x100;
           			  azul2=k;
           			  
           			  rojo=rojo&rojo2;
           			  verde=verde&verde2;
           			  azul=azul&azul2;
              			 
              			 
           			 //printf("")
           			 k=azul+verde*0x100+rojo*0x10000;
           			 
           			 
           			
           			this.image.setRGB(i,j,k);
           	
           		}	
           	}
           	//this.image.setRGB(10,10,0x000000);
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
    	 String n[]=new String[1000];
    	 int c[]=new int[9];
    	
    	  n[0]="C:\\BORLANDC\\BIN\\cimg1106.jpg";
    	  n[1]="C:\\BORLANDC\\BIN\\muneco4.jpg";
    	  
    	  
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new puntos(n[1]),BorderLayout.CENTER );
    	    
    	   
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