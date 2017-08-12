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
import modelo.Avaliacoes;

/**
 *
 * @author elvis
 * id_avaliacao` INT NOT NULL AUTO_INCREMENT,
  `hortifrut` INT NULL,
  `padaria` INT NULL,
  `acougue` INT NULL,
  `frios` INT NULL,
  `caixa` INT NULL,
  `comentarios` TEXT(300) NULL,
  `sup_id_sup` INT NOT NULL,
  `user_id_user` INT NOT NULL
 */
public class AvaliacoesDao {
    
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    public List<Avaliacoes> find(int sup_id_sup) throws ClassNotFoundException, SQLException{
        
        List <Avaliacoes> avaliacoes = new ArrayList<>();
        
        Avaliacoes u = null;
        sql = "SELECT * FROM avaliacoes WHERE sup_id_sup = ?;";
        con = C.cb();
        pst = con.prepareStatement(sql);
        pst.setInt(1, sup_id_sup);
        rs = pst.executeQuery();
        while(rs.next()){
            u = new Avaliacoes();
           
            u.setIdAvaliacao(rs.getInt("id_avaliacao"));
            u.setHortifrut(rs.getInt("hortifrut"));
            u.setPadaria(rs.getInt("padaria"));
            u.setAcougue(rs.getInt("acougue"));
            u.setFrios(rs.getInt("frios"));
            u.setCaixa(rs.getInt("caixa"));
            u.setComentarios(rs.getString("comentarios"));
            u.setSupIdSup(rs.getInt("sup_id_sup"));
            u.setUserIdUser(rs.getInt("user_id_user"));
            
            
            avaliacoes.add(u);
        }
        C.db();
        return avaliacoes;
    }
    
}
