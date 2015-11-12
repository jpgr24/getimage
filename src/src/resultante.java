
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class resultante extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image[]=new BufferedImage[100];
	  static BufferedImage image2;
	  int tamano;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public resultante(String nombre[],int n) {
    	
    	
    	tamano=n;
    	BufferedImage image2;
    	String aux;
    	
    	int k;
    	int a;
    	int b;
    	int i;
    	int j;
        int l;	
        int s;
        	int rojo;
        	int verde;
        	int azul;
    	int r[]=new int[256];
    	int g[]=new int[256];
    	int bl[]=new int[256];
    	int mayor_r;
    	int mayor_g;
    	int mayor_b;
    	for(i=0;i<256;i++){
    		r[i]=0;
    		g[i]=0;
    		bl[i]=0;
    	}
    	
    	//int ancho=image.getWidth();
    	
    	//BufferedImage image = ImageIO.read( new File( imageName ) );
    	for(i=0;i<n;i++){
    		imageName=nombre[i];
    	try
    	{
    	image[i] = ImageIO.read( new File(imageName));
    	}
    	catch ( IOException e )
    	{
    	System.out.println( "image missing" );
    	}
    	}
    
    	
        	int alto, ancho;
        	alto=480;
        	ancho=640;
        	k=0;
        	int promedio;
        	
        	try{
        		
        		rojo=0;
        		verde=0;
        		azul=0;
        		
            	for(i=0;i<640;i++){
            		for(j=0;j<480;j++){
            			for(s=0;s<256;s++){
            				r[s]=0;
            				g[s]=0;
            				bl[s]=0;
            			}
            			mayor_r=0;
            			mayor_g=0;
            			mayor_b=0;
            			for(l=0;l<n;l++){
            				
            			k=image[l].getRGB(i, j);
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
            				 
            			r[rojo]++;
            			g[verde]++;
            			bl[azul]++;
            			for(s=0;s<256;s++){
            				if(r[s]>r[mayor_r])
            					mayor_r=s;
            				if(g[mayor_g]<g[s])
            					mayor_g=s;
            				if(bl[mayor_b]<bl[s])
            					mayor_b=s;}
            					
            			
            			 /*if(promedio<0)
            				 promedio=promedio+128;*/
            			
            			
            			 //printf("")
            			rojo=mayor_r;
            			verde=mayor_g;
            			azul=mayor_b;
            			 k=azul+verde*0x100+rojo*0x10000;
            			
            			
            			
            			this.image[l].setRGB(i,j,k);
            			}
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
      // int h=image2.getHeight(this)/2;
      // int w=image2.getWidth(this)/2;
        g.drawImage(image[tamano-1], 150, 100,this);
      //  g.drawImage(this.image2, 150+w+30, 100,w,h,this);
        //g.drawString(imageName, 170, 50);
        


        
    }
    
    

    public static void main(String args[]) throws Exception {
       
        
    	JFrame ventana = new JFrame( "Image" );
    	//int k=5;
    	 String n[]=new String[100];
    	 int c[]=new int[9];
    	
    	  n[0]="C:\\BORLANDC\\BIN\\CIMG1098.jpg";
    	  n[1]="C:\\BORLANDC\\BIN\\CIMG10981.bmp";
    	  n[2]="C:\\BORLANDC\\BIN\\CIMG10982.bmp";
    	  
    	  
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new resultante(n,3),BorderLayout.CENTER );
    	    
    	   
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