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
import dao.FavoritosDao;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.PathParam;
import modelo.Favoritos;
import modelo.Supermercado;

/**
 * REST Web Service
 *
 * @author elvis
 */
@Path("favorito")
public class FavoritosWS {

    @Context
    private UriInfo context;

    
    public FavoritosWS() {
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Teste";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/{id_user}")
    public String findAll(@PathParam("id_user") Integer id_user) throws ClassNotFoundException, SQLException{
        Gson g = new Gson();
        FavoritosDao dao = new FavoritosDao();
        List<Supermercado> favoritos = dao.findAll(id_user);
        
        return g.toJson(favoritos);
        
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
