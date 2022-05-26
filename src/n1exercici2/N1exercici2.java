package n1exercici2;

public class N1exercici2 {

	public static void main(String[] args) {
		
		Cotxe a = new Cotxe(125);
		
		System.out.println(a.toString());
		
		System.out.println(Cotxe.frenar());
		//Para imprimir un metodo Static lo puedo llamar desde la clase.
		Cotxe.frenar();
		
		System.out.println(a.acelerar());
		//Para poder imprimir un metodo no Static, lo llamo desde el objeto.

	}

}
