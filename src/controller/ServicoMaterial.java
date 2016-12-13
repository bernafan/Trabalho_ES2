/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.List;
import persistence.MaterialDAO;
import model.Material;

/**
 *
 * @author Bernardo
 */
public class ServicoMaterial {
    
    public void adicionaMaterial(String nome, String descricao, double valorUnitario) {
        Material material = new Material();
        material.setNome(nome);
        material.setDescricao(descricao);
        material.setValorUnitario(valorUnitario);

        adicionaDAO(material);
        System.out.println("material adicionado com sucesso!");
        
    }
    
    //Salvar no bd
    public static void adicionaDAO(Material m) {
           new MaterialDAO().salvaMaterialNoBD(m);
          
    }

    public void imprimeProdutos() {
        List<Material> materiais = new MaterialDAO().recuperaProdutos();
        
        for (Material material : materiais) {
            System.out.println(material);
        }
    }
    
}
