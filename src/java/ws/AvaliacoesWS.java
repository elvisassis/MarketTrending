/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import dao.AvaliacoesDao;
import java.sql.SQLException;
import java.util.List;
import modelo.Avaliacoes;

/**
 * REST Web Service
 *
 * @author elvis
 */
@Path("avaliacao")
public class AvaliacoesWS {

    @Context
    private UriInfo context;

    
    public AvaliacoesWS() {
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Teste";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/avaliacoes")
    public String findAll() throws ClassNotFoundException, SQLException{
        Gson g = new Gson();
        AvaliacoesDao dao = new AvaliacoesDao();
        List<Avaliacoes> avaliacoes = dao.findAll();
        
        return g.toJson(avaliacoes);
        
    }

    /**
     * PUT method for updating or creating an instance of UsuarioWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
