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
public class Impressora extends Thread{
    
    private String arquivo;
    private boolean mandouArquivo;

    public Impressora() {
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    
    public Impressora (String arquivo) {
        this.arquivo = arquivo;
    }
    
    public void run() {
        try {
            while(Servidor.isFilaVazia()) {
                wait();
            }
            
            imprimir(Servidor.getArquivo());
        } catch (InterruptedException ex) {
            Logger.getLogger(Impressora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void imprimir(String arquivo) throws InterruptedException {
        System.out.println(arquivo);
        Servidor.excluir();
        Thread.sleep(500);
    }
}
