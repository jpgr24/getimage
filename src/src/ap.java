import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ap extends JPanel {

	JTextField texto = new JTextField( 20 );
	 JTextField texto2 = new JTextField(3); 
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  imagen imag;
	 String nombre;
	 String brill;
	 int b;
	  public ap(){
		  add(texto);
		 
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                          
                          JFrame ventana = new JFrame( "Open" );
                          //imag=new brillo(nombre,b);
                          ventana.getContentPane().add( new apertura(nombre),BorderLayout.CENTER );
                  	    
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		  add(boton);
		
		  
	  
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
	    ventana.getContentPane().add( new er(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
