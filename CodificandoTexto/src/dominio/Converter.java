package dominio;


import java.util.ArrayList;

public class Converter {
	private int tamanho;
	private int [] vetorNumerico;
	private int [] vetorCodificado = new int[8];
	private ArrayList <Convertido> convertido = new ArrayList <Convertido>();
	private int[][] matriz = new int[32][32];
	 
	public Converter(String informacao, int tamanhoInfor){
		this.tamanho = tamanhoInfor;
		vetorNumerico = new int[tamanho];
		for(int i=0; i<tamanho; i++) {
			vetorNumerico[i] = ((int)informacao.charAt(i));	
		}
	}
	
	public void converterNumInBi() {
		int[] vetorBase = {128,64,32,16,8,4,2,1};
		for(int i=0; i < tamanho; i++) { 
			    int  contAux = 0;		
			    int[] vetorBitsAux  = {0,0,0,0,0,0,0,0};
			while(vetorNumerico[i] != 0 && contAux < 8) {
				contAux++;
				if(vetorNumerico[i]- vetorBase[contAux] >= 0) {
					vetorNumerico[i] -= vetorBase[contAux];
					vetorBitsAux[contAux] = 1;	
					
				}
				 
			}
			
			Convertido c1 = new Convertido(vetorBitsAux);
			convertido.add(c1);

		}
	}

	public ArrayList<Convertido> getConvertido() {
		return convertido;
	}
	
	public void ocuparMatriz() {
		int cont = 0;
		for(int i=0; i < tamanho; i++) {
			vetorCodificado = convertido.get(i).getValores();		
			for(int l=0; l < 32; l++) {
				for(int c=0; c < 32; c++) {	
					if(cont < tamanho) {
						matriz[l][c] = vetorCodificado[cont];
						cont++;
					}
				}
			}
		}
	}
	
	
	public int[][] getMatriz() {
		return matriz;
	}

}