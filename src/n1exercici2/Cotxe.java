package n1exercici2;

public class Cotxe {
	private static final String marca	= "Fiat";
	//Tenia que asignarle valor desde el principio ya que afecta a 
	//toda la clase por el Static, y su valor no se puede cambiar por el Final.
	private static String modelo;
	//Esta variable afecta su valor para toda la clase, pero se peude cambiar
	//en algun metodo.
	private final int potencia; 
	//Solo la variable final la pude inicializar en el contructor.
	
	public Cotxe(int potencia) {
		modelo	= "500XL";
		this.potencia 	= potencia;
	}

	public static String getMarca() {
		return marca;
	}

	public static String getModelo() {
		return modelo;
	}

	public int getPotencia() {
		return potencia;
	}
	
	public static String frenar(){
		return "El vehicle està frenant";
	}
	
	public String acelerar(){
		return "El vehicle està accelerant";
	}

	@Override
	public String toString() {
		return "Cotxe: " +"\n"+"Marca: "+marca +"\n" 
	+"Modelo: "+modelo + "\n"+"Potencia: "+this.potencia;
	}

}
