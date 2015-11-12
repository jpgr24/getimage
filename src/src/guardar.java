import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;
import javax.imageio.*;

import java.io.*;
import java.awt.image.*;
public class guardar extends JPanel {

	JTextField texto = new JTextField( 20 );
	  
	 
	  JButton boton = new JButton("Save");
	  String nombres[]=new String[2];
	  public guardar(String n){
		 add(texto);
		  
		 nombres[0]=n;
		  
		  
		  boton.addActionListener(new ActionListener() {  

			          public void actionPerformed(ActionEvent e) {  
                           nombres[1]=texto.getText();
                          JFrame ventana = new JFrame( "Save" );
                          ventana.getContentPane().add( new guardar_imagen(nombres),BorderLayout.CENTER );
                  	    
                   	   
                  	    ventana.setSize( 1000,1000 );
                  	    
                  	    
                  	    ventana.setVisible( true );
                  		
			           }  

			       });  


		  
		  
		 add(boton);
		
		  
	  
	  }
	
	
	public static void main(String[] args) {
		JFrame ventana = new JFrame( "Save" );
    	
   	 String u;
   	 u="c:\\borlandc\\bin\\cimg1098.bmp";
   	 
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new guardar(u),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );

	}

}
