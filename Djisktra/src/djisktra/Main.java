/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djisktra;

/**
 *
 * @author alexandre.gcazaroes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Grafos grafo = new Grafos();
        
        grafo.criarGrafo(7);
        
        grafo.imprimirGrafo();
        
        grafo.inserirAresta(1, 2, 2);
        grafo.inserirAresta(1, 3, 1);
        grafo.inserirAresta(2, 3, 1);
        grafo.inserirAresta(2, 4, 4);
        grafo.inserirAresta(2, 5, 7);
        grafo.inserirAresta(3, 2, 1);
        grafo.inserirAresta(3, 4, 5);
        grafo.inserirAresta(4, 5, 3);
        grafo.inserirAresta(4, 6, 2);
        grafo.inserirAresta(5, 3, 2);
        grafo.inserirAresta(5, 7, 1);
        grafo.inserirAresta(6, 7, 2);
        
        grafo.imprimirGrafo();
        
        grafo.listaDeVerticesAdjacenciaAoVertice(2);
        
    }
    
}
