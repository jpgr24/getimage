import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;


public class central2 extends JPanel {

	/**
	 * @param args
	 */
	
	JButton boton1=new JButton("Movement without background");
	
	JButton boton2 = new JButton("Show marker");
	
	JButton boton3 = new JButton("Sepia");
	
	JButton boton4 = new JButton("Shape");
	
	JButton boton5 = new JButton("Caricature");
	
	JButton boton6 = new JButton("Background");
	
	
	static String imageName;
	 static imagen imag;
	 static String nombre;
	 static JFrame ventana;
	 static JFrame ima;
	 movimiento m;
	 int abierto;
	public central2(){
		abierto=0;
		boton1.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
	        	  ventana = new JFrame( "Open" );
	          	//ima = new JFrame("Imagen");
	          	
	          	
	          	
	         	 //Timer t=new Timer(600,act);
	      	    
	      	    ventana.addWindowListener( new WindowAdapter() {
	      	      public void windowClosing( WindowEvent evt ){
	      		System.exit( 0 );
	      	      }
	      	    } );
	      	    ventana.getContentPane().add( new movimiento2(),BorderLayout.CENTER );
	      	    
	      	   
	      	    ventana.setSize( 300,100 );
        	    
        	    
        	    

	           }  

	       });
		
		


add(boton1);


boton2.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Show marker" );
      ventana.getContentPane().add( new marcador(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton2);

boton3.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Sepia" );
      ventana.getContentPane().add( new sep(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton3);

boton4.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Silueta" );
      ventana.getContentPane().add( new sil(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton4);

boton5.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Caricatura" );
      ventana.getContentPane().add( new car(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 100,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton5);

boton6.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Fondo" );
      ventana.getContentPane().add( new fond(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 100,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton6);


/*boton3.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new br(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton3);

boton4.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new eq(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton4);

boton5.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new g(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton5);

boton6.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new n(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton6);

boton7.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new p(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton7);

boton8.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new sum(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton8);


*/

	}	
	public static void main(String[] args) {
		
		ventana = new JFrame( "Open" );
    	ima = new JFrame("Imagen");
    	
    	
    	
   	 
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new central2(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,200 );
	    
	    
	    ventana.setVisible( true );
		

	}

}
