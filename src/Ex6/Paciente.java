/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex6;

/**
 *
 * @author Aluno
 */
public class Paciente {
    
    private String nome;
    private int prioridade;
 
    
    public Paciente (String nome,int prioridade){
    
    this.nome = nome;
    this.prioridade = prioridade;

    }
    
    public int getPri(){
        return prioridade;
    }
    
   public String getPaciente(){
   String consulta;
   return consulta = "Paciente: " + nome + " - Prioridade: " + prioridade;
   
   }
    
 
}
