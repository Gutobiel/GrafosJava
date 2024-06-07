import java.util.Scanner;

public class Grafo {
	//propriedades da classe
	private int qtdVertices = 0;
	private boolean [][] matriz = null;
	
	//método construtor da classe
	public Grafo(int qtdVertices) {
		this.qtdVertices = qtdVertices;
		matriz = new boolean[qtdVertices][qtdVertices];
	}
	
	//métodos da classe
	public void criar(boolean aleatorio) {
		Scanner leitor = new Scanner(System.in);
		for (int i = 0; i < (qtdVertices - 1); i++) {
			for (int j = (i + 1); j < qtdVertices; j++) {
				boolean adjacencia = (((int)(2 * Math.random())) == 0);
				if(!aleatorio) {
					System.out.println("digite <S> se " + i + "for adjacente a " + j + ":");
					adjacencia = leitor.next().equalsIgnoreCase("S");
				}
				matriz[i][j] = adjacencia;
				matriz[j][i] = adjacencia;
			}
		}
		leitor.close();
	}
	
	public void imprimir() {
		System.out.println("Vertice\tAdjacências");
		for (int i = 0; i < (qtdVertices - 1); i++) {
			System.out.print(i + "\t");
			for (int j = 0; j < qtdVertices; j++) {
				if(matriz[i][j]) {
					System.out.print(j + ", ");
				}
			}
			System.out.println();
		}
	}
	public void procurarVerticeMaiorGrau() {
		int maiorGrau = 0;
		int vertice = 0;
		for (int i = 0; i < qtdVertices; i++) {
			int contador = 0;
			for (int j = 0; j < qtdVertices; j++) {
				if(matriz[i][j]) {
					contador++;
				}
			}
			if(contador > maiorGrau) {
				maiorGrau = contador;
			}
		}
		System.out.println("O vértice mais popular é" + vertice + "com grau" + maiorGrau);
	}
		
	}
