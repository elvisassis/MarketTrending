/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.C;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Supermercado;

/**
 *
 * @author elvis
 */
public class SupermercadoDao {
    
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    public List<Supermercado> findAll() throws ClassNotFoundException, SQLException{
        
        List <Supermercado> supermercados = new ArrayList<>();
        Supermercado u = null;
        sql = "SELECT * FROM supermercado;";
        con = C.cb();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){
            u = new Supermercado();
            u.setId_sup(rs.getInt("id_sup"));
            u.setId_google(rs.getString("id_google"));
            u.setNome(rs.getString("nome"));
           
            supermercados.add(u);
        }
        C.db();
        return supermercados;
    }
    
}
