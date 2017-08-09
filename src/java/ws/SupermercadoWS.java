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
import dao.SupermercadoDao;
import java.sql.SQLException;
import java.util.List;
import modelo.Supermercado;

/**
 * REST Web Service
 *
 * @author elvis
 */
@Path("supermercado")
public class SupermercadoWS {

    @Context
    private UriInfo context;

    
    public SupermercadoWS() {
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Teste";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/supermercados")
    public String findAll() throws ClassNotFoundException, SQLException{
        Gson g = new Gson();
        SupermercadoDao dao = new SupermercadoDao();
        List<Supermercado> supermercados = dao.findAll();
        
        return g.toJson(supermercados);
        
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
