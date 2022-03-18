package Gerando;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Qr extends JPanel {
	private int codifi[];
	
	public Qr(int[] con) {
		codifi = con;		
	}

	
	public void paint(Graphics g){
	    g.fillRect(50, 50, 230, 230);
	   
	    int cont = 0;
	 
	    for(int i = 50; i <= 270; i+=14) {
	    	for(int j = 50; j <= 270; j+=14) {      		
	    	    if(cont < codifi.length) {
	    	    	cont++; 
		    	    if(codifi[cont-1] == 1 ) {
	                    g.clearRect(j,i, 14, 14);
	                   // System.out.print(1);
		    	    }else {
		    	    	//System.out.print(0);
		    	    }
		    	} else {
		    		// System.out.print(0);
		    	}
	       		
	    	}
	    	 //System.out.print("\n");
	    }
	}

}
