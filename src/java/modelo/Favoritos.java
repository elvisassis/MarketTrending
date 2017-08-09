/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author elvis
 * user_id_user` INT NOT NULL,
  `sup_id_sup` INT NOT NULL,
 */
public class Favoritos {
    private int user_id_user;
    private int sup_id_sup;

    public Favoritos() {
    }

    public Favoritos(int user_id_user, int sup_id_sup) {
        this.user_id_user = user_id_user;
        this.sup_id_sup = sup_id_sup;
    }
    
    

    public int getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(int user_id_user) {
        this.user_id_user = user_id_user;
    }

    public int getSup_id_sup() {
        return sup_id_sup;
    }

    public void setSup_id_sup(int sup_id_sup) {
        this.sup_id_sup = sup_id_sup;
    }
    
}
