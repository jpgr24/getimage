
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;

 public class GetImage extends JPanel{

	 
	  JTextField texto = new JTextField( 20 );
	  JFrame f;
	  JButton boton1 = new JButton( "cargar" );
	  JButton boton2=new JButton("cargar");
	 
	  static BufferedImage image;
	  static BufferedImage image2;

	Image imagen;
	  


	//BufferedImage imagen = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

   static  String imageName;//= "C:\\BORLANDC\\BIN\\CIMG1382.jpg";
    
    
    public GetImage(String nombre) {
    	
    	imageName=nombre;
    	
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
    	
    	
    	
        
    	
    	

  	 //Toolkit tool = Toolkit.getDefaultToolkit();
    	//image = tool.getImage(imageName);	      	    
    	    	    
    	    	  
    		             
    		             

    		            //dialogo.setLocationRelativeTo(f);  

    		            

    }	
    
   /* public BufferedImage get_imagen(){
    	return image;
    
    }*/
 
void brillo(int b){
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
        			 
        			 rojo=rojo+b;
        			 verde=verde+b;
        			 azul=azul+b;
        			 if(azul>=256)
        				 azul=255;
        			 else if(azul<0)
        				 azul=0;
        			 if(verde>=256)
        				 verde=255;
        			 else if(verde<0)
        				 verde=0;
        			 if(rojo>=256)
        				 rojo=255;
        			 else if(rojo<0)
        				 rojo=0;
        			 //printf("")
        			 k= azul+verde*0x100+rojo*0x10000;
        			 
        			 
        			
        			this.image.setRGB(i, j, k);
        			
        	
        		}	
        	}
    	}
    	catch(Exception e){
    		System.out.printf("n");
    	
    	}
    	guardar("c:\\borlandc\\bin\\c");
}


public void posterizacion(int d){
	
	
	
	
	
	try{
		int i;
		int x;
		
		int rojo, verde, azul;
		int j;
		int k;
		int prueba=0;
		
		int y[]=new int[256];
		int z;
		int bo;
		int f;
		int l=255/d;
		for(i=0;i<d;i++)
			   y[i]=l*i;
    	for(x=0;x<image.getWidth();x++){
    		for(z=0;z<image.getHeight();z++){
    			k=image.getRGB(x, z);
    			f=d;
    			  
    				   
    			rojo=k/0x10000;
    			
    			 k=k%0x10000;
    			  verde=k/0x100;
    			 
    			 k=k%0x100;
    			  azul=k;
    			  if(rojo>=256){
    				     rojo=rojo-256;
    				     }
    				     if(verde>=256)
    				      verde=verde-256;
    				      if(azul>=256)
    				      azul=azul-256;
    				      
    				       bo=0;
    				       if(rojo<y[1])
    				           rojo=0; 
    				       else{
    				    	      for(j=1;j<d;j++){
    				    	      
    				    	       if(rojo<y[j]){
    				    	        //printf("Menor\n");
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
    				    	   
    				       if(verde<y[1])
    				           verde=0; 
    				       else{
    				    	      for(j=1;j<d;j++){
    				    	      
    				    	       if(verde<y[j]){
    				    	        //printf("Menor\n");
    				    	        f=j;
    				    	        j=d+1;
    				    	        bo=1;
    				    	        }
    				    	      }
    				    	      if(bo==1)
    				    	       verde=y[d];
    				    	       else
    				    	        verde=255;
    				    	       bo=0;}
    				      
    			   
    				       if(azul<y[1])
    				           azul=0; 
    				       else{
    				    	      for(j=1;j<d;j++){
    				    	      
    				    	       if(azul<y[j]){
    				    	        //printf("Menor\n");
    				    	        f=j;
    				    	        j=d+1;
    				    	        bo=1;
    				    	        }
    				    	      }
    				    	      if(bo==1)
    				    	       azul=y[f];
    				    	       else
    				    	        azul=y[d];
    				    	       bo=0;}

    			 
    			 
    			
    			this.image.setRGB(x, z, k);
    	
	
    	}}}
	catch(Exception e){
		System.out.printf("n");
	
	}

	
	
}

void ecualizar_histograma(){
	
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
try{
	
	for(i=0;i<image.getWidth();i++){
		for(j=0;j<image.getHeight();j++){
			k=image.getRGB(i, j);
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
       int h=image.getHeight(this)/2;
       int w=image.getWidth(this)/2;
        g.drawImage(image, 150, 100,this);
        g.drawImage(this.image2, 150+w+30, 100,w,h,this);
        //g.drawString(imageName, 170, 50);
        


        
    }
    
    public void dilatacion_contraste(int min, int max, int pendiente1, int pendiente2, int pendiente3, int v1, int v2, int v3){
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
            			 
            			  
            				    if(rojo<min)
            				     rojo=rojo*pendiente1;
            				     else{
            				        if(rojo<max)
            				         rojo= pendiente2*(rojo-min)+v1;
            				         else
            				          rojo=pendiente3*(max-rojo)+v2;}


            				  
            				    
            				    
            				    if(verde<min)
               				     verde=verde*pendiente1;
               				     else{
               				        if(verde<max)
               				         verde= pendiente2*(verde-min)+v1;
               				         else
               				          verde=pendiente3*(max-verde)+v2;}


               				  
               				    
               				 if(azul<min)
            				     azul=azul*pendiente1;
            				     else{
            				        if(azul<max)
            				         azul= pendiente2*(azul-min)+v1;
            				         else
            				          azul=pendiente3*(max-azul)+v2;}


            				   
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
    	 String n;
    	 
    	  n="C:\\BORLANDC\\BIN\\CIMG1087.bmp";
    	 
    	 // n[1]="C:\\BORLANDC\\BIN\\sd";
    	    
    	    ventana.addWindowListener( new WindowAdapter() {
    	      public void windowClosing( WindowEvent evt ){
    		System.exit( 0 );
    	      }
    	    } );
    	    ventana.getContentPane().add( new GetImage(n),BorderLayout.CENTER );
    	    
    	   
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