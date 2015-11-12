import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class res extends JPanel {

	JTextField texto = new JTextField( 20 );
	 JTextField texto2 = new JTextField(20); 
	 JTextField texto3 = new JTextField(20); 
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  resta imag;
	 String nombre;
	 String brill;
	 int b;
	  public res(){
		  add(texto);
		  add(texto2);
		 add(texto3);
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                           brill=texto2.getText();
                           String t[]=new String[2];
                            t[0]=nombre;
                            t[1]=brill;
                          
                          JFrame ventana = new JFrame( "Open" );
                          //imag=new brillo(nombre,b);
                          imag=new resta(t);
                          ventana.getContentPane().add(imag,BorderLayout.CENTER );
                  	   
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		  add(boton);
		  boton2.addActionListener(new ActionListener() {  

	          public void actionPerformed(ActionEvent e) {  
                   nombre=texto.getText();
                   brill=texto2.getText();
                   String nombre2=texto3.getText();
                   String t[]=new String[3];
                    t[0]=nombre;
                    t[1]=brill;
                    t[2]=nombre2;
                  JFrame ventana = new JFrame( "Open" );
                  //imag=new brillo(nombre,b);
                  imag=new resta(t);
                  ventana.getContentPane().add( imag,BorderLayout.CENTER );
          	     imag.guardar_imagen(t);
           	   
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
	    ventana.getContentPane().add( new res(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 400,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
