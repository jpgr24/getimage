import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class result extends JPanel {

	JTextField texto = new JTextField( 20 );
	 JTextField texto2 = new JTextField(3); 
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Ready");
	  imagen imag;
	 String nombre[]=new String[100];
	 String brill;
	 int b;
	 
	  public result(){
		  b=0;
		  add(texto);
		  boton.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
                   nombre[b]=texto.getText();
                  b++;
                  JFrame ventana = new JFrame( "Open" );
                  //imag=new brillo(nombre,b);
               
          		
	           }  

	       });  
		  
		  add(boton);
		  
		  boton2.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           
                          
                          JFrame ventana = new JFrame( "Open" );
                          //imag=new brillo(nombre,b);
                          ventana.getContentPane().add( new resultante(nombre,b),BorderLayout.CENTER );
                  	    
                   	   
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
	    ventana.getContentPane().add( new result(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
