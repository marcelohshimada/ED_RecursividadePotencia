package controller;

public class PotenciaController {

	public PotenciaController() {
		super();
	}
	
	public int pot(int base, int expoente) {
		int cont = 0;
		int res = 1;
		while (cont < expoente) {
			res *= base;
			cont++;
		}
		return res;
	}
	
	
	// Exemplo usando Recursividade
	public int potencia(int base, int expoente) {
		// Condição de parada
		if(expoente == 0) {
			return 1;
		} else {
			expoente--;
			return base * potencia(base, expoente);
		}
		
	}
}
