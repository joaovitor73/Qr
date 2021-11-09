package visao;

import java.util.Scanner;
import java.util.ArrayList;
import dominio.Converter;

public class Main {

	public static void main(String[] args) {
		
		Converter c1;
		ArrayList <Converter> converter = new ArrayList <Converter>();
		int[][] matriz = new int[32][32];
		Scanner input = new Scanner(System.in);
		String nome;
		int op;
		
		do {
	
			System.out.println("---------------------------------------------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("---------------------------------------------------------");
			System.out.println("1 - DIGITAR TEXTO");
			System.out.println("2 - SAIR");
		    System.out.println("---------------------------------------------------------");
		    op = input.nextInt();
		    input.nextLine();
		    
		    switch(op) {
		    case 1:
		    	System.out.println("\nDigite um conjunto de caracteres: ");
				nome = input.nextLine();
				c1 = new Converter(nome,nome.length());
				converter.add(c1);
				c1.converterNumInBi();
				matriz  = c1.getMatriz();
				c1.ocuparMatriz();
				for(int y=0; y < 32; y++) {
					for(int z=0; z < 32; z++) {
						 System.out.print(matriz[y][z]);
					}
						System.out.print("\n");
				}
				System.out.println("tamanho: "+nome.length());
		    	break;
		    case 2: System.out.println("saindo...");
		    	break;
		    default: System.out.println("Número inválido, digite novamente!!");
		    }
	
		}while(op != 3);
		
	}

}
