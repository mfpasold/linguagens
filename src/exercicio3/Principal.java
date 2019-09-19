/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author mfpasold
 */
public class Principal {
    
    public static void main(String[] args) {
        Computador c1 = new Computador("Arquivo", 2);
        Computador c2 = new Computador("Arquivo2", 3);
        c1.start();
        c2.start();
        
        Impressora i1 = new Impressora(Servidor.getArquivo());
        Impressora i2 = new Impressora(Servidor.getArquivo());
    }
    
}
