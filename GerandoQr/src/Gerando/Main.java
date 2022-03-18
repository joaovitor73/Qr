package Gerando;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	
		String link = JOptionPane.showInputDialog("Digite um link: ");

		Conversao c = new Conversao(link); 
		c.caracToAscii();
		c.decimaToBinari();
		
		Qr q1 = new Qr(c.retorCodifica());
        
		//criaando janela GUI
	     JFrame jf = new JFrame();
	     
	     //Colocando cor de fundo
	     jf.setBackground(Color.LIGHT_GRAY);
	     
		//Permitindo fechar a janela
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adicionando objeto a janela
		
		jf.add(q1);
		//Tamanho da janela
		jf.setSize(400,400);
			
		//tornando a janela visivel
		jf.setVisible(true);
	

	}

}
