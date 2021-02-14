/**
 * 
 */
package net.tecgurus;

/**
 * @author Cesar
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		//  Tipos de datos primitivos.
		*/
		
		// Valores true o false (Verdadero o Falso).
		boolean variableboolean = true;
		
		// Cantidades desde -128 a 127.
		byte variablebyte = 127;
		
		// Cantidades desde -32768 hasta 32767.
		short variableTres = 32767;
				
		// Caracter simple (Si se ingresa mas de un caracter marca error).
		char variableCuatro = 'a';
		
		// Cantidades desde (mínimo) 4.9E-324 hasta (máximo) 1.7976931348623157E308
		double variableCinco = 1.7976931348623157E308;
		
		// Cantidad desde (mínimo) 1.4E-45 hasta (máximo) 3.4028235E38
		float variableSeis = 3.4028235E38f;
		
		// Cantidad desde (mínimo) -2147483648 hasta (máximo) 2147483647
		int variableSiete = 2147483647;
		
		long variableOcho = 9223372036854775807l;
		
		// Forma de imprimir los valores automaticamente por medio de metodos exceptuando boolean o char.
		System.out.println("Min byte value   = " + Byte.MIN_VALUE);
        System.out.println("Max byte value   = " + Byte.MAX_VALUE);
        System.out.println("Min short value  = " + Short.MIN_VALUE);
        System.out.println("Max short value  = " + Short.MAX_VALUE);
        System.out.println("Min int value    = " + Integer.MIN_VALUE);
        System.out.println("Max int value    = " + Integer.MAX_VALUE);
        System.out.println("Min long value   = " + Long.MIN_VALUE);
        System.out.println("Max long value   = " + Long.MAX_VALUE);
        System.out.println("Min float value  = " + Float.MIN_VALUE);
        System.out.println("Max float value  = " + Float.MAX_VALUE);
        System.out.println("Min double value = " + Double.MIN_VALUE);
        System.out.println("Max double value = " + Double.MAX_VALUE);

	}
}