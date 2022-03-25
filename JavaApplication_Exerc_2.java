/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_exerc;

import static JavaApplication_Exerc.JavaApplication_Exerc.um;
import java.util.Scanner;

/**
 *
 * @author 2jdmtec
 */
public class JavaApplication_Exerc_2 {
    
    public static void main(String[] args) {
        
        // *Ler o número enquanto maior que 0 e mostrar a média dos positivos digitados
        
        System.out.print("Digite alguns números e mostraremos a média: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int i = 0;
        int soma = 0;
        int media = 0;
        
        while(num > 0){
            
            entrada = new Scanner(System.in);
            num = entrada.nextInt();
            
            if (num > 0){
                soma += num;
                i++;
            }
       }
        
        media = (soma/i);
        System.out.print("A média é: " + media);
    }
}
