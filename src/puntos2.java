
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class puntos2 extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;
	  static BufferedImage image3;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public puntos2(String nombre) {
    	
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
    	
    	
    	
    	
    
    	try{
    		int k;
        	int a;
        	int b;
        	int i;
        	int j;
            	
            	int rojo;
            	int verde;
            	int azul;
            	
            	int dif1;
            	int dif2;
            	//br=ancho-1;
    		int ancho, alto;
    		int rojo2;
    		int verde2;
    		int azul2;
    		int rojo3;
    		int verde3;
    		int azul3;
    		int l;
    		int promedio;
    		alto=image.getHeight();
    		ancho=image.getWidth();
    		a=ancho-1;
    		b=alto-1;
    		
        	for(i=0;i<ancho;i++){
        		for(j=0;j<alto;j++){
        			k=image.getRGB(i, j);
        			k=0xFFFFFF+k;
        			
        			 rojo=k/0x10000;
        			
        			 k=k%0x10000;
        			  verde=k/0x100;
        			 
        			 k=k%0x100;
        			  azul=k;
        			  
        			  
        			 
        				 
        			
        			 
        			if(i!=a){
        				if(j!=b){
        					k=image.getRGB(i+1, j+1);
                			k=0xFFFFFF+k;
                			
                			 rojo2=k/0x10000;
                			
                			 k=k%0x10000;
                			  verde2=k/0x100;
                			 
                			 k=k%0x100;
                			  azul2=k;
                			  
                			  rojo=rojo-rojo2;
                			  if(rojo<0)
                				  rojo=-rojo;
                			  verde=verde-verde2;
                			  if(verde<0)
                				  verde=-verde;
                			  azul=azul-azul2;
                			  if(azul<0)
                				  azul=-azul;
                			  
                			  k=image.getRGB(i, j+1);
                  			k=0xFFFFFF+k;
                  			
                  			 rojo2=k/0x10000;
                  			
                  			 k=k%0x10000;
                  			  verde2=k/0x100;
                  			 
                  			 k=k%0x100;
                  			  azul2=k;
                  			l=image.getRGB(i+1, j);
                  			l=0xFFFFFF+l;
                  			
                  			 rojo3=l/0x10000;
                  			
                  			 l=l%0x10000;
                  			  verde3=l/0x100;
                  			 
                  			 l=l%0x100;
                  			  azul3=l;
                  			  rojo2=rojo2-rojo3;
                  			  if(rojo2<0)
                  				  rojo2=-rojo2;
                  			  verde2=verde2-verde3;
                  			  if(verde2<0)
                  				  verde2=-verde2;
                  			  azul2=azul2-azul3;
                  			  if(azul2<0)
                  				  azul2=-azul2;
                  			  rojo=rojo+rojo2;
                  			  verde=verde+verde2;
                  			  azul=azul+azul2;
                  		
                  			  rojo=255-rojo;
                  			  verde=255-verde;
                  			  azul=255-azul;
                  			  
                  			  
                  			  
                  			  
                  			  
                  			  
                  			  
                  			  
        					
        				}
        				
        			}
        			
        			
        			promedio=azul+verde+rojo;
       			 promedio=promedio/3;
       			 /*if(promedio<0)
       				 promedio=promedio+128;*/
       			
       			 
       			 //Variables del m�vil. Del objeto que se mueve.   
       			 rojo=promedio;
       			 verde=promedio;
       			 azul=promedio;
       			 
       			 
       			 if(rojo<240)
       				 rojo=0;
       			 else rojo=255;
       			 if(verde<240)
       				 verde=0;
       			 else verde=255;
       			 if(azul<240)
       				 azul=0;
       			 else azul=255;
       			 
       			 
       			 
       			 
//
       			l=this.image2.getRGB(i,j);
    			l=0xFFFFFF+l;
    			 rojo2=l/0x10000;
    			
    			 l=l%0x10000;
    			  verde2=l/0x100;
    			 
    			 l=l%0x100;
    			  azul2=l;
    			  
    			  
    			    if(rojo2<0)
    				rojo2=255+rojo;
    			    if(verde2<0)
    				verde2=255+verde;
    			    if(azul2<0)
    				azul2=255+azul2;
    			    
    			   
    			promedio=azul2+verde2+rojo2;
    			 promedio=promedio/3;
    			 /*if(promedio<0)
    				 promedio=promedio+128;*/
    			
    			 
    			 //Variables del m�vil. Del objeto que se mueve.   
    			 rojo2=promedio;
    			 verde2=promedio;
    			 azul2=promedio;
    			
    			 
    			 if(rojo2<2)
       				 rojo2=0;
       			 else rojo2=255;
       			 if(verde2<2)
       				 verde2=0;
       			 else verde2=255;
       			 if(azul2<2)
       				 azul2=0;
       			 else azul2=255;	
       			 
       			
       			 
       			 
       			 
       			 
       			 
       			/*rojo2=0xFF;
      			
    			 //k=k%0x10000;
    			  verde2=0xFF;
    			 
    			 //k=k%0x100;
    			  azul2=0xFF;*/
    			  
    			  rojo=rojo&rojo2;
    			  verde=verde&verde2;
    			  azul=azul&azul2;
    			   
    			  
    			  
         			    
//
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
       			 
        			
        			 //printf("")
        			 k=azul+verde*0x100+rojo*0x10000;
        			 
        			 
        			
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
    
    
 void cambiar_imagen(String nombre[]){
	 
	 imageName=nombre[0];
	 	
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
	 	
	 	imageName=nombre[1];
	   	try
	   	{
	   	this.image3 = ImageIO.read( new File(imageName));
	   	}
	   	catch ( IOException e )
	   	{
	   	System.out.println( "image missing" );
	   	}
	   	
	   	
	   	
	   	try{
			int k;
	    	int a;
	    	int b;
	    	int i;
	    	int j;
	        	
	        	int rojo;
	        	int verde;
	        	int azul;
	        	
	        	int dif1;
	        	int dif2;
	        	//br=ancho-1;
			int ancho, alto;
			int rojo2;
			int verde2;
			int azul2;
			int rojo3;
			int verde3;
			int azul3;
			int l;
			int promedio;
			alto=image.getHeight();
			ancho=image.getWidth();
			a=ancho-1;
			b=alto-1;
			
	    	for(i=0;i<ancho;i++){
	    		for(j=0;j<alto;j++){
	    			k=image.getRGB(i, j);
	    			k=0xFFFFFF+k;
	    			
	    			 rojo=k/0x10000;
	    			
	    			 k=k%0x10000;
	    			  verde=k/0x100;
	    			 
	    			 k=k%0x100;
	    			  azul=k;
	    			  
	    			  
	    			 
	    				 
	    			
	    			 
	    			if(i!=a){
	    				if(j!=b){
	    					k=image.getRGB(i+1, j+1);
	            			k=0xFFFFFF+k;
	            			
	            			 rojo2=k/0x10000;
	            			
	            			 k=k%0x10000;
	            			  verde2=k/0x100;
	            			 
	            			 k=k%0x100;
	            			  azul2=k;
	            			  
	            			  rojo=rojo-rojo2;
	            			  if(rojo<0)
	            				  rojo=-rojo;
	            			  verde=verde-verde2;
	            			  if(verde<0)
	            				  verde=-verde;
	            			  azul=azul-azul2;
	            			  if(azul<0)
	            				  azul=-azul;
	            			  
	            			  k=image.getRGB(i, j+1);
	              			k=0xFFFFFF+k;
	              			
	              			 rojo2=k/0x10000;
	              			
	              			 k=k%0x10000;
	              			  verde2=k/0x100;
	              			 
	              			 k=k%0x100;
	              			  azul2=k;
	              			l=image.getRGB(i+1, j);
	              			l=0xFFFFFF+l;
	              			
	              			 rojo3=l/0x10000;
	              			
	              			 l=l%0x10000;
	              			  verde3=l/0x100;
	              			 
	              			 l=l%0x100;
	              			  azul3=l;
	              			  rojo2=rojo2-rojo3;
	              			  if(rojo2<0)
	              				  rojo2=-rojo2;
	              			  verde2=verde2-verde3;
	              			  if(verde2<0)
	              				  verde2=-verde2;
	              			  azul2=azul2-azul3;
	              			  if(azul2<0)
	              				  azul2=-azul2;
	              			  rojo=rojo+rojo2;
	              			  verde=verde+verde2;
	              			  azul=azul+azul2;
	              		
	              			  rojo=255-rojo;
	              			  verde=255-verde;
	              			  azul=255-azul;
	              			  
	              			  
	              			  
	              			  
	              			  
	              			  
	              			  
	              			  
	    					
	    				}
	    				
	    			}
	    			
	    			
	    			promedio=azul+verde+rojo;
	   			 promedio=promedio/3;
	   			 /*if(promedio<0)
	   				 promedio=promedio+128;*/
	   			
	   			 
	   			 //Variables del m�vil. Del objeto que se mueve.   
	   			 rojo=promedio;
	   			 verde=promedio;
	   			 azul=promedio;
	   			 
	   			 
	   			 if(rojo<240)
	   				 rojo=0;
	   			 else rojo=255;
	   			 if(verde<240)
	   				 verde=0;
	   			 else verde=255;
	   			 if(azul<240)
	   				 azul=0;
	   			 else azul=255;
	   			 
	   			 
	   			 
	   			 
	//
	   			l=this.image2.getRGB(i,j);
				l=0xFFFFFF+l;
				 rojo2=l/0x10000;
				
				 l=l%0x10000;
				  verde2=l/0x100;
				 
				 l=l%0x100;
				  azul2=l;
				  
				  
				    if(rojo2<0)
					rojo2=255+rojo2;
				    if(verde2<0)
					verde2=255+verde2;
				    if(azul2<0)
					azul2=255+azul2;
				    
				   
				promedio=azul2+verde2+rojo2;
				 promedio=promedio/3;
				 /*if(promedio<0)
					 promedio=promedio+128;*/
				
				 
				 //Variables del m�vil. Del objeto que se mueve.   
				 rojo2=promedio;
				 verde2=promedio;
				 azul2=promedio;
				
				 
				 if(rojo2<2)
	   				 rojo2=0;
	   			 else rojo2=255;
	   			 if(verde2<2)
	   				 verde2=0;
	   			 else verde2=255;
	   			 if(azul2<2)
	   				 azul2=0;
	   			 else azul2=255;	
	   			 
	   			
	   			 
	   			 
	   			 
	   			 
	   			 
	   			/*rojo2=0xFF;
	  			
				 //k=k%0x10000;
				  verde2=0xFF;
				 
				 //k=k%0x100;
				  azul2=0xFF;*/
				  
				  rojo=rojo&rojo2;
				  verde=verde&verde2;
				  azul=azul&azul2;
				   
				  l=this.image3.getRGB(i,j);
	     			l=0xFFFFFF+l;
	     			 rojo2=l/0x10000;
	     			
	     			 l=l%0x10000;
	     			  verde2=l/0x100;
	     			 
	     			 l=l%0x100;
	     			  azul2=l;
	     			  
	     			  
	     			    if(rojo2<0)
	     				rojo2=255+rojo2;
	     			    if(verde2<0)
	     				verde2=255+verde2;
	     			    if(azul2<0)
	     				azul2=255+azul2;
	     			    
	     			    
	     			      rojo=rojo&rojo2;
	        			  verde=verde&verde2;
	        			  azul=azul&azul2;
				  
	     			    
	//
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	   			 
	    			
	    			 //printf("")
	    			 k=azul+verde*0x100+rojo*0x10000;
	    			 
	    			 
	    			
	    			this.image.setRGB(i,j,k);
	    	
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
    	 String n;
    	 int c=180;
    	
    	  n="C:\\BORLANDC\\BIN\\muneco2.jpg";
    	  
    	  
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new puntos2(n),BorderLayout.CENTER );
    	    
    	   
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