/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djisktra;

/**
 *
 * @author Fabio
 */
public class Fila2 {

    private static final int tamanhoFila = 10;
    
    private int itens[];
    
    private int total;
    
    public Fila2 () {
        itens = new int[tamanhoFila];
        total = 0;
    }
    
    public void push (int valor) {
        if ( isFull ()) {
            System.out.println("queue full");
            return;
        }            
        int indice = total;
        total +=1;
        itens[indice]= valor;
    }
    
    public boolean isEmpty () {
        if (total == 0)
            return true;
        return false;
    }
    
    public boolean isFull () {
        if ( (total) >= tamanhoFila) {
            return true;
        }
        return false;
    }
    
    public int peek () {
        return itens[0];  
    }
    
    public int pop () {
        if (isEmpty()) {
            System.out.println("queue empty");
            return 0;
        }
        int valor = itens[0];
        for (int i=0; i< (total-1); i+=1)
            itens[i]=itens[i+1];
        total-=1;
        return valor;
    }
    
}
