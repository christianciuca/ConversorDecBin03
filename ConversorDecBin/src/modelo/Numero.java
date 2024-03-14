package modelo;

public class Numero {
	
	private int decimal;
	private int binario;
	
	public Numero(int decimal) {
		this.decimal=decimal;
	}
	
	public String ConvertirDecimal(int numero) {
		if (decimal == 0) {
            return "0";
        }
		
		 String binary = "";
		 
		 while (decimal > 0) {
	            int remainder = (int) (numero % 2); 
	            binary = remainder + binary; 
	            decimal /= 2; 
	        }
	        
	        return binary;
		 
	}

}
