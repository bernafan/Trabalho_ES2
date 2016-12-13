/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controller.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Material;


/**
 *
 * @author Bernardo
 */
public class MaterialDAO {
     private Connection connect;
    
    
    public MaterialDAO() {
        connect =  new ConnectionFactory().getConnection();
    }
    
    public void salvaMaterialNoBD(Material m) {
        String sql = "insert into materiais " +
            "(nome,descricao,custo_unitario)" +
            " values (?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connect.prepareStatement(sql);
            // seta os valores
            stmt.setString(1,m.getNome());
            stmt.setString(2,m.getDescricao());
            stmt.setDouble(3,m.getValorUnitario());
            
    // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Material> recuperaProdutos() {
        List<Material> materiais = new ArrayList<Material>();
        
        String sql = " select * from materiais";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Material m = new Material();
                m.setNome(rs.getString("NOME"));
                m.setDescricao(rs.getString("DESCRICAO"));
                m.setValorUnitario(rs.getDouble("CUSTO_UNITARIO"));
                
                materiais.add(m);
            }
            
            stmt.close();
            rs.close();
            
            return materiais;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
    
