/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mfpasold
 */
public class Computador extends Thread{
    
    private String arquivo;
    private int numero;
    
    public Computador(String arquivo, int numero) {
        this.arquivo = arquivo;
        this.numero = numero;
    }
    
    public void run() {
        try {
            for(int i = 0; i < numero; i++) {
                enviarArquivo(arquivo);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Computador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void enviarArquivo(String arquivo) throws InterruptedException {
        Servidor.adicionarFila(arquivo);
        notify();
        Thread.sleep(500);
    }
}
