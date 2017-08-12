/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avaliacoes {

@SerializedName("id_avaliacao")
@Expose
private Integer idAvaliacao;
@SerializedName("hortifrut")
@Expose
private Integer hortifrut;
@SerializedName("padaria")
@Expose
private Integer padaria;
@SerializedName("acougue")
@Expose
private Integer acougue;
@SerializedName("frios")
@Expose
private Integer frios;
@SerializedName("caixa")
@Expose
private Integer caixa;
@SerializedName("comentarios")
@Expose
private String comentarios;
@SerializedName("sup_id_sup")
@Expose
private Integer supIdSup;
@SerializedName("user_id_user")
@Expose
private Integer userIdUser;

public Integer getIdAvaliacao() {
return idAvaliacao;
}

public void setIdAvaliacao(Integer idAvaliacao) {
this.idAvaliacao = idAvaliacao;
}

public Integer getHortifrut() {
return hortifrut;
}

public void setHortifrut(Integer hortifrut) {
this.hortifrut = hortifrut;
}

public Integer getPadaria() {
return padaria;
}

public void setPadaria(Integer padaria) {
this.padaria = padaria;
}

public Integer getAcougue() {
return acougue;
}

public void setAcougue(Integer acougue) {
this.acougue = acougue;
}

public Integer getFrios() {
return frios;
}

public void setFrios(Integer frios) {
this.frios = frios;
}

public Integer getCaixa() {
return caixa;
}

public void setCaixa(Integer caixa) {
this.caixa = caixa;
}

public String getComentarios() {
return comentarios;
}

public void setComentarios(String comentarios) {
this.comentarios = comentarios;
}

public Integer getSupIdSup() {
return supIdSup;
}

public void setSupIdSup(Integer supIdSup) {
this.supIdSup = supIdSup;
}

public Integer getUserIdUser() {
return userIdUser;
}

public void setUserIdUser(Integer userIdUser) {
this.userIdUser = userIdUser;
}

}


/*public class Avaliacoes {
    
    private int id_avaliacao;
    private int hortifrut;
    private int padaria;
    private int acougue;
    private int frios;
    private int caixa;
    private String comentarios;
    private int sup_id_sup;
    private int user_id_user;

    public Avaliacoes() {
    }

    public Avaliacoes(int id_avaliacao, int hortifrut, int padaria, int acougue, int frios, int caixa, String comentarios, int sup_id_sup, int user_id_user) {
        this.id_avaliacao = id_avaliacao;
        this.hortifrut = hortifrut;
        this.padaria = padaria;
        this.acougue = acougue;
        this.frios = frios;
        this.caixa = caixa;
        this.comentarios = comentarios;
        this.sup_id_sup = sup_id_sup;
        this.user_id_user = user_id_user;
    }
    
    

    public int getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(int id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public int getHortifrut() {
        return hortifrut;
    }

    public void setHortifrut(int hortifrut) {
        this.hortifrut = hortifrut;
    }

    public int getPadaria() {
        return padaria;
    }

    public void setPadaria(int padaria) {
        this.padaria = padaria;
    }

    public int getAcougue() {
        return acougue;
    }

    public void setAcougue(int acougue) {
        this.acougue = acougue;
    }

    public int getFrios() {
        return frios;
    }

    public void setFrios(int frios) {
        this.frios = frios;
    }

    public int getCaixa() {
        return caixa;
    }

    public void setCaixa(int caixa) {
        this.caixa = caixa;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getSup_id_sup() {
        return sup_id_sup;
    }

    public void setSup_id_sup(int sup_id_sup) {
        this.sup_id_sup = sup_id_sup;
    }

    public int getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(int user_id_user) {
        this.user_id_user = user_id_user;
    }
    
    
    
    
}*/
