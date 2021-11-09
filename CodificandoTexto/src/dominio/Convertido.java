package dominio;

public class Convertido {
	private int[] valores = new int[8];

	
	public Convertido(int[] vetorBitsAux) {
		this.valores = vetorBitsAux;
	}

	public int[] getValores() {
		return valores;
	}
	
}
