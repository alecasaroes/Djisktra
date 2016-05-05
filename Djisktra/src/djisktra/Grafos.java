package djisktra;

/**
 *
 * @author alexandre.gcazaroes
 * 
 */
public class Grafos {
    
    private int numeroDeVertices;
    private int matrizAdjacente[][];
    
    Grafos () {
    }
    
    public void criarGrafo (int numeroDeVertices) {
        this.numeroDeVertices = numeroDeVertices;
        matrizAdjacente = new int [numeroDeVertices][numeroDeVertices];
        for (int i = 0; i < matrizAdjacente.length; i++) {
            for (int j = 0; j < matrizAdjacente[0].length; j++) {
                matrizAdjacente[i][j] = -1;
            }
        }
        
        System.out.println("GRAFO CRIADO COM SUCESSO!\n");
    }

    public void inserirAresta (int verticeOrigem, int verticeDestino, int peso) {
        System.out.println("OPERACAO SOLICITADA: Inserir aresta de v" + verticeOrigem + " à v" + verticeDestino);
        matrizAdjacente[verticeOrigem-1][verticeDestino-1] = peso;
        System.out.println("ARESTA INSERIDA COM SUCESSO!\n");
    }
    
    public void removerAresta (int verticeOrigem, int verticeDestino) {
        System.out.println("OPERACAO SOLICITADA: Remover aresta de v" + verticeOrigem + " à v" + verticeDestino);
        matrizAdjacente[verticeOrigem-1][verticeDestino-1] = 0;
        System.out.println("ARESTA REMOVIDA COM SUCESSO!\n");
    }
    
    public void existeAresta (int verticeOrigem, int verticeDestino) {
        System.out.println("OPERACAO SOLICITADA: Existe aresta de v" + verticeOrigem + " à v" + verticeDestino + "?");
        if(matrizAdjacente[verticeOrigem-1][verticeDestino-1] == 1)
            System.out.println("EXISTE ARESTA DE v" + verticeOrigem + " à v" + verticeDestino);
        else
            System.out.println("NÃO EXISTE ARESTA DE v" + verticeOrigem + " à v" + verticeDestino);
    }
    
    public Fila2 listaDeVerticesAdjacenciaAoVertice (int vertice) {
        Fila2 listaDeAdjacencia = new Fila2();
        for (int i = 0; i < numeroDeVertices; i++) {
            if (matrizAdjacente[vertice-1][i] > -1)
                listaDeAdjacencia.push(matrizAdjacente[vertice-1][i]);
        }
        return listaDeAdjacencia;
    }
    
    public void imprimirGrafo () {
        System.out.print("    ");
        for (int k = 0; k < numeroDeVertices; k++) 
            System.out.print("v" + (k+1) + "  ");
        System.out.println("");
        for (int i = 0; i < matrizAdjacente.length; i++){
            System.out.print("v" + (i+1) + " [ " + matrizAdjacente[i][0]);
            for (int j = 1; j < matrizAdjacente[0].length; j++){
                System.out.print(", " + matrizAdjacente[i][j]);
            }
            System.out.print(" ]\n");
        }
        System.out.println("");
    }

    public int getNumeroDeVertices () {
        return numeroDeVertices;
    }
    
}


