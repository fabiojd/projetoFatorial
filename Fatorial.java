public class Fatorial {
	/* metodo iterativo do calculo Fatorial */
	public int calcularFatorial(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException ("n�o existe fatorial para n�meros negativos");
		}
		else {
		int resultado = 1;	
		for (int i= 2; i <= n; i++) {
				resultado *= i;
			}
		return resultado;
		}		
	}
}