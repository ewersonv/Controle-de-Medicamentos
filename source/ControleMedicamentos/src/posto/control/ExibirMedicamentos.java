/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posto.control;

import posto.modelo.Medicamento;

/**
 *
 * @author tadeu
 */
public class ExibirMedicamentos {
    
    public void exibirMedicamentos(Medicamento aMedicamento){
            
        System.out.println("Medicamento: " + aMedicamento.getNome()+
            "\nDescrição: " + aMedicamento.getDescricao()+ "\nLote: " + aMedicamento.getLote()+
            "\nValidade"+ aMedicamento.getValidade()
            );
    }
}