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
import modelo.Usuario;

/**
 *
 * @author elvis
 */
public class UsuarioDao {
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    public List<Usuario> findAll() throws ClassNotFoundException, SQLException{
        
        List <Usuario> usuarios = new ArrayList<>();
        Usuario u= null;
        sql = "SELECT * FROM usuario;";
        con = C.cb();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){
            u = new Usuario();
            u.setId(rs.getInt("id_user"));
            u.setNome(rs.getString("nome"));
            u.setEmail(rs.getString("email"));
            u.setSenha(rs.getString("senha"));
            
            usuarios.add(u);
        }
        C.db();
        return usuarios;
    }
    
}
