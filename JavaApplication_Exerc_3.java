/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_exerc;

import java.util.Scanner;

/**
 *
 * @author 2jdmtec
 */
public class JavaApplication_Exerc_3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i =0;
        int n1 = entrada.nextInt();
        int result = 0;
        while(i<= n1){
           result += i;
           i++;
           if(i <= n1)
            System.out.print("+" + i);
            
        }
        System.out.println(" = " +result);
    }

}