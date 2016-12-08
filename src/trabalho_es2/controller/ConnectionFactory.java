/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_es2.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bernardo
 */
class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:derby://localhost:1527/es", "root", "root");
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco");
            throw new RuntimeException(e);
        }
    }
}
