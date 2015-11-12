
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;

 public class and extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;
	 // static BufferedImage adicion;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
   static String imageName2; 
   
    
    public and(String nombre[]) {
    	
    	imageName=nombre[0];
    	imageName2=nombre[1];
    	
    	BufferedImage image2;
    	String aux;
    	
    	int alto;
    	int ancho;
    	
    	
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
    	this.image2 = ImageIO.read( new File(imageName2));
    	}
    	catch ( IOException e )
    	{
    	System.out.println( "image missing" );
    	}
    	
    	
    	int j;
    
    	/*else if(l==4)
    		posterizacion();*/
        	
    	int k;
    	int a;
    	int b;
    	int i;
    	int l;
    	
        	
        	int rojo;
        	int verde;
        	int azul;
        	int rojo2;
        	int verde2;
        	int azul2;
        	
        	int promedio;
        	try{
        	
        		alto=image.getHeight();
        		ancho=image.getWidth();
        		a=this.image2.getHeight();
        		b=this.image2.getWidth();
            	for(i=0;i<ancho;i++){
            		for(j=0;j<alto;j++){
            			k=image.getRGB(i, j);
            			k=0xFFFFFF+k;
            			l=this.image2.getRGB(i,j);
            			l=0xFFFFFF+l;
            			 rojo=k/0x10000;
            			
            			 k=k%0x10000;
            			  verde=k/0x100;
            			 
            			 k=k%0x100;
            			  azul=k;
            			  
            			  rojo2=l/0x10000;
              			
             			 l=l%0x10000;
             			  verde2=l/0x100;
             			 
             			 l=l%0x100;
             			  azul2=l;
             			  
             			  rojo=rojo&rojo2;
             			  verde=verde&verde2;
             			  azul=azul&azul2;
            			
            			
            			 /*if(promedio<0)
            				 promedio=promedio+128;*/
            			 
            			
            			 
            			 
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
    	    	    
    	    	  
    		             
    		             

        
        
    	
    	

  	 //Toolkit tool = Toolkit.getDefaultToolkit();
    	//image = tool.getImage(imageName);	      	    
    	    	    
    	    	  
    		             
    		             

    		            //dialogo.setLocationRelativeTo(f);  

    		            

    }	            
 

	
public void guardar_imagen(String nombre[]){
	imageName=nombre[0];
	imageName2=nombre[1];
	
	BufferedImage image2;
	String aux;
	
	int alto;
	int ancho;
	
	
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
	this.image2 = ImageIO.read( new File(imageName2));
	}
	catch ( IOException e )
	{
	System.out.println( "image missing" );
	}
	
	
	int j;

	/*else if(l==4)
		posterizacion();*/
    	
	int k;
	int a;
	int b;
	int i;
	int l;
	
    	
    	int rojo;
    	int verde;
    	int azul;
    	int rojo2;
    	int verde2;
    	int azul2;
    	
    	int promedio;
    	try{
    	
    		alto=image.getHeight();
    		ancho=image.getWidth();
    		a=this.image2.getHeight();
    		b=this.image2.getWidth();
        	for(i=0;i<ancho;i++){
        		for(j=0;j<alto;j++){
        			k=image.getRGB(i, j);
        			k=0xFFFFFF+k;
        			l=this.image2.getRGB(i,j);
        			l=0xFFFFFF+l;
        			 rojo=k/0x10000;
        			
        			 k=k%0x10000;
        			  verde=k/0x100;
        			 
        			 k=k%0x100;
        			  azul=k;
        			  
        			  rojo2=l/0x10000;
          			
         			 l=l%0x10000;
         			  verde2=l/0x100;
         			 
         			 l=l%0x100;
         			  azul2=l;
         			 
         			  rojo=rojo&rojo2;
         			  verde=verde&verde2;
         			  azul=azul&azul2;
        			
        			
        			 /*if(promedio<0)
        				 promedio=promedio+128;*/
        			 
        			
        			 
        			 
        			k=azul+verde*0x100+rojo*0x10000;
        			this.image.setRGB(i,j,k);
        	
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
    	
    	ImageIO.write( image, formato /* "png" "jpeg" format desired, no "gif" yet. */, new File ( nombre[2]+'.'+formato ) /* target */ );
    	}catch ( IOException e )
    	{
        	System.out.println( "image missing" );
        	}
	
}


	








    public void paint(Graphics g) {

       
    	
 
       
        //image=tool.getImage(imageName);
      
        g.drawImage(image, 150, 100,this);
       
        //g.drawString(imageName, 170, 50);
        


        
    }
    
    
    
    
    public static void guardar(String n){
    	
    	int longitud=imageName.length();
        int lon2=longitud-3;
        String formato=imageName.substring(lon2);
        
    	try{
    	
    	ImageIO.write( image, formato /* "png" "jpeg" format desired, no "gif" yet. */, new File ( n+'.'+formato ) /* target */ );
    	}catch ( IOException e )
    	{
        	System.out.println( "image missing" );
        	}
      
    }

    public static void main(String args[]) throws Exception {
       
        
    	JFrame ventana = new JFrame( "Image" );
    	//int k=5;
    	 String n[]=new String[2];
    	 int c[]=new int[9];
    	 c[0]=4;
    	 c[1]=4;
    	 c[2]=20;
    	 c[3]=9;
    	 c[4]=12;
    	 c[5]=15;
    	 c[6]=2;
    	 c[7]=5;
    	 c[8]=7;
    	  n[0]="C:\\Documents and Settings\\Usuario\\Mis documentos\\Mis imágenes\\11311\\cimg19541.jpg";
    	  n[1]="C:\\Documents and Settings\\Usuario\\Mis documentos\\Mis imágenes\\11311\\reservoir_dogs.jpg";
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new and(n),BorderLayout.CENTER );
    	    
    	   
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