import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class sil extends JPanel {

	JTextField texto = new JTextField( 20 );
	JTextField texto2 = new JTextField( 20 ); 
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  silueta imag;
	 String nombre, nombre2;
	  public sil(){
		  add(texto);
		  add(texto2);
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                          JFrame ventana = new JFrame( "Open" );
                          imag=new silueta(nombre);
                        ventana.getContentPane().add( imag,BorderLayout.CENTER );
                  	    
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		  add(boton);
		  boton2.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
                   nombre=texto.getText();
                   nombre2=texto2.getText();
                   
                  JFrame ventana = new JFrame( "Open" );
                  imag=new silueta(nombre);
                ventana.getContentPane().add( imag,BorderLayout.CENTER );
          	    imag.guardar_imagen(nombre, nombre2);
           	   
          	    ventana.setSize( 1000,1000 );
          	    
          	    
          	    ventana.setVisible( true );
          		
	           }  

	       });  


		  
		  
		  add(boton);
		  
		  add(boton2);
		  
	  
	  }
	  
	  public String get_nombre(){
		  return nombre; 
	  
	  }
	  
	  public imagen get_imagen(){
	    return imag;
	  }
	
	
	public static void main(String[] args) {
		JFrame ventana = new JFrame( "Open" );
    	
   	 
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new sil(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
