
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class dilatacion2 extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public dilatacion2(String nombre,int x, int y) {
    	
    	imageName=nombre;
    	
    	//BufferedImage image2;
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
    	
    	try
    	{
    	image2 = ImageIO.read( new File(imageName));
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
        	
        	int rojo2;
        	int verde2;
        	int azul2;
        	
        	int rojo3;
        	int verde3;
        	int azul3;
        	
        	int promedio;
        	int promedio2;
        	int promedio3;
        	try{
        		int ancho, alto;
        		alto=image.getHeight();
        		ancho=image.getWidth();
        		a=ancho-1;
            	b=alto-1;
            	for(i=0;i<ancho;i++){
            		for(j=0;j<alto;j++){
            			k=image2.getRGB(i, j);
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
            			 
            			 
            			 //promedio=promedio&255;
            			if(i<a){
            				if(j<b){
            					k=image2.getRGB(i+1, j);
                    			k=0xFFFFFF+k;
                    			
                    			 rojo2=k/0x10000;
                    			
                    			 k=k%0x10000;
                    			  verde2=k/0x100;
                    			 
                    			 k=k%0x100;
                    			  azul2=k;
                    			  
                    			  promedio2=azul2+verde2+rojo2;
                     			 promedio2=promedio2/3;
                    			  
                    			  k=image2.getRGB(i+2, j);
                      			k=0xFFFFFF+k;
                      			
                      			 rojo3=k/0x10000;
                      			
                      			 k=k%0x10000;
                      			  verde3=k/0x100;
                      			 
                      			 k=k%0x100;
                      			  azul3=k;
                      			promedio3=azul3+verde3+rojo3;
                   			    promedio3=promedio3/3;
                   			    if(promedio==0){
                   			    	if(promedio2==0){
                   			    		if(promedio3==0){
                   			    			k=promedio+promedio*0x100+promedio*0x10000;
                               			 
                               			 
                   	            			
                   	            			this.image.setRGB(i,j,k);
                   	            			
                                               k=promedio+promedio*0x100+promedio*0x10000;
                               			 
                               			 
                   	            			
                   	            			this.image.setRGB(i+1,j,k);
                   	            			
                                               k=promedio+promedio*0x100+promedio*0x10000;
                               			 
                               			 
                   	            			
                   	            			this.image.setRGB(i+2,j,k);
                   	            			i=i+3;
                   	            			if(i>a){
                   	            				j++;
                   	            				i=0;
                   	            			}
                   			    		}
                   			    	}
                   			    }
                   			 
            				}
            			}else{
            			 //printf("")
            			 k=promedio+promedio*0x100+promedio*0x10000;
            			 
            			 
            			
            			this.image.setRGB(i,j,k);}
            	
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
    	    ventana.getContentPane().add( new dilatacion2(n,360,80),BorderLayout.CENTER );
    	    
    	   
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