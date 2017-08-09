/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author elvis
 */
public class Supermercado {
    
    private int id_sup;
    private String id_google;
    private String nome;

    public Supermercado() {
    }

    public Supermercado(int id_sup, String id_google, String nome) {
        this.id_sup = id_sup;
        this.id_google = id_google;
        this.nome = nome;
    }

    public int getId_sup() {
        return id_sup;
    }

    public void setId_sup(int id_sup) {
        this.id_sup = id_sup;
    }

    public String getId_google() {
        return id_google;
    }

    public void setId_google(String id_google) {
        this.id_google = id_google;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
