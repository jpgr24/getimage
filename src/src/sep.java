import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class sep extends JPanel {

	JTextField texto = new JTextField( 20 );
	  
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  cepia imag;
	 String nombre;
	  public sep(){
		  add(texto);
		  
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                          JFrame ventana = new JFrame( "Open" );
                          imag=new cepia(nombre);
                        ventana.getContentPane().add( imag,BorderLayout.CENTER );
                  	    
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		  add(boton);
		
		  
	  
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
	    ventana.getContentPane().add( new sep(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
