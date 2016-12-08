/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_es2.controller;

import trabalho_es2.model.Item_Material;
import trabalho_es2.model.Material;

/**
 *
 * @author Bernardo
 */
public class ServicoMaterial {
    
    public void adicionaMaterial(String nome, String descricao, double valorUnitario, double valorVenda, int quantidade) {
        Material material = new Material();
        material.setNome(nome);
        material.setDescricao(descricao);
        material.setValorUnitario(valorUnitario);
        material.setValorVenda(valorVenda);
        
        Item_Material item = new Item_Material();
        item.setQtd(quantidade);
        
        adicionaDAO(material, item.getQtd());
        
    }
    
    
    public static void adicionaDAO(Material m, int quantidade) {
           new MaterialDAO().salvaMaterialNoBD(m, quantidade);
          
    }
    
}
