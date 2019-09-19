/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author mfpasold
 */
public class Servidor extends Thread{
 
    private static LinkedList<String> fila = new LinkedList<>();
    
    public static void adicionarFila(String arquivo) {
        if(fila.size() > 3) {
            System.out.println("FILA CHEIA");
        }else {
            fila.add(arquivo);
        }
    }
    
    public static String getArquivo() {
        return fila.getFirst();
    }
    
    public static void excluir() {
        fila.remove(1);
    }
    
    public static boolean isFilaVazia() {
        return fila.isEmpty();
    }
}
