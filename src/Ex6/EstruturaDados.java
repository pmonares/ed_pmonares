/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex6;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class EstruturaDados {

    private Paciente[] paciente;
    private int nItems = 0;
    private int qtdeFila;

    public EstruturaDados(int qtdeFila) {
        this.qtdeFila = 0;
        paciente = new Paciente[qtdeFila];

    }

    /* inserção */
    public void insert(Paciente item)
    {
 try {
        int j;
        if (nItems == 0) 
        {
             paciente[nItems++] = item;
        } 
        else {
            
            for (j = nItems - 1; j >= 0; j--) {
                if (item.getPri() >= paciente[j].getPri()) {
                    paciente[j + 1] = paciente[j];
                } else {
                    break;
                    

                }
            }  // end for
            paciente[j + 1] = item;
            nItems++;
            
        }
      }
 
 catch(ArrayIndexOutOfBoundsException e) 
         {
         JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e);
         }
    }
 

     public Paciente remove() {
        return paciente[--nItems];
    }
        public boolean isFull()          // vê se esta cheio!!!
      { return (nItems == qtdeFila); }
     

}
