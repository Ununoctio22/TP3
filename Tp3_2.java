package MiProyectoClase1;

public class Tp3_2 {

	public static void main(String[] args) {
		String lista = "Lucia,Lorena,Victoria,Camila,Belen,Ana,Florencia,Amanda,Julieta,Rocio";

		String listaSplit[] = lista.split(",");

		for (String elemento : listaSplit) { 
			System.out.println(elemento);
		}

		

	}

}
