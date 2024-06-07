
public class Principal {
	public static void main(String[] args) {
		Grafo objGrafo = new Grafo(80000);
		
		objGrafo.criar(true);
		
		//objGrafo.imprimir();
		
		objGrafo.procurarVerticeMaiorGrau();
	}
}
