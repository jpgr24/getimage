import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class p extends JPanel {

	JTextField texto = new JTextField( 20 );
	 JTextField texto2 = new JTextField(3);
	 JTextField texto3 = new JTextField(20); 
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  posterizacion imag;
	 String nombre, nombre2;
	 String brill;
	 int b;
	  public p(){
		  add(texto);
		  add(texto2);
		  add(texto3);
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                           brill=texto2.getText();
                           b=Integer.parseInt(brill);
                          JFrame ventana = new JFrame( "Open" );
                          //imag=new brillo(nombre,b);
                          ventana.getContentPane().add( new posterizacion(nombre,b),BorderLayout.CENTER );
                  	    
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		  add(boton);
		  
		  boton2.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
	        	  nombre=texto.getText();
	        	  nombre2=texto3.getText();
                  brill=texto2.getText();
                  b=Integer.parseInt(brill);
                 JFrame ventana = new JFrame( "Open" );
                 imag=new posterizacion(nombre,b);
                 //imag=new brillo(nombre,b);
                 ventana.getContentPane().add( imag,BorderLayout.CENTER );
                 imag.guardar_imagen(nombre, nombre2, b);
         	    
          	   
         	    ventana.setSize( 1000,1000 );
         	    
         	    
         	    ventana.setVisible( true );
         		
	           }  

	       }); 
          		
	          
		
		  add(boton2);
		  
		  
		
		  
	  
	  }
	  
	  public String get_nombre(){
		  return nombre; 
	  
	  }
	
	
	public static void main(String[] args) {
		JFrame ventana = new JFrame( "Open" );
    	
   	 
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new p(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
