package Gerando;

public class Conversao {
	private String link;
	private int asciiLink[];
	private int codificado[];
	
	public Conversao(String s) {
		link = s;
		// vetor para armazenar a segmentação e conversao em ascii do link
	    asciiLink = new int[link.length()]; 
	    codificado = new int[link.length()*8];
	}
	
	public void caracToAscii() {
		for(int i = 0; i < link.length();i++) { 
			asciiLink[i] = (int) link.charAt(i); 
		}
	}
	
	public void decimaToBinari() {
		int cont = 0;
		for(int i = 0; i < link.length();i++) {
			String valorBin = "0";
			//depois colocar um break quando o asciiLink[i] == 0
			for(int j = 128; j >= 1; j/=2) { // DECIMAL PARA OS BITS EQUIVALENTES
				if(asciiLink[i]-j >=0) {
					asciiLink[i]-=j;
                    valorBin = "1";
				}else {
					valorBin = "0";
				}
				codificado[cont] = Integer.parseInt(valorBin);
				cont++;
			}
		}
	}
	
	public int[] retorCodifica() {
		return codificado;
	}

}
