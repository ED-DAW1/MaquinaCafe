package daw.ed;


public class Monedero
{
	public static final int[] MONEDAS = {200, 100, 50, 20, 10, 5, 2, 1 };

	public int[] devuelveCambio(int pago, int precio) {
		int cambio = pago - precio;
		int[] devolver = new int[MONEDAS.length];
		for ( int i = 1; i < MONEDAS.length; i++ ) {
			devolver[i] = cambio / MONEDAS[i];
			cambio = cambio % MONEDAS[i];
 		}
 		return devolver;
	}
}