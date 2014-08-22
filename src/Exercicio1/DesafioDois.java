/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */

class EstruturaDados{

   private final String[] a; 
   int nElemns;
  
     public EstruturaDados(int max)        
      {      a = new String[max]; 
             nElemns = 0;       
      }
    
     public void ColetarDados(String nome){
          a[nElemns] = nome;  
          nElemns++;
     }
     
     public void BuscaDados(String busca)             
      {
         int i;
         boolean teste = false;
         
           for (i = 0; i < nElemns; i++) {   
             
            if (a[i].charAt(0) == busca.charAt(0)) { 
                System.out.println("O nome " + a[i] + " começa com a letra " + busca ); 
                teste = true;
            }
            }
           if (!teste) { 
            System.out.println("Nenhum nome começa com a letra: " + busca);
           }
      }
     
     }


public class DesafioDois {
    
    public static void main(String[] args){
    
            
         EstruturaDados all;
         
         Scanner scan = new Scanner(System.in);
          Scanner scannome = new Scanner(System.in);
         
          System.out.println("Bem Vindo ao Programa de Vetores...");
          System.out.println("Digite a quantidade de posições do vetor: !!!");
          int max = scan.nextInt();
          all = new EstruturaDados(max);
          
          for (int i=0; i<max; i++ ){                
            System.out.println("Digite um nome!!!");
            all.ColetarDados(scannome.nextLine());
          }
          

            
          System.out.println("Digite uma letra!");
          all.BuscaDados(scannome.nextLine());
         

    
    
          
    }
    
    
}
