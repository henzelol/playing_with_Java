/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.taetech.dal;

import java.sql.*;

/**
 *
 * @author jw
 */
public class ModuloConexao {
    //metodo responsavel pela conexão com o banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // chamar o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando info do banco
        String url = "jdbc:mysql://35.198.6.105:3306/dbtaetech?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "boladebola";
        // conexao com o db
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}
