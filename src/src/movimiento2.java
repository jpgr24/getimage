import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class movimiento2 extends JPanel {

	JTextField texto = new JTextField( 20 );
	  
	  JButton boton = new JButton( "mover" );
	 // JButton boton2 = new JButton("Save");
	  static puntos4 imag;
	 static String nombre=new String();
	 static JFrame ventana;
	 static JFrame ima;
	 int i,j;
	 String n[] = new String[100];
	 Timer tim;
	int t;
	static ActionListener act;
	  public movimiento2(/*String nombres,int tam*/){
		  //add(texto);
		 t=2;
		 
		  i=t;
		  j=0;
		 // int k=0;
		 //n[0]="c:\\borlandc\\bin\\cimg1098.jpg";
		  n[1]="muneco.jpg";
		  n[2]="muneco.jpg";
		  n[3]="muneco.jpg";
		  n[4]="muneco.jpg";
		  n[5]="muneco.jpg";
		  n[6]="muneco2.jpg";
		  n[7]="muneco2.jpg";
		  n[8]="muneco2.jpg";
		  n[9]="muneco2.jpg";
		  n[10]="muneco2.jpg";
		  n[11]="muneco3.jpg";
		  n[12]="muneco4.jpg";
		  n[13]="muneco3.jpg";
		  n[14]="muneco4.jpg";
		  n[15]="muneco4.jpg";
		  n[16]="muneco5.jpg";
		  n[17]="muneco5.jpg";
		  n[18]="muneco9.jpg";
		  n[19]="muneco5.jpg";
		  n[20]="muneco5.jpg";
		  n[21]="muneco6.jpg";
		  n[22]="muneco6.jpg";
		  n[23]="muneco9.jpg";
		  n[24]="muneco9.jpg";
		  /*n[25]="muneco25.jpg";
		  n[26]="muneco25.jpg";
		  n[27]="muneco25.jpg";
		  n[28]="muneco25.jpg";
		  n[29]="muneco25.jpg";
		  n[30]="muneco25.jpg";*/
		 /* for(i=0;i<t;i++){
		    n[i]=nombres[i];
		  }*/
		  i=1;
		  //nombre[0]=n[0];
		  //imag=new imagen(n[0]);
		  
		  
		 
                   
          	    
          	    t=25;
          	    i=1;

          		
	             

	        
		  
		  
		  
		  
		   act = new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				 nombre=n[0];
			   if(j==0){
				   //nombre[0]=n[0];
				   nombre=n[1];
				  imag=new puntos4(nombre);
				  
				  ima = new JFrame( "Open" );
				  j=1;
				  i=1;
				  //i++;
			   }
			   else{
				   ima.setVisible(false);
				   nombre=n[i];
				   imag.cambiar_imagen(nombre);}
				   i++;
				   //System.out.println(n[i]);
				   if(i==t)
					   tim.stop();
				   
			  
				   ima.getContentPane().add( imag,BorderLayout.CENTER );
		       	    
	          	   
	         	   ima.setSize( 1000,1000 );
	         	    
	         	    
	         	    ima.setVisible( true );
			   
			  
			   }
			
			  
			  };
			  
         	   
			   
			tim=new Timer(300,act);   
			//tim.stop();
			
			  //while(true) { ;}
			 
			tim.start();
		  
		


		  
		  
		
		  tim = new Timer(300, act);
		  tim.start();
		  
	  
	  }
	  
	 /* public String get_nombre(){
		  return nombre; 
	  
	  }*/
	
	
	public static void main(String[] args) {
		//String nombre;
		//nombre="c:\\borlandc\\bin\\cimg1098.jpg";
		  
		ventana = new JFrame( "Open" );
    	//ima = new JFrame("Imagen");
    	
    	
    	
   	 //Timer t=new Timer(600,act);
	    
	    ventana.addWindowListener( new WindowAdapter() {
	      public void windowClosing( WindowEvent evt ){
		System.exit( 0 );
	      }
	    } );
	    ventana.getContentPane().add( new movimiento2(),BorderLayout.CENTER );
	    
	   
	    ventana.setSize( 300,100 );
	    
	    
	    ventana.setVisible( true );
	    
	    

	}

}
