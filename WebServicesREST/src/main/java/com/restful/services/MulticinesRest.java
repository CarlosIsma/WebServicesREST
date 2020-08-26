
package com.restful.services;

import com.restful.entidades.Multicines;
import com.restful.session.MulticinesFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//CON ESTE PATH SE SABE QUE VA A ENTRAR A ESTA CLASE
@Path("Multicines")
public class MulticinesRest {
   
    @EJB
    private MulticinesFacade multicinesFacade;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Multicines> findAll() {
        return multicinesFacade.findAll();
    }
    
     @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Multicines findById(@PathParam("id") Integer id) {
        return multicinesFacade.find(id);
    }
    
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        multicinesFacade.remove(multicinesFacade.find(id));
        
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Multicines multicines) {
        multicinesFacade.create(multicines);
        
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Multicines multicines) {
        
        multicinesFacade.edit(multicines);
    }
}
