package MiProyectoClase1;

public class Tp3_1a {

	public static void main(String[] args) {
		String palabra="Palatabilidad";
		int contador=0, posicion=0;
		char caracter = 'a';
		String palabra_min = palabra.toLowerCase();
		posicion = palabra_min.indexOf(caracter);
		
		if (posicion != -1) {
		while (posicion != -1) {
			contador++;
			posicion = palabra.indexOf(caracter, posicion+1);
			
		}
		System.out.println("El caracter \""+caracter+"\" aparece "+ contador+ " veces");

	}

}
}
