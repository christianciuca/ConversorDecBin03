package controlador;

import modelo.Numero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("actualizacion");
		
		
		Numero n1 = new Numero(23);
		
		String binario = n1.ConvertirDecimal(50);
		System.out.println(binario);

	}

}
