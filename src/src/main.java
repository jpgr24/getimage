import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;


public class main extends JPanel {

	/**
	 * @param args
	 */
	
	JButton boton1=new JButton("Open");
	JButton boton2=new JButton("Save");
	JButton boton3 = new JButton("Brightness");
	JButton boton4=new JButton("histogram equalization");
	JButton boton5 =new JButton("Grays scales");
	JButton boton6 =new JButton("Negative");
	JButton boton7 =new JButton("Posterization");
	JButton boton8=new JButton("Sum");
	JButton boton9=new JButton("Prewitt");
	JButton boton10=new JButton("Sobel");
	JButton boton11=new JButton("Robert");
	JButton boton12=new JButton("Structurant Element");
	JButton boton13=new JButton("Dilatation");
	JButton boton14=new JButton("Erosion");
	JButton boton15=new JButton("Opening");
	JButton boton16=new JButton("Close");
	JButton boton17=new JButton("Top hat positive");
	JButton boton18=new JButton("Top hat negative");
	
	static String imageName;
	BufferedImage image;
	imagen im;
	static abrir a;
	int abierto;
	public main(){
		abierto=0;
		imageName="   ";
		boton1.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
                 a=new abrir();
                JFrame ventana = new JFrame( "Open" );
                ventana.getContentPane().add( a,BorderLayout.CENTER );
        	    imageName=a.get_nombre();
        	    System.out.print(imageName);
        	    im=a.get_imagen();
         	   abierto=1;
        	    ventana.setSize( 300,100 );
        	    
        	    
        	    ventana.setVisible( true );

	           }  

	       });
		
		


add(boton1);
boton2.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Save" );
      ventana.getContentPane().add( new guardar(imageName),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton2);


boton3.addActionListener(new ActionListener() {  

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

boton9.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new pr(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton9);

boton10.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new sb(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton10);

boton11.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new rb(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton11);

boton12.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new ee(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 400,400 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton12);

boton13.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new dil(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton13);

boton14.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new er(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton14);

boton15.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new ap(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton15);

boton16.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new cl(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton16);

boton17.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new thp(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton17);

boton18.addActionListener(new ActionListener() {  

    public void actionPerformed(ActionEvent e) {  
      
      JFrame ventana = new JFrame( "Open" );
      ventana.getContentPane().add( new thn(),BorderLayout.CENTER );
	   
	   abierto=1;
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

     }  

 });

add(boton18);

	}	
	public static void main(String[] args) {
		
JFrame ventana = new JFrame( "Image" );
    	
   	 
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new central(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 600,200 );
	    
	    
	    ventana.setVisible( true );

	}
		

	}


