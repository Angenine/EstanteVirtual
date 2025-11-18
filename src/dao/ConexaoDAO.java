/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection conectaBD() {
    Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/EstanteVirtual?user=root&password=123456";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
        System.out.println("Erro na conexão: " + e.getMessage());
        }
    return conn;
    }
}
