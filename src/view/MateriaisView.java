/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import controller.ServicoMaterial;

/**
 *
 * @author Bernardo
 */
public class MateriaisView {
    
  
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2  = new Scanner(System.in);
        ServicoMaterial servicos = new ServicoMaterial();
        //Atributos privates? ou não tem necessidade por ser somente auxiliar?
        String nome;
        String descricao;
        double precoUnitario;
        int fim = 0;
        
        
                
            System.out.println("Diga o nome do material para inclusão: ");
            nome = scan.nextLine();
            System.out.println("Diga uma descrição: ");
            descricao = scan.nextLine();

            System.out.println("Diga o preço de unitario(Ex: R$ 10,00 ): ");
            precoUnitario = scan.nextDouble();

            //chama um controle de serviço material, que adiciona um material ao serviço

            servicos.adicionaMaterial(nome, descricao, precoUnitario);

        
            servicos.imprimeProdutos();
    }
    
}
