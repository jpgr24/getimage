import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class fond extends JPanel {

	JTextField texto = new JTextField( 20 );
	 JTextField texto2 = new JTextField(20); 
	  JButton boton = new JButton( "Open" );
	  JButton boton2 = new JButton("Save");
	  imagen imag;
	 String nombre;
	 String brill;
	 int b;
	  public fond(){
		  add(texto);
		  add(texto2);
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombre=texto.getText();
                           brill=texto2.getText();
                           String t[]=new String[2];
                            t[0]=nombre;
                            t[1]=brill;
                          JFrame ventana = new JFrame( "Open" );
                          //imag=new brillo(nombre,b);
                          ventana.getContentPane().add( new fondo(t),BorderLayout.CENTER );
                  	    
                   	   
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
	    ventana.getContentPane().add( new fond(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
