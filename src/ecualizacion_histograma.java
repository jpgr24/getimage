
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class ecualizacion_histograma extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public ecualizacion_histograma(String n){
    	
    	
    	
    	int k;	
    	int i;
    	int j;
    	int r[][]=new int[2000][2000]; 
    	int g[][]=new int[2000][2000];
    	int b[][]=new int[2000][2000];
    	int max_r, max_g, max_b;
    	int minimo_r=256;
    	int minimo_g=256;
    	int minimo_b=256;
    	max_r=0;
    	max_g=0;
    	max_b=0;
    	int x,y;
    	imageName=n;
    	try
    	{
    	image = ImageIO.read( new File(imageName));
    	}
    	catch ( IOException e )
    	{
    	System.out.println( "image missing" );
    	}
    	try{
    		
    		for(i=0;i<image.getWidth();i++){
    			for(j=0;j<image.getHeight();j++){
    				k=image.getRGB(i, j);
    				k=0xFFFFFF+k;
    				 r[i][j]=k/0x10000;
    				
    				 k=k%0x10000;
    				  g[i][j]=k/0x100;
    				 
    				 k=k%0x100;
    				  b[i][j]=k;
    				 
    				
    				 //printf("")
    		/*		 k= azul+verde*0x100+rojo*0x10000;
    				 
    				 
    				
    				this.image.setRGB(i, j, k);*/
    		
    			}	
    		}


    	for(i=0;i<image.getWidth();i++){
    		for(j=0;j<image.getHeight();j++){
    			if(minimo_r>r[i][j]){
    			     if(r[i][j]!=0)
    			      minimo_r=r[i][j];}
    			    if(minimo_g>g[i][j]){
    			     if(g[i][j]!=0)
    			      minimo_g=g[i][j];}
    			      if(minimo_b>b[i][j]){
    			     if(b[i][j]!=0)
    			      minimo_b=b[i][j]; }
    			      if(r[i][j]>max_r)
    			       max_r=r[i][j];
    			       if(g[i][j]>max_g)
    			       max_g=g[i][j] ;
    			       if(b[i][j]>max_b)
    			       max_b=b[i][j];
    			 
    			 
    			
    			 //printf("")
    	/*		 k= azul+verde*0x100+rojo*0x10000;
    			 
    			 
    			
    			this.image.setRGB(i, j, k);*/

    		}	
    	}
    	int den_r=max_r-minimo_r;
    	int den_g=max_g-minimo_g;
    	int den_b=max_b-minimo_b;

    	for(i=0;i<image.getWidth();i++){
    		for(j=0;j<image.getHeight();j++){
    			r[i][j]=r[i][j]-minimo_r;
    		    r[i][j]=r[i][j]*(255);
    		    int aux=r[i][j]/den_r;
    		     
    		     r[i][j]=aux;
    		   g[i][j]=g[i][j]-minimo_g;
    		    g[i][j]=g[i][j]*(255);
    		    aux=g[i][j]/den_g;
    		     
    		     g[i][j]=aux;


    		   b[i][j]=b[i][j]-minimo_b;
    		    b[i][j]=b[i][j]*(255);
    		    aux=b[i][j]/den_b;
    		   
    		     b[i][j]=aux;

    			 
    			
    			 //printf("")
    			 k= b[i][j]+g[i][j]*0x100+r[i][j]*0x10000;
    			 
    			 
    			
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
       
        g.drawImage(image, 150, 100,this);
      //  g.drawImage(this.image2, 150+w+30, 100,w,h,this);
        //g.drawString(imageName, 170, 50);
        


        
    }
    
    

    public static void main(String args[]) throws Exception {
    	JFrame ventana = new JFrame( "Image" );
    	//int k=5;
    	 String n;
    	 int c[]=new int[7];
    	
    	 c[0]=20;
    	 c[1]=9;
    	 c[2]=12;
    	 c[3]=16;
    	 c[4]=24;
    	 c[5]=50;
    	 c[6]=70;
    	  n="C:\\BORLANDC\\BIN\\CIMG1087.bmp";
    	  
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new ecualizacion_histograma(n),BorderLayout.CENTER );
    	    
    	   
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
