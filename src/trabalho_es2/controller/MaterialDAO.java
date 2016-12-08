/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_es2.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import trabalho_es2.model.Material;


/**
 *
 * @author Bernardo
 */
class MaterialDAO {
     private Connection connect;
    
    
    public MaterialDAO() {
        connect =  new ConnectionFactory().getConnection();
    }
    
    public void salvaMaterialNoBD(Material m, int quantidade) {
        String sql = "insert into materiais " +
            "(nome,descricao,custo_unitario,custo_venda, quantidade)" +
            " values (?,?,?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connect.prepareStatement(sql);
            // seta os valores
            stmt.setString(1,m.getNome());
            stmt.setString(2,m.getDescricao());
            stmt.setDouble(3,m.getValorUnitario());
            stmt.setDouble(4, m.getValorVenda());
            stmt.setInt(5, quantidade);
            
            
    // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
