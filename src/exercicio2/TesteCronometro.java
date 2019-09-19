/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author mfpasold
 */
public class TesteCronometro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int tempo = Integer.parseInt(teclado.nextLine());
        
        Cronometro cronometro = new Cronometro(tempo);
        cronometro.start();
    }
}
