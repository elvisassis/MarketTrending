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
import modelo.Favoritos;
import modelo.Supermercado;

/**
 *
 * @author elvis
 */
public class FavoritosDao {
    
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    /*public List<Supermercado> findAll(int user_id_user) throws ClassNotFoundException, SQLException{
        
        List <Favoritos> favoritos = new ArrayList<>();
        Favoritos u = null;
        sql = "SELECT s.* FROM supermercado AS s INNER JOIN favoritos as f ON s.id_sup = f.sup_id_sup INNER JOIN usuario as u ON f.user_id_user = u.id_user WHERE u.id_user = ?;";
        con = C.cb();
        pst = con.prepareStatement(sql);
        pst.setInt(1, user_id_user);
        rs = pst.executeQuery();
        while(rs.next()){
            u = new Favoritos();
            u.setUser_id_user(rs.getInt("user_id_user"));
            //u.setSup_id_sup(rs.getInt("sup_id_sup"));
           
            favoritos.add(u);
        }
        C.db();
        return favoritos;
    }*/
    
    public List<Supermercado> findAll(int user_id_user) throws ClassNotFoundException, SQLException{
        
        List <Supermercado> supermercados = new ArrayList<>();
        Supermercado u = null;
        sql = "SELECT s.* FROM supermercado AS s INNER JOIN favoritos as f ON s.id_sup = f.sup_id_sup INNER JOIN usuario as u ON f.user_id_user = u.id_user WHERE u.id_user = ?;";
        con = C.cb();
        pst = con.prepareStatement(sql);
        pst.setInt(1, user_id_user);
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
