
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class posterizacion extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public posterizacion(String nombre, int d) {
    	
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
    	int g, h;
        int bo;	
        int f=0;
        
        	int rojo;
        	int verde;
        	int azul;
        	
        	int promedio;
        	try{
        		int ancho, alto;
        		alto=image.getHeight();
        		ancho=image.getWidth();
            	for(g=0;g<ancho;g++){
            		for(h=0;h<alto;h++){
            			k=image.getRGB(g, h);
            			 k=0xFFFFFF+k;
            			 rojo=k/0x10000;
            			
            			 k=k%0x10000;
            			  verde=k/0x100;
            			 
            			 k=k%0x100;
            			  azul=k;
            			  
            			  
            			    
            			
            			 /*if(promedio<0)
            				 promedio=promedio+128;*/
            			 
            			  int l=255/d;
            			  int y[]=new int[256];
            			  for(i=0;i<d;i++)
            				   y[i]=l*i;

            			  bo=0;
            			  if(rojo<y[1])
            			       rojo=0;
            			       else{
            			      for(j=1;j<d;j++){
            			      
            			       if(rojo<y[j]){

            			        f=j;
            			        j=d+1;
            			        bo=1;
            			        }
            			      }
            			      if(bo==1)
            			       rojo=y[f];
            			       else
            			        rojo=255;
            			       bo=0;}
            			  
            			  bo=0;
            			  if(verde<y[1])
            			       verde=0;
            			       else{
            			      for(j=1;j<d;j++){
            			      
            			       if(verde<y[j]){

            			        f=j;
            			        j=d+1;
            			        bo=1;
            			        }
            			      }
            			      if(bo==1)
            			       verde=y[f];
            			       else
            			        verde=255;
            			       bo=0;}
            			 
            			
            			  if(azul<y[1])
           			       azul=0;
           			       else{
           			      for(j=1;j<d;j++){
           			      
           			       if(azul<y[j]){

           			        f=j;
           			        j=d+1;
           			        bo=1;
           			        }
           			      }
           			      if(bo==1)
           			       azul=y[f];
           			       else
           			        azul=255;
           			       bo=0;}
           			 
            			  

            			   


            			   
            			 //printf("")
            			 k=azul+verde*0x100+rojo*0x10000;
            			 
            			 
            			
            			this.image.setRGB(g,h,k);
            	
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
    
    public void guardar_imagen(String nombre,String nombre2,int d){
    	
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
    	int g, h;
        int bo;	
        int f=0;
        
        	int rojo;
        	int verde;
        	int azul;
        	
        	int promedio;
        	try{
        		int ancho, alto;
        		alto=image.getHeight();
        		ancho=image.getWidth();
            	for(g=0;g<ancho;g++){
            		for(h=0;h<alto;h++){
            			k=image.getRGB(g, h);
            			 k=0xFFFFFF+k;
            			 rojo=k/0x10000;
            			
            			 k=k%0x10000;
            			  verde=k/0x100;
            			 
            			 k=k%0x100;
            			  azul=k;
            			  
            			  
            			    
            			
            			 /*if(promedio<0)
            				 promedio=promedio+128;*/
            			 
            			  int l=255/d;
            			  int y[]=new int[256];
            			  for(i=0;i<d;i++)
            				   y[i]=l*i;

            			  bo=0;
            			  if(rojo<y[1])
            			       rojo=0;
            			       else{
            			      for(j=1;j<d;j++){
            			      
            			       if(rojo<y[j]){

            			        f=j;
            			        j=d+1;
            			        bo=1;
            			        }
            			      }
            			      if(bo==1)
            			       rojo=y[f];
            			       else
            			        rojo=255;
            			       bo=0;}
            			  
            			  bo=0;
            			  if(verde<y[1])
            			       verde=0;
            			       else{
            			      for(j=1;j<d;j++){
            			      
            			       if(verde<y[j]){

            			        f=j;
            			        j=d+1;
            			        bo=1;
            			        }
            			      }
            			      if(bo==1)
            			       verde=y[f];
            			       else
            			        verde=255;
            			       bo=0;}
            			 
            			
            			  if(azul<y[1])
           			       azul=0;
           			       else{
           			      for(j=1;j<d;j++){
           			      
           			       if(azul<y[j]){

           			        f=j;
           			        j=d+1;
           			        bo=1;
           			        }
           			      }
           			      if(bo==1)
           			       azul=y[f];
           			       else
           			        azul=255;
           			       bo=0;}
           			 
            			  

            			   


            			   
            			 //printf("")
            			 k=azul+verde*0x100+rojo*0x10000;
            			 
            			 
            			
            			this.image.setRGB(g,h,k);
            	
            		}	
            	}
        	}
        	catch(Exception e){
        		System.out.printf("n");
        	
        	}
    	
    	
    	
        	int longitud=imageName.length();
            int lon2=longitud-3;
            String formato=imageName.substring(lon2);
            
        	try{
        	
        	ImageIO.write( image, formato /* "png" "jpeg" format desired, no "gif" yet. */, new File ( nombre2+'.'+formato ) /* target */ );
        	}catch ( IOException e )
        	{
            	System.out.println( "image missing" );
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
    	 String n;
    	 
    	 int c=2;
    	
    	  n="C:\\BORLANDC\\BIN\\CIMG1098.bmp";
    	  
    	  
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new posterizacion(n,c),BorderLayout.CENTER );
    	    
    	   
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