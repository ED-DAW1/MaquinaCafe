package daw.ed;

import java.util.Scanner;

public class Maquina
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        Monedero m = new Monedero();
        Cafetera c = new Cafetera();

        while(true) {
        	int pago;
        	do {
        		System.out.println("Precio del cafe: 133 céntimos.");
        		System.out.println("Introducir importe (en centimos):");
        		pago = s.nextInt();
        	} while ( pago < 133 );

        	//Servir café
        	System.out.println("Sirviendo cafe");
        	c.sirveCafe();

        	//Devolver cambio
        	int[] cambio = m.devuelveCambio(pago, 133);
        	for ( int i = 0; i < cambio.length; i++ ) {
        		if (cambio[i] > 0) {
        			System.out.format("Devuelve %d monedas de %.2f\n",
        				cambio[i],Monedero.MONEDAS[i] / 100.0);
        		}
        	}
        }
    }
}
