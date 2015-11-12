import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class g extends JPanel {

	JTextField texto = new JTextField( 20 );
	JTextField texto2 = new JTextField( 20 );
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  gris imag;
	 String nombre, nombre2;
	  public g(){
		  add(texto);
		  add(texto2);
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                          JFrame ventana = new JFrame( "Open" );
                          
                          ventana.getContentPane().add( new gris(nombre),BorderLayout.CENTER );
                  	    
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		  add(boton);
		  
		  boton2.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
                   nombre=texto.getText();
                   nombre2=texto.getText();
                   
                  JFrame ventana = new JFrame( "Open" );
                  imag=new gris(nombre);
                ventana.getContentPane().add( imag,BorderLayout.CENTER );
          	    imag.guardar_imagen(nombre, nombre2);
           	   
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
	    ventana.getContentPane().add( new g(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
