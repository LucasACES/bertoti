package org.giveawaydognation;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/")
public class Controller {

	
	Model model = new Model();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{raca}/{idade}")
    public Response dog1(@PathParam String raca, @PathParam String idade) {	
		List<Dog> dogEncontrado = model.buscarDog(raca, idade);	
		String json = new Gson().toJson(dogEncontrado);
    	return Response.status(200).entity(json).build();	
    }
	
//	@GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("{modelo}")
//    public Response carro3(@PathParam String modelo) {	
//		List<Carro> carrosEncontrados = model.buscarModelo(modelo);	
//		String json = new Gson().toJson(carrosEncontrados);
//    	return Response.status(200).entity(json).build();	
//    }
//	
//	
//	
//	
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "Hello RESTEasymmmmmmm";
//    }
}