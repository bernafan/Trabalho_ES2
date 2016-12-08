/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_es2.view;

import java.util.Scanner;
import trabalho_es2.controller.ServicoMaterial;

/**
 *
 * @author Bernardo
 */
public class MateriaisView {
    
  
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        String descricao;
        int qtd;
        double precoUnitario;
        double precoUnitarioVenda;
        
        System.out.println("Diga o nome do material para inclusão: ");
        nome = scan.nextLine();
        System.out.println("Diga uma descricao: ");
        descricao = scan.nextLine();
        System.out.println("Diga a quantidade do material: ");
        qtd = scan.nextInt();
        System.out.println("Diga o preço de custo: ");
        precoUnitario = scan.nextDouble();
        System.out.println("Diga o valor de venda do material: ");
        precoUnitarioVenda = scan.nextDouble();
        
        ServicoMaterial servicos = new ServicoMaterial();
        servicos.adicionaMaterial(nome, descricao, precoUnitario, precoUnitarioVenda, qtd);
        
    }
    
}
