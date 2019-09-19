/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mfpasold
 */
public class Cronometro extends Thread {

    private int tempo;

    public Cronometro(int tempo) {
        this.tempo = tempo;
    }

    public void run() {
        try {
            for (int i = tempo; i > 0; i--) {
                System.out.println(i + " segundos");
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
